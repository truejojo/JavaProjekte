package de.jojo;

public enum EnumZeichenketteArray
{
	BUCHSTABEN, ZAHLEN, SILBEN;

	public String toString() 
	{
		switch(this) 
		{
			case BUCHSTABEN:  
				return "buchstaben";
			case ZAHLEN:   
				return "zahlen";
			case SILBEN:   
				return "silben";
			default:
				return "undefiniert";
		}
	}
}