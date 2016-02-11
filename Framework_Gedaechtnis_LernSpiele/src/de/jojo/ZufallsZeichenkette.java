package de.jojo;

public class ZufallsZeichenkette
{
	private ZeichenketteEingabe zeichenketteEingabe;
	
	ZufallsZeichenkette()
	{
		this.erzeugeZeichenketteEingabe();
	}
	
	public void erzeugeZeichenketteEingabe()
	{
		this.zeichenketteEingabe = new ZeichenketteEingabe();
	}

	public void gebeGenerierteZufallsZeichenkette(Spieler spieler)
	{
		this.zeichenketteEingabe.gebeZeichenkette(spieler);
	}
	
	public boolean vergleicheZeichenketten(Zeichenkette zeichenkette)
	{
		return this.zeichenketteEingabe.gebeZeichenkette().equalsIgnoreCase
			(zeichenkette.gebeZeichenkette());
	}
	
//	extra class ?
	public void erzeugeZufallsZeichen(ZeichenketteArray zeichenketteArray)
	{
		ZeichenketteArrayIterator iterator = zeichenketteArray.gebeZeichenketteArrayIterator();
		
		while(iterator.hasNext())
		{
			this.zeichenketteEingabe.frageZeichenketteAb(this.zeichenketteEingabe.gebeZeichenkette()+
				iterator.gebeZeichenkette().charAt((int) (Math.random() *
					iterator.gebeZeichenkette().length() )));
			iterator.erhoehePosition();
		}
	}
	
	public void erstelleZeichenfolge(ZeichenketteArray zeichenketteArray,
			Zeichenfolge zeichenfolge, Zeichenlaenge zeichenlaenge)
	{	
		zeichenfolge.erstelleZeichenfolge(this, zeichenketteArray, zeichenlaenge);
	}
}
