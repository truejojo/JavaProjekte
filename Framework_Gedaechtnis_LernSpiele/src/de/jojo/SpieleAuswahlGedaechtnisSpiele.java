package de.jojo;

public class SpieleAuswahlGedaechtnisSpiele implements SpieleAuswahl
{
	private SpielLaden spielLaden;
	private SpieleFabrik spieleFabrik;
		
	SpieleAuswahlGedaechtnisSpiele(SpielLaden spielLaden, EnumGedaechtnisSpieleAuswahl spiel)
	{
		this.spielLaden = spielLaden;
		this.spieleFabrik = new SpieleFabrik(spiel);
	}
	
	public void ausfuehren()
	{
		this.spielLaden.spieleSpiel(this.spieleFabrik.gebeMapMitEigenschaftenFuerGedaechtnisSpiel());
	}
}
