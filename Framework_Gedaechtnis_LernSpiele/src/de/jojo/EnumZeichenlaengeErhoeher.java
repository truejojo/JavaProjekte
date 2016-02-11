package de.jojo;

public enum EnumZeichenlaengeErhoeher
{
	ZEICHENLAENGENERHOEHERAUFBAUEND, ZEICHENLAENGEERHOEHERIMMERNEU;

	public String toString() 
	{
		switch(this) 
		{
			case ZEICHENLAENGENERHOEHERAUFBAUEND:  
				return "aufbauend";
			case ZEICHENLAENGEERHOEHERIMMERNEU:   
				return "immerneu";
			default:
				return "undefiniert";
		}
	}
}
