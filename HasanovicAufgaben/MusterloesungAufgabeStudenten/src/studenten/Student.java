package studenten;

public class Student 
{
	private String name;
	private String matrikelNr;
	//in welchem semester ist der student momentan?
	private int semesterAnzahl;
	//hier werden alle seine studienfächer gespeichert
	private EFaecher[] studienFaecher;
	
	//konstruktor
	public Student(String name, String matrikelNr, int semesterzahl, EFaecher[] faecher)
	{
		this.name=name;
		this.matrikelNr=matrikelNr;
		this.semesterAnzahl=semesterzahl;
		this.studienFaecher=faecher;
	}
	
	//alle fächer des studenten ausgeben auf konsole
	public void printFaecher()
	{
		for(EFaecher f : studienFaecher) //for(int i=0;i<stuedeinFaecher.length;i++)
		{
			System.out.println(f); //-> hier bei der ausgabe wird immer jeweils die toString des enums aufgerufen!
		}
	}
	
	//prüfen, ob student regelstudienzeit überschritten hat:
	public void checkSemester()
	{
		for(EFaecher f : studienFaecher)
		{
			//für jedes einzelne fach prüfen, ob aktuelles semster kleiner als regelstudienzeit des faches:
			if(f.getSemester()>semesterAnzahl)
			{
				System.out.println("Student ist fleissig");
			}
			else
			{
				System.out.println("Student ist faul");
			}	
		}
	}
	
	
	
	
	
	
	
}
