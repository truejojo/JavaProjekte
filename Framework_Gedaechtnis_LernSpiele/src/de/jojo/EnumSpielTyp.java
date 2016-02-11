package de.jojo;

public enum EnumSpielTyp
{
	SIELBENLAENGEAUFBAUEND, SIELBENLAENGEKONSTANT;

	public String toString() 
	{
		switch(this) 
		{
			case SIELBENLAENGEAUFBAUEND:  
				return "silbenlaengeaufbauend";
			case SIELBENLAENGEKONSTANT:   
				return "silbenlaengekonstant";
			default:
				return "undefiniert";
		}
	}
}
