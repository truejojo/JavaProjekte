package de.jojo;

public class RundenVergleich
{
	private RichtigerWert richtigerWert;
//	private RundenRichtigZaehler rundenRichtigZaehler;
	
	public void setzeRichtigerWert(RichtigerWert richtigerWert)
	{
		this.richtigerWert = richtigerWert;
	}
	/*
	public void setzeRundenRichtigZaehler(RundenRichtigZaehler rudenRichtigZaehler)
	{
		this.rundenRichtigZaehler = rudenRichtigZaehler;
	}
	*/
	public boolean gebeZeichenkettenVergleichRichtigOderFalschAus()
	{
		if(this.richtigerWert.gebeRichtigerWert())
			return true;
		else
			return false;
	}
	/*
	public void erhoeheRundenRichtigZaehlerBeiRichtig()
	{
		if(this.gebeZeichenkettenVergleichRichtigOderFalschAus())
			this.rundenRichtigZaehler.erhoeheRundenRichtigZaehler();
	}
	
	public void erhoeheRundenRichtigZaehlerBeiRichtig(Spieler spieler)
	{
		RundenRichtigZaehler rundenRichtigZaehler = (RundenRichtigZaehler)
			spieler.gebeSpielerEigenschaften("rundenrichtigzaehler");
		rundenRichtigZaehler.erhoeheRundenRichtigZaehler();
	}
	*/
}
