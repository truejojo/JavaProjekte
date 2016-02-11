package de.jojo;
import javax.swing.JOptionPane;

public class Name
{
	private String name;
	
	public void frageNamenAb()
	{
		this.name = JOptionPane.showInputDialog("Bitte gebe Deinen Namen ein:");
	}
	
	public String gebeNamen()
	{
		return this.name;
	}
	
	public void richteNamenEin(Spieler[] spieler)
	{
		for(int i=0; i<spieler.length; i++)
		{
		Name namen = (Name)
			spieler[i].gebeSpielerEigenschaften("name");
		namen.frageNamenAb();
		}
	}
}
