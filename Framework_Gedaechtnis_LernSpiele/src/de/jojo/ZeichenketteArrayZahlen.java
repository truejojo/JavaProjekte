package de.jojo;

public class ZeichenketteArrayZahlen implements ZeichenketteArray
{
	private Zeichenkette zahlen;
	private Zeichenkette[] zeichen;
	
	ZeichenketteArrayZahlen()
	{
		this.zahlen = new ZeichenketteZahlen();
		this.zeichen = new Zeichenkette[]{this.zahlen};
	}
	
	public ZeichenketteArrayIterator gebeZeichenketteArrayIterator()
	{
		return new ZeichenketteArrayIterator(this.zeichen);
	}
}
