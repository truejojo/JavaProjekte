package de.jojo;

public class ZeichenlaengeErhoeherImmerNeu implements ZeichenlaengeErhoeher
{
	public void erhoeheZeichenlaenge(Zeichenlaenge zeichenlaenge,
			ZaehlerVonZeichenlaenge zaehlerVonZeichenlaenge)
	{
		zeichenlaenge.frageZeichenLaengeAb
			(zeichenlaenge.gebeZeichenLaenge() + zaehlerVonZeichenlaenge.gebeZaehlerVonZeichenlaenge());
	}
}
