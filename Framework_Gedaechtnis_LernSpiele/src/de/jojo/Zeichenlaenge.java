package de.jojo;
import javax.swing.JOptionPane;

public class Zeichenlaenge
{
	private int zeichenlaenge;
	
	public void frageZeichenLaengeAb(int zeichenlaenge)
	{
		this.zeichenlaenge = zeichenlaenge;
	}
	
	private void frageZeichenLaengeAb(Spieler spieler)
	{
		Name name = (Name)
			spieler.gebeSpielerEigenschaften("name");
		this.zeichenlaenge = Integer.parseInt
			(JOptionPane.showInputDialog("Hallo " + name.gebeNamen() +
					", mit wie vielen zeichen willst Du spielen?"));
	}
	
	public int gebeZeichenLaenge()
	{
		return this.zeichenlaenge;
	}
	
	public void erhoeheZeichenlaenge(ZeichenlaengeErhoeher zeichenlaengenErhoeher,
			ZaehlerVonZeichenlaenge zaehlerVonZeichenlaenge)
	{
		zeichenlaengenErhoeher.erhoeheZeichenlaenge(this, zaehlerVonZeichenlaenge);
	}
	
	public void richteZeichenLaengeEin(Spieler[] spieler)
	{
		for(int i=0; i<spieler.length; i++)
		{
			Zeichenlaenge zeichenlaenge = (Zeichenlaenge)
				spieler[i].gebeSpielerEigenschaften("zeichenlaenge");
			zeichenlaenge.frageZeichenLaengeAb(spieler[i]);
		}
	}
}
