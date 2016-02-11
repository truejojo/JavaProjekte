package de.jojo;

public class Spieler
{
	private EigenschaftenIterator iterator;
	
	Spieler()
	{
		SpielerEigenschaften spielerEigenschaften = new SpielerEigenschaften();
		this.iterator = spielerEigenschaften.gebeEigenschaftenIterator();
	}
	
	public Object gebeSpielerEigenschaften(String item)
	{
		return this.iterator.gebeObjekt(item);
	}
	
	public void initialisiereSpieler(Spieler[] spieler)
	{
		for(int i=0; i<spieler.length; i++)
		{
			spieler[i] = new Spieler();
		}
	}
}
