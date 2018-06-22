package delegator;

public class Seminarteilnehmer extends Person
{
	private Schulungsunternehmen schule;

	public Seminarteilnehmer(String name, String adresse, String telefon, Kurs kurs)
	{
		schule = new Schulungsunternehmen(this);
		this.setName(name);
		this.setAdresse(adresse);
		this.setPrivatTelefon(telefon);
		this.setKurs(kurs);
	}

}
