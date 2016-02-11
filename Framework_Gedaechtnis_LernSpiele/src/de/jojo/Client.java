package de.jojo;

public class Client
{
	/* 
	 * Client abstract und dann einen konkreten der eine fabrik
	 * medtode besitzt...
	 * wie: abstract SpielLaden und SpielLadenTyp!!
	 * was ist hier besser? Vererbung oder Komposition bzw. Delegation
	 */
	
	public void erzeugeSpiel(EnumGedaechtnisSpieleAuswahl spiel, EnumSpieleAuswahl auswahl)
	{
		Aufrufer aufrufer = new Aufrufer();
		SpielLaden spielLaden = new SpielLadenTyp();
		
		SpieleAuswahl gedaechtnisSpiel = SpieleAuswahlFabrik.erstelleSpieleAuswahl
			(auswahl, spielLaden, spiel);
		
		aufrufer.setzeSpieleAuswahl(gedaechtnisSpiel);
		aufrufer.spiele();
	}
}
