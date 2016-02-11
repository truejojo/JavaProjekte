package de.jojo;

public class ZeichenfolgeImmerNeu implements Zeichenfolge
{	
	public void erstelleZeichenfolge(ZufallsZeichenkette zufallsZeichenkette,
			ZeichenketteArray zeichenketteArray, Zeichenlaenge zeichenlaenge)
	{	
		zufallsZeichenkette.erzeugeZeichenketteEingabe();
		for(int i=0; i<zeichenlaenge.gebeZeichenLaenge(); i++)
		{
			zufallsZeichenkette.erzeugeZufallsZeichen(zeichenketteArray);
		}
	}
}
