package de.jojo;
import java.util.HashMap;
import java.util.Map;

public class SpieleVerwaltung
{
	private Map<String, Object> eigenschaften;
	
	SpieleVerwaltung()
	{
		this.eigenschaften = new HashMap<String, Object>();
		this.eigenschaften.clear();
	}
	
	public Map<String, Object> spieleSpielKonstantMitSilben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEKONSTANT);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.SILBEN);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielKonstantMitZahlen()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEKONSTANT);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.ZAHLEN);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielKonstantMitBuchstaben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEKONSTANT);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.BUCHSTABEN);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielAufbauendAufbauendMitSilben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND.toString());
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEAUFBAUEND.toString());
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.SILBEN.toString());
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGENERHOEHERAUFBAUEND.toString());
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielAufbauendAufbauendMitZahlen()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEAUFBAUEND);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.ZAHLEN);
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGENERHOEHERAUFBAUEND);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielAufbauendAufbauendMitBuchstaben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEAUFBAUEND);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.BUCHSTABEN);
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGENERHOEHERAUFBAUEND);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielAufbauendImmerNeuMitSilben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.SILBEN);
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGEERHOEHERIMMERNEU);
		return this.eigenschaften;
	}

	public Map<String, Object> spieleSpielAufbauendImmerNeuMitZahlen()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.ZAHLEN);
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGEERHOEHERIMMERNEU);
		return this.eigenschaften;
	}
	
	public Map<String, Object> spieleSpielAufbauendImmerNeuMitBuchstaben()
	{
		eigenschaften.put("spieltyp", EnumSpielTyp.SIELBENLAENGEAUFBAUEND);
		eigenschaften.put("zeichenfolge", EnumZeichenfolge.ZEICHENFOLGEIMMERNEU);
		eigenschaften.put("zeichenkettearray", EnumZeichenketteArray.BUCHSTABEN);
		eigenschaften.put("zeichenlaengeerhoeher", EnumZeichenlaengeErhoeher.ZEICHENLAENGEERHOEHERIMMERNEU);
		return this.eigenschaften;
	}
}
