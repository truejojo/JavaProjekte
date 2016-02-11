package de.jojo;

enum EnumSpieleAuswahl
{
	GEDAECHTNISSPIELE;

	public String toString() 
	{
		switch(this) 
		{
			case GEDAECHTNISSPIELE:  
				return "gedaechtnisspiele";
			default:
				return "undefiniert";
		}
	}
}
