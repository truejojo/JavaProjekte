package de.jojo;

public class ZeichenfolgeFabrik
{
	public Zeichenfolge erstelleZeichenfolge(String zeichenfolgeName)
	{
		Zeichenfolge zeichenfolge = null;
		
		if(zeichenfolgeName.equals("aufbauend"))
			zeichenfolge = new ZeichenfolgeAufbauend();
		else if(zeichenfolgeName.equals("immerneu"))
			zeichenfolge = new ZeichenfolgeImmerNeu();
		else
			return null;
		return zeichenfolge;
	}
}
