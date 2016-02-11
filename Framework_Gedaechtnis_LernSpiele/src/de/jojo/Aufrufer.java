package de.jojo;

public class Aufrufer
{
	private SpieleAuswahl spieleAuswahl;
	
	public void setzeSpieleAuswahl(SpieleAuswahl spieleAuswahl)
	{
		this.spieleAuswahl = spieleAuswahl;
	}
	
	public void spiele()
	{
		this.spieleAuswahl.ausfuehren();
	}
}
