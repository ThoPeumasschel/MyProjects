package folge;


//in diese schnittstelle kommen alle methoden, welche es ermöglichen sollen, dass die elementsammlung im sinne ihrer nutzung EINHEITLICH
//von aussen genutzt werden kann, ohne dass der nutzer sich mit der inneren struktur der elementsammlung befassen muss
public interface IReihenfolge
{
	//methoden für einen iterierenden, lesenden zugriff
	boolean elementVorhanden();  //-> klassischer name: hasNext()
	Object nextElement(); //-> klassischer name: next()
	
	
	
	//zusätzliche dienste:
	void remove(); 
	
	
	
}
