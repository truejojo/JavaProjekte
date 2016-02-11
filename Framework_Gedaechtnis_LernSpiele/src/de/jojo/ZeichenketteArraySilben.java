package de.jojo;

public class ZeichenketteArraySilben implements ZeichenketteArray
{
	private Zeichenkette konsonanten, vokale;
	private Zeichenkette[] zeichen;
	
	ZeichenketteArraySilben()
	{
		this.konsonanten = new ZeichenketteKonsonanten();
		this.vokale = new ZeichenketteVokale();
		this.zeichen = new Zeichenkette[]{this.konsonanten, this.vokale};
	}
	
	public ZeichenketteArrayIterator gebeZeichenketteArrayIterator()
	{
		return new ZeichenketteArrayIterator(this.zeichen);
	}
}
