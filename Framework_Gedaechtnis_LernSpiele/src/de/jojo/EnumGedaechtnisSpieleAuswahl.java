package de.jojo;

public enum EnumGedaechtnisSpieleAuswahl
{
	KONSTANDMITSILBEN,
	KONSTANDMITZAHLEN,
	KONSTANDMITBUCHSTABEN,
	AUFBAUENDAUFBAUENDMITSILBEN,
	AUFBAUENDAUFBAUENDMITZAHLEN,
	AUFBAUENDAUFBAUENDMITBUCHSTABEN,
	AUFBAUENDIMMERNEUMITSILBEN,
	AUFBAUENDIMMERNEUMITZAHLEN,
	AUFBAUENDIMMERNEUMITBUCHSTABEN;

	public String toString() 
	{
		switch(this) 
		{
			case KONSTANDMITSILBEN:  
				return "konstantmitsilben";
			case KONSTANDMITZAHLEN:  
				return "konstantmitzahlen";
			case KONSTANDMITBUCHSTABEN:  
				return "konstantmitbuchstaben";
			case AUFBAUENDAUFBAUENDMITSILBEN:   
				return "aufbauendaufbauendmitsilben";
			case AUFBAUENDAUFBAUENDMITZAHLEN:   
				return "aufbauendaufbauendmitzahlen";
			case AUFBAUENDAUFBAUENDMITBUCHSTABEN:   
				return "aufbauendaufbauendmitbuchstaben";
			case AUFBAUENDIMMERNEUMITSILBEN:   
				return "aufbauendimmerneumitsilben";
			case AUFBAUENDIMMERNEUMITZAHLEN:   
				return "aufbauendimmerneumitzahlen";
			case AUFBAUENDIMMERNEUMITBUCHSTABEN:   
				return "aufbauendimmerneumitbuchstaben";
			default:
				return "undefiniert";
		}
	}
}
