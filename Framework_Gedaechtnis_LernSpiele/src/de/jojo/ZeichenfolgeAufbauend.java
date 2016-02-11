package de.jojo;

public class ZeichenfolgeAufbauend implements Zeichenfolge
{
	public void erstelleZeichenfolge(ZufallsZeichenkette zufallsZeichenkette,
			ZeichenketteArray zeichenketteArray, Zeichenlaenge zeichenlaenge)
	{
		for(int i=0; i<zeichenlaenge.gebeZeichenLaenge(); i++)
		{
			zufallsZeichenkette.erzeugeZufallsZeichen(zeichenketteArray);
		}
	}
}
