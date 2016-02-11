package de.jojo;

public class RundenRichtigZaehler
{
	private int rundenRichtigZaehler;
	private RundenVergleich rundenVergleich;
	
	RundenRichtigZaehler()
	{
		this.rundenRichtigZaehler = 0;
	}

	public void setzeRundenVergleich(RundenVergleich rundenVergleich)
	{
		this.rundenVergleich = rundenVergleich;
	}

	public int gebeRundenRichtigZaehlerZurueck()
	{
		return this.rundenRichtigZaehler;
	}
	
	public void erhoeheRundenRichtigZaehler()
	{
		this.rundenRichtigZaehler++;
	}

	public void erhoeheRundenRichtigZaehlerBeiRichtig()
	{
		if(this.rundenVergleich.gebeZeichenkettenVergleichRichtigOderFalschAus())
			this.erhoeheRundenRichtigZaehler();
	}
	
	public void erhoeheRundenRichtigZaehlerBeiRichtig(Spieler spieler)
	{
		RundenRichtigZaehler rundenRichtigZaehler = (RundenRichtigZaehler)
			spieler.gebeSpielerEigenschaften("rundenrichtigzaehler");
		rundenRichtigZaehler.erhoeheRundenRichtigZaehler();
	}
}
