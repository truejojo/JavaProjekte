package de.jojo;

public class ZeichenketteArrayFabrik
{
	public ZeichenketteArray erstelleZeichenkette(String zeichenketteArrayName)
	{
		ZeichenketteArray zeichenketteArray = null;
		
		if(zeichenketteArrayName.equals("buchstaben"))
			zeichenketteArray =  new ZeichenketteArrayBuchstaben();
		else if(zeichenketteArrayName.equals("silben"))
			zeichenketteArray = new ZeichenketteArraySilben();
		else if(zeichenketteArrayName.equals("zahlen"))
			zeichenketteArray = new ZeichenketteArrayZahlen();
		else
			return null;
		return zeichenketteArray;
	}
}
