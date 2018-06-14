package studenten;

public enum EFaecher 
{
	BIOLOGIE(9), PHYSIK(6), GERMANISTIK(34);
	
	private int anzahlSemester;
	
	
	private EFaecher(int semester)
	{
		anzahlSemester=semester;
	}
	
	public int getSemester()
	{
		return anzahlSemester;
	}
	
	@Override
	public String toString()
	{
		return this.name();
	}
	
	
	
	
	
	
	
}
