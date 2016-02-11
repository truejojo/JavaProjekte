package de.jojo;
import java.util.*;

public class SpielTypSilbenlaengeAufbauend extends SpielTyp
{
	private Name name;
	private Zeichenlaenge zeichenlaenge;
	private ZaehlerVonZeichenlaenge zaehlerVonZeichenlaenge;
	private ZufallsZeichenkette zufallsZeichenkette;
	private ZeichenketteEingabe zeichenketteEingabe;
	private RundenRichtigZaehler rundenRichtigZaehler;
	private RichtigerWert richtigerWert;
	private RundenVergleich rundenVergleich;
	private ZeichenketteArray zeichenketteArray;
	private Zeichenfolge zeichenfolge;
	private ZeichenlaengeErhoeher zeichenlaengeErhoeher;
	
	SpielTypSilbenlaengeAufbauend(Map<String, Object> eigenschaften)
	{
		super(eigenschaften);
	}
	
	public void richteSpielerEin()
	{
		name = (Name)
			this.gebeSpieler().gebeSpielerEigenschaften("name");
		name.frageNamenAb();
		
		zeichenlaenge = (Zeichenlaenge)
			this.gebeSpieler().gebeSpielerEigenschaften("zeichenlaenge");
		zeichenlaenge.frageZeichenLaengeAb(1);
	}
	
	public void richteSpielEin()
	{
		zaehlerVonZeichenlaenge = (ZaehlerVonZeichenlaenge)
			this.gebeSpielEigenschaften("zaehlervonzeichenlaenge");
		zaehlerVonZeichenlaenge.setzeZaehlerVonZeichenlaenge(zeichenlaenge.gebeZeichenLaenge());
	
		zufallsZeichenkette = (ZufallsZeichenkette)
			this.gebeSpielEigenschaften("zufallszeichenkette");
		
		zeichenketteEingabe = (ZeichenketteEingabe)
			this.gebeSpieler().gebeSpielerEigenschaften("zeichenketteeingabe");
		
		rundenRichtigZaehler = (RundenRichtigZaehler)
			this.gebeSpieler().gebeSpielerEigenschaften("rundenrichtigzaehler");
		
		richtigerWert = (RichtigerWert)
			this.gebeSpielEigenschaften("richtigerwert");	
		
		rundenVergleich = (RundenVergleich)
	 		this.gebeSpielEigenschaften("rundenvergleich");
			
		ZeichenketteArrayFabrik zeichenketteArrayFabrik = (ZeichenketteArrayFabrik) 
			this.gebeSpielEigenschaften("zeichenkettearrayfabrik");
		zeichenketteArray = zeichenketteArrayFabrik.erstelleZeichenkette(
			this.gebeSpielEigenschaften("zeichenkettearray").toString());
		
		ZeichenfolgeFabrik zeichenfolgeFabrik = (ZeichenfolgeFabrik)
			this.gebeSpielEigenschaften("zeichenfolgefabrik");
		zeichenfolge = zeichenfolgeFabrik.erstelleZeichenfolge(
			this.gebeSpielEigenschaften("zeichenfolge").toString());
		
		ZeichenlaengeErhoeherFabrik zeichenlaengeErhoeherFabrik = (ZeichenlaengeErhoeherFabrik)
			this.gebeSpielEigenschaften("zeichenlaengeerhoeherfabrik");
		zeichenlaengeErhoeher = zeichenlaengeErhoeherFabrik.erstelleZeichenlaengenErhoeher(
			this.gebeSpielEigenschaften("zeichenlaengeerhoeher").toString());
	}
	
	public void spielen()
	{		
		while(richtigerWert.gebeRichtigerWert())
		{	
			zufallsZeichenkette.erstelleZeichenfolge(zeichenketteArray, zeichenfolge, zeichenlaenge);
			zufallsZeichenkette.gebeGenerierteZufallsZeichenkette(this.gebeSpieler());
			
			zeichenketteEingabe.frageZeichenketteAb();
			
			richtigerWert.setzeRichtigerWert(zufallsZeichenkette.vergleicheZeichenketten(zeichenketteEingabe));
			
			rundenVergleich.setzeRichtigerWert(richtigerWert);
			rundenRichtigZaehler.setzeRundenVergleich(rundenVergleich);
			rundenRichtigZaehler.erhoeheRundenRichtigZaehlerBeiRichtig();
			
			zeichenlaenge.erhoeheZeichenlaenge(zeichenlaengeErhoeher, zaehlerVonZeichenlaenge);
		}
		RundenAusgabe rundenAusgabe = (RundenAusgabe)
			this.gebeSpielEigenschaften("rundenausgabe");
		rundenAusgabe.gebeGeschaffteRundenanzahlAus(this.gebeSpieler());
	}
}
