package de.jojo;

public enum EnumZeichenfolge
{
	ZEICHENFOLGEAUFBAUEND, ZEICHENFOLGEIMMERNEU;

	public String toString() 
	{
		switch(this) 
		{
			case ZEICHENFOLGEAUFBAUEND:  
				return "aufbauend";
			case ZEICHENFOLGEIMMERNEU:   
				return "immerneu";
			default:
				return "undefiniert";
		}
	}
}
