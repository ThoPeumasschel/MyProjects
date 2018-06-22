package delegator;

public class Dozent extends Person
{
	private Schulungsunternehmen schule;

	public Dozent(String name, String adresse, String telefon, Kurs kurs)
	{
		schule = new Schulungsunternehmen(this);
		this.setName(name);
		this.setAdresse(adresse);
		this.setPrivatTelefon(telefon);
		this.setKurs(kurs);
	}

}
