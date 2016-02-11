package de.jojo;
import java.util.HashMap;
import java.util.Map;

public class SpielEigenschaften
{
	private Map<String, Object> spielEigenschaften;
	
	SpielEigenschaften()
	{
		this.spielEigenschaften = new HashMap<String, Object>();
		this.initialisiereSpieleigenschaften();
	}
	
	public EigenschaftenIterator gebeEigenschaftenIterator()
	{
		return new EigenschaftenIterator(this.spielEigenschaften);
	}
	
	private void initialisiereSpieleigenschaften()
	{
		this.spielEigenschaften.put("richtigerwert", new RichtigerWert());
		this.spielEigenschaften.put("zaehlervonzeichenlaenge", new ZaehlerVonZeichenlaenge());
		this.spielEigenschaften.put("zufallszeichenkette", new ZufallsZeichenkette());
		this.spielEigenschaften.put("zeichenketteeingabe", new ZeichenketteEingabe());
		this.spielEigenschaften.put("rundenausgabe", new RundenAusgabe());
		this.spielEigenschaften.put("rundenvergleich", new RundenVergleich());
		this.spielEigenschaften.put("rundenanzahlstatic", new RundenanzahlStatic());
		this.spielEigenschaften.put("spieleranzahl", new Spieleranzahl());
		this.spielEigenschaften.put("zeichenkettearrayfabrik", new ZeichenketteArrayFabrik());
		this.spielEigenschaften.put("zeichenfolgefabrik", new ZeichenfolgeFabrik());
		this.spielEigenschaften.put("zeichenlaengeerhoeherfabrik", new ZeichenlaengeErhoeherFabrik());
	}
}
