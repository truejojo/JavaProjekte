package de.jojo;

public class ZeichenlaengeErhoeherAufbauend implements ZeichenlaengeErhoeher
{
	public void erhoeheZeichenlaenge(Zeichenlaenge zeichenlaenge,
			ZaehlerVonZeichenlaenge zaehlerVonZeichenlaenge)
	{
		zeichenlaenge.frageZeichenLaengeAb
			(zaehlerVonZeichenlaenge.gebeZaehlerVonZeichenlaenge());
	}
}
