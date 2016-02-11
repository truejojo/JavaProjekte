package de.jojo;
import java.util.*;

public abstract class SpielTyp
{
	private Spieler spieler;
	private EigenschaftenIterator iterator;
	
	SpielTyp(Map<String, Object> eigenschaften)
	{
		this.spieler = new Spieler();
		SpielEigenschaften spielEigenschaften = new SpielEigenschaften();
		this.iterator = spielEigenschaften.gebeEigenschaftenIterator();
		this.iterator.setzeMap(eigenschaften);
	}
	
	public Spieler gebeSpieler()
	{
		return this.spieler;
	}
	
	public Object gebeSpielEigenschaften(String item)
	{
		return this.iterator.gebeObjekt(item);
	}
	
	public final void spieleSpiel()
	{
		richteSpielerEin();
		richteSpielEin();
		spielen();
	}
	
	abstract void richteSpielerEin();
	
	abstract void richteSpielEin();
	
	abstract void spielen();
}
