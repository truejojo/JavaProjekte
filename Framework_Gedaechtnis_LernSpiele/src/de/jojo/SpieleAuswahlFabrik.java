package de.jojo;

public class SpieleAuswahlFabrik
{
	private SpieleAuswahlFabrik()
	{}
	
	public static SpieleAuswahl erstelleSpieleAuswahl
		(EnumSpieleAuswahl auswahl, SpielLaden spielLaden, EnumGedaechtnisSpieleAuswahl spiel)
	{
		SpieleAuswahl spieleAuswahl = null;
		String spieleName = auswahl.toString();
		
		if(spieleName.equals("gedaechtnisspiele"))
			spieleAuswahl = new SpieleAuswahlGedaechtnisSpiele(spielLaden, spiel);
		else
			return null;
		return spieleAuswahl;
	}
}
