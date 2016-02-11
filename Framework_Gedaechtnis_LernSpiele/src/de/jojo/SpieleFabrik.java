package de.jojo;
import java.util.*;

public class SpieleFabrik
{
	private SpieleVerwaltung spieleVerwaltung;
	private String item;
	private Map<String, Object> eigenschaften;
	
	SpieleFabrik(EnumGedaechtnisSpieleAuswahl spiel)
	{
		this.spieleVerwaltung = new SpieleVerwaltung();
		this.item = spiel.toString();
		this.eigenschaften = new HashMap<String, Object>();
	}
	
	public Map<String, Object> gebeMapMitEigenschaftenFuerGedaechtnisSpiel()
	{
		if(this.item.equals("aufbauendaufbauendmitbuchstaben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendAufbauendMitBuchstaben();
		else if(this.item.equals("aufbauendaufbauendmitsilben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendAufbauendMitSilben();
		else if(this.item.equals("aufbauendaufbauendmitzahlen"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendAufbauendMitZahlen();
		else if(this.item.equals("aufbauendimmerneumitbuchstaben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendImmerNeuMitBuchstaben();
		else if(this.item.equals("aufbauendimmerneumitsilben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendImmerNeuMitSilben();
		else if(this.item.equals("aufbauendimmerneumitzahlen"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielAufbauendImmerNeuMitZahlen();
		else if(this.item.equals("konstantmitbuchstaben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielKonstantMitBuchstaben();
		else if(this.item.equals("konstantmitsilben"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielKonstantMitSilben();
		else if(this.item.equals("konstantmitzahlen"))
			this.eigenschaften = this.spieleVerwaltung.spieleSpielKonstantMitZahlen();
		return this.eigenschaften;
	}
}
