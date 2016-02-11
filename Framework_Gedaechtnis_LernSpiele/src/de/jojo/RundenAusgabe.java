package de.jojo;
import javax.swing.JOptionPane;

public class RundenAusgabe
{
	private RundenVergleich rundenVergleich;
	private RundenRichtigZaehler rundenRichtigeZaehler;
	
	RundenAusgabe()
	{
		this.rundenRichtigeZaehler = new RundenRichtigZaehler();
	}
	
	public void setzeRundenVergleich(RundenVergleich rundenVergleich)
	{
		this.rundenVergleich = rundenVergleich;
	}
	
	public void gebeRundeRichtigOderFalschAus(Spieler spieler)
	{
		if(this.rundenVergleich.gebeZeichenkettenVergleichRichtigOderFalschAus())
			this.gebeRundeRichtigAus(spieler);
		else
			this.gebeRundeFalschAus(spieler);
	}
		
	private void gebeRundeRichtigAus(Spieler spieler)
	{
		JOptionPane.showMessageDialog(null, "richtig, SUPER!!");
		this.rundenRichtigeZaehler.erhoeheRundenRichtigZaehlerBeiRichtig(spieler);
	}
	
	private void gebeRundeFalschAus(Spieler spieler)
	{
		JOptionPane.showMessageDialog(null, "schade, war leider falsch");
	}
	
	public void gebeRundenEndErgebnisAus(Spieler[] spieler, RundenanzahlStatic rundenanzahlStatic)
	{
		for(int i=0; i<spieler.length; i++)
		{
			Name namen = (Name)
				spieler[i].gebeSpielerEigenschaften("name");	
			
			RundenRichtigZaehler rundenRichtigZaehler = (RundenRichtigZaehler)
				spieler[i].gebeSpielerEigenschaften("rundenrichtigzaehler");
			
			JOptionPane.showMessageDialog(null, "Hallo "+namen.gebeNamen()+" du hast "+
				rundenRichtigZaehler.gebeRundenRichtigZaehlerZurueck()+" von " +
					rundenanzahlStatic.gebeRundenanzahl()+" richtig!");
		}
	}

	public void gebeGeschaffteRundenanzahlAus(Spieler spieler)
	{
		Name namen = (Name)
			spieler.gebeSpielerEigenschaften("name");
		
		RundenRichtigZaehler rundenrichtigzaehler = (RundenRichtigZaehler)
			spieler.gebeSpielerEigenschaften("rundenrichtigzaehler");
		
		JOptionPane.showMessageDialog(null, "Hallo "+namen.gebeNamen()+" du hast "+
			rundenrichtigzaehler.gebeRundenRichtigZaehlerZurueck()+" richtig!");
	}
}
