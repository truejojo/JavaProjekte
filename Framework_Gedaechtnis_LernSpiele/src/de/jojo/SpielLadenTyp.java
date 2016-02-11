package de.jojo;
import java.util.*;

public class SpielLadenTyp extends SpielLaden
{
	public SpielTyp erstelleSpielTyp(Map<String, Object> eigenschaften)
	{
		SpielTyp spielTyp = null;
		String spielTypName = eigenschaften.get("spieltyp").toString();
		
		if(spielTypName.equals("silbenlaengekonstant"))
			return spielTyp = new SpielTypSilbenlaengeKonstant(eigenschaften);
		
		else if(spielTypName.equals("silbenlaengeaufbauend"))
			return spielTyp = new SpielTypSilbenlaengeAufbauend(eigenschaften);
		
		return spielTyp;
	}
	
	
}
