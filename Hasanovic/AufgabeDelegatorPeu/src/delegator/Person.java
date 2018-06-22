package delegator;

public abstract class Person implements ISchulungsunternehmen
{
	private String name, adresse, privatTelefon;
	private Kurs kurs;

	public Person(String name, Kurs kurs)
	{
		super();
		this.name = name;
		this.kurs = kurs;
	}

	public Person()
	{
		super();
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

	public void setName(String name)
	{
		this.name = name;
	}

	public void setKurs(Kurs kurs)
	{
		this.kurs = kurs;
	}

}
