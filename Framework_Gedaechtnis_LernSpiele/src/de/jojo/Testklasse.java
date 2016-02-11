package de.jojo;

public class Testklasse
{	
	public static void main(String[] args)
	{
		Client client = new Client();
		client.erzeugeSpiel(EnumGedaechtnisSpieleAuswahl.KONSTANDMITZAHLEN,
				EnumSpieleAuswahl.GEDAECHTNISSPIELE);
	}
}
