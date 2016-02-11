package de.jojo;
import javax.swing.JOptionPane;

public class RundenanzahlStatic
{
	private static int RUNDENANZAHL;
	
	RundenanzahlStatic()
	{
		RUNDENANZAHL = 0;
	}
	
	public void frageRundenanzahlAb()
	{
		RUNDENANZAHL = Integer.parseInt
			(JOptionPane.showInputDialog("Wie viele Runden soll gespielt werden?"));
	}
	
	public int gebeRundenanzahl()
	{
		return RUNDENANZAHL;
	}
}
