package de.jojo;

public class ZeichenlaengeErhoeherFabrik
{
	public ZeichenlaengeErhoeher erstelleZeichenlaengenErhoeher(String zeichenlaengeErhoeherName)
	{
		ZeichenlaengeErhoeher zeichenlaengeErhoeher = null;
		
		if(zeichenlaengeErhoeherName.equals("aufbauend"))
			zeichenlaengeErhoeher = new ZeichenlaengeErhoeherAufbauend();
		else if(zeichenlaengeErhoeherName.equals("immerneu"))
			zeichenlaengeErhoeher = new ZeichenlaengeErhoeherImmerNeu();
		else
			return null;
		return zeichenlaengeErhoeher;
	}
}
