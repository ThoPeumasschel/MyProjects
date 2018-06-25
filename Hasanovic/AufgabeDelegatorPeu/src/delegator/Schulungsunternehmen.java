package delegator;

public class Schulungsunternehmen // bietet Dienste an, ist also ein Delegator
{

	String[] studentenNamen;
	ISchulungsunternehmen client; // Referenz auf den Dienstaufrufer

	public Schulungsunternehmen(ISchulungsunternehmen client)
	{
		this.client = client;
	}

	public Schulungsunternehmen()
	{

	}

	// Die geforderten Dienste:

	// Sowohl Dozenten als auch Seminarteilnehmer sollen auf eine
	// Kursübersicht zugreifen können(Start, Ende, Raum, Thema, Dozent)

	public String getKursuebersicht(Kurs seminar)
	{

		return "Kursinfo: Start " + seminar.getStart() + " - Ende " + seminar.getEnde() + " - Raum " + seminar.getRaum()
				+ " - Thema " + seminar.getThema() + " - Dozent " + seminar.getDozentName();
	}

	// -> Sowohl Dozenten als auch Seminarteilnehmer sollen alle Teilnehmer
	// und den Dozenten eines bestimmten Seminars erhalten können

	public String getKursDozent(Kurs seminar)
	{
		return seminar.getDozentName();
	}

	public String[] getKursTeilnehmer(Kurs seminar)
	{

		Seminarteilnehmer[] teilnehmer = seminar.getStudenten();
		studentenNamen = new String[teilnehmer.length];

		for (int i = 0; i < teilnehmer.length; i++)
			{
				studentenNamen[i] = teilnehmer[i].getName();
			}

		return studentenNamen;

	}

	// -> Sowohl Dozenten als auch Seminarteilnehmer sollen alle relevanten
	// Informationen aller Dozenten/Seminarteilnehmer erhalten können
	// (allgemeine personenbezogene Daten)

	public String getPersonenInfo()
	{

		return "Der Name lautet: " + client.getName() + "\nDer Kurs lautet: " + client.getKurs();

	}

}
