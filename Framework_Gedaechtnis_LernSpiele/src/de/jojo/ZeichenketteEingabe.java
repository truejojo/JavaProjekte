package de.jojo;
import javax.swing.JOptionPane;

public class ZeichenketteEingabe implements Zeichenkette
{
	private String zeichenkette;
	
	ZeichenketteEingabe()
	{
		this.zeichenkette = "";
	}
	
	public String gebeZeichenkette()
	{
		return this.zeichenkette;
	}
	
	public void gebeZeichenkette(Spieler spieler)
	{
		Name namen = (Name)
			spieler.gebeSpielerEigenschaften("name");
		JOptionPane.showMessageDialog(null, "Hallo " + namen.gebeNamen() +
			" deine Zeichenkette:\n" + this.zeichenkette);
	}
	
	public void frageZeichenketteAb()
	{
		this.zeichenkette = JOptionPane.showInputDialog
			("Bitte gebe hier Deine Zeichenkette ein:");
	}
	
	public void frageZeichenketteAb(String zeichenkette)
	{
		this.zeichenkette = zeichenkette;
	}
}
