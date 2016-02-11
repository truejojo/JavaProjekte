package de.jojo;
import javax.swing.JOptionPane;

public class Spieleranzahl
{
	private int spieleranzahl;
	
	Spieleranzahl()
	{
		this.spieleranzahl = 0;
	}
	
	public void frageSpieleranzahlAb()
	{
		this.spieleranzahl = Integer.parseInt
			(JOptionPane.showInputDialog("Wie viele Spieler wollen spielen?"));
	}
	
	public void frageSpieleranzahlAb(int spieleranzahl)
	{
		this.spieleranzahl = spieleranzahl;
	}
	
	public int gebeSpieleranzahl()
	{
		return this.spieleranzahl;
	}
}
