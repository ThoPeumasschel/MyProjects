package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<E> implements Iterable<E>
{
	private ArrayList<E> elemente;
	
	
	public MyList()
	{
		elemente=new ArrayList<E>();
	}
	
	
	//fügt in die elementesammlung ein neues element ein:
	public boolean addElement(E e)
	{
		return elemente.add(e);
	}
	
	
	
	//der rückgabetyp einer methode kann auch ein gerischer typ sein!
	@Override
	public Iterator<E> iterator() 
	{
		return new Iterator<E>()
		{
			private int pos;
			
			@Override
			public boolean hasNext()
			{
				return pos<elemente.size();
			}
			
			
			@Override
			public E next()
			{
				return elemente.get(pos++);
			}
			
			@Override
			public void remove()
			{
				throw new IllegalArgumentException("Löschen beim Iterieren von MyList verboten!");
			}
		};
	}
	
	
	
	
}
