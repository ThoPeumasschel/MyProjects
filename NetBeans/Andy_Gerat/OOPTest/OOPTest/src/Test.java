
public class Test extends Test2 implements IBeispiel, IBeispiel2{

	@Override
	public void testMethode() {
		
	}

}


class Test2{
	
}

// Interface ist eine Art Bauplan für Klassen und enthält NUR Methoden-Signaturen und Konstanten, Methoden haben kein Methodenkörper sondern werden in den Klassen ausprogrammaiert
interface IBeispiel{
	void testMethode();
}

interface IBeispiel2{
	void testMethode();
}