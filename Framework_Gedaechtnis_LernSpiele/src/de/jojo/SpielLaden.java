package de.jojo;
import java.util.*;

public abstract class SpielLaden
{	
	public void spieleSpiel(Map<String, Object> eigenschaften)
	{		
		SpielTyp spielTyp = erstelleSpielTyp(eigenschaften);
		
		spielTyp.spieleSpiel();
	}
	
	abstract SpielTyp erstelleSpielTyp(Map<String, Object> eigenschaften);
}
