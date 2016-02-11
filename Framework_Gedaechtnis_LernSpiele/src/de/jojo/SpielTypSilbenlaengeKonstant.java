package de.jojo;
import java.util.*;

public class SpielTypSilbenlaengeKonstant extends SpielTyp
{
	private Spieler[] spielerGruppe;
	private Spieleranzahl spieleranzahl;
	private Name name;
	private RundenanzahlStatic rundenanzahlStatic;
	private Zeichenlaenge zeichenlaenge;
	private ZufallsZeichenkette zufallsZeichenkette;
	private RichtigerWert richtigerWert;
	private RundenVergleich rundenVergleich;
	private RundenAusgabe rundenAusgabe;
	private ZeichenketteArray zeichenketteArray;
	private Zeichenfolge zeichenfolge;
	
	SpielTypSilbenlaengeKonstant(Map<String, Object> eigenschaften)
	{
		super(eigenschaften);
	}
	
	public void richteSpielerEin()
	{
		spieleranzahl = (Spieleranzahl)
			this.gebeSpielEigenschaften("spieleranzahl");
		spieleranzahl.frageSpieleranzahlAb();
		
		this.spielerGruppe = new Spieler[spieleranzahl.gebeSpieleranzahl()];
		this.gebeSpieler().initialisiereSpieler(this.spielerGruppe);
		
		name = (Name)
			this.gebeSpieler().gebeSpielerEigenschaften("name");
		name.richteNamenEin(this.spielerGruppe);
		
		rundenanzahlStatic = (RundenanzahlStatic)
			this.gebeSpielEigenschaften("rundenanzahlstatic");
		rundenanzahlStatic.frageRundenanzahlAb();
		
		zeichenlaenge = (Zeichenlaenge)
			this.gebeSpieler().gebeSpielerEigenschaften("zeichenlaenge");
		zeichenlaenge.richteZeichenLaengeEin(this.spielerGruppe);
	}
	
	public void richteSpielEin()
	{
		zufallsZeichenkette = (ZufallsZeichenkette)
			this.gebeSpielEigenschaften("zufallszeichenkette");
	
		richtigerWert = (RichtigerWert)
			this.gebeSpielEigenschaften("richtigerwert");
		
		rundenVergleich = (RundenVergleich)
			this.gebeSpielEigenschaften("rundenvergleich");
		
		rundenAusgabe = (RundenAusgabe)
			this.gebeSpielEigenschaften("rundenausgabe");
		
		rundenanzahlStatic = (RundenanzahlStatic)
			this.gebeSpielEigenschaften("rundenanzahlstatic");	
		
		ZeichenketteArrayFabrik zeichenketteArrayFabrik = (ZeichenketteArrayFabrik) 
			this.gebeSpielEigenschaften("zeichenkettearrayfabrik");
		zeichenketteArray = zeichenketteArrayFabrik.erstelleZeichenkette(
			this.gebeSpielEigenschaften("zeichenkettearray").toString());
	
		ZeichenfolgeFabrik zeichenfolgeFabrik = (ZeichenfolgeFabrik)
			this.gebeSpielEigenschaften("zeichenfolgefabrik");
		zeichenfolge = zeichenfolgeFabrik.erstelleZeichenfolge(
			this.gebeSpielEigenschaften("zeichenfolge").toString());
	}
	
	public void spielen()
	{
		for(int i=0; i<rundenanzahlStatic.gebeRundenanzahl(); i++)	
		{
			for(int j=0; j<this.spielerGruppe.length; j++)
			{
				Zeichenlaenge zeichenlaenge = (Zeichenlaenge)
					this.spielerGruppe[j].gebeSpielerEigenschaften("zeichenlaenge");
				
				zufallsZeichenkette.erstelleZeichenfolge(zeichenketteArray, zeichenfolge, zeichenlaenge);
				zufallsZeichenkette.gebeGenerierteZufallsZeichenkette(this.spielerGruppe[j]);
				
				ZeichenketteEingabe zeichenketteEingabe = (ZeichenketteEingabe)
					this.spielerGruppe[j].gebeSpielerEigenschaften("zeichenketteeingabe");
				zeichenketteEingabe.frageZeichenketteAb();
				
				richtigerWert.setzeRichtigerWert(zufallsZeichenkette.vergleicheZeichenketten(zeichenketteEingabe));
				
				rundenVergleich.setzeRichtigerWert(richtigerWert);
				
				rundenAusgabe.setzeRundenVergleich(rundenVergleich);
				rundenAusgabe.gebeRundeRichtigOderFalschAus(this.spielerGruppe[j]);
			}
		}
		rundenAusgabe.gebeRundenEndErgebnisAus(this.spielerGruppe, rundenanzahlStatic);
	}
}
