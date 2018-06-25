package delegator;

public class Dozent implements ISchulungsunternehmen
{
	private String name, adresse, privatTelefon;
	private Kurs kurs;
	private Schulungsunternehmen schule;

	public Dozent(String name, String adresse, String telefon, Kurs kurs)
	{
		schule = new Schulungsunternehmen(this);
		this.setName(name);
		this.setAdresse(adresse);
		this.setPrivatTelefon(telefon);
		this.setKurs(kurs);
	}

	public String getAdresse()
	{
		return adresse;
	}

	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}

	public String getPrivatTelefon()
	{
		return privatTelefon;
	}

	public void setPrivatTelefon(String privatTelefon)
	{
		this.privatTelefon = privatTelefon;
	}

	public Schulungsunternehmen getSchule()
	{
		return schule;
	}

	public void setSchule(Schulungsunternehmen schule)
	{
		this.schule = schule;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setKurs(Kurs kurs)
	{
		this.kurs = kurs;
	}

	@Override
	public String getName()
	{

		return name;
	}

	@Override
	public Kurs getKurs()
	{
		return kurs;
	}

}
