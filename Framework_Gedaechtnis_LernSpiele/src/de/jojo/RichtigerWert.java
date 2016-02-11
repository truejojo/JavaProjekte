package de.jojo;

public class RichtigerWert
{
	private boolean richtigerWert;
	
	RichtigerWert()
	{
		this.richtigerWert = true;
	}
	
	public void setzeRichtigerWert(boolean richtigerWert)
	{
		this.richtigerWert = richtigerWert;
	}
	
	public boolean gebeRichtigerWert()
	{
		return this.richtigerWert;
	}
}
