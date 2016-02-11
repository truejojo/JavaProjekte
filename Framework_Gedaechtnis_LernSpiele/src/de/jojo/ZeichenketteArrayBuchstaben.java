package de.jojo;

public class ZeichenketteArrayBuchstaben implements ZeichenketteArray
{
	private Zeichenkette alphabet;
	private Zeichenkette[] zeichen;
	
	ZeichenketteArrayBuchstaben()
	{
		this.alphabet = new ZeichenketteAlphabet();
		this.zeichen = new Zeichenkette[]{this.alphabet};
	}
	
	public ZeichenketteArrayIterator gebeZeichenketteArrayIterator()
	{
		return new ZeichenketteArrayIterator(this.zeichen);
	}
}
