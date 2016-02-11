package de.jojo;

public class ZeichenketteArrayIterator
{
	private Zeichenkette[] zeichen;
	private int position;
	
	ZeichenketteArrayIterator(Zeichenkette[] zeichen)
	{
		this.zeichen = zeichen;
		this.position = 0;
	}
//	hier sonst wieder public
	private Zeichenkette gebeZeichenkettenObjektAusArray()
	{
		return this.zeichen[this.position];
	}
//	ist das nun sinnvoll oder nicht?
	public String gebeZeichenkette()
	{
		return this.gebeZeichenkettenObjektAusArray().gebeZeichenkette();
	}
	
	public void erhoehePosition()
	{
		this.position++;
	}
		
	public boolean hasNext()
	{
		if(this.position >= this.zeichen.length || this.zeichen[this.position] == null)
			return false;
		else
			return true;
	}
}
