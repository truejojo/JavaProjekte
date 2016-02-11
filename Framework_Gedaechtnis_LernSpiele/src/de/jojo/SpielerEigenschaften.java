package de.jojo;
import java.util.*;

public class SpielerEigenschaften
{
	private Map<String, Object> spielerEigenschaften;
	
	SpielerEigenschaften()
	{
		this.spielerEigenschaften = new HashMap<String, Object>();
		this.initialisiereSpieleigenschaften();
	}
	
	public EigenschaftenIterator gebeEigenschaftenIterator()
	{
		return new EigenschaftenIterator(this.spielerEigenschaften);
	}
	
	private void initialisiereSpieleigenschaften()
	{
		this.spielerEigenschaften.put("name", new Name());
		this.spielerEigenschaften.put("rundenrichtigzaehler", new RundenRichtigZaehler());
		this.spielerEigenschaften.put("zeichenlaenge", new Zeichenlaenge());
		this.spielerEigenschaften.put("zeichenketteeingabe", new ZeichenketteEingabe());
	}
}
