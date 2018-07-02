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
	
	
	//f�gt in die elementesammlung ein neues element ein:
	public boolean addElement(E e)
	{
		return elemente.add(e);
	}
	
	
	
	//der r�ckgabetyp einer methode kann auch ein gerischer typ sein!
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
				throw new IllegalArgumentException("L�schen beim Iterieren von MyList verboten!");
			}
		};
	}
	
	
	
	
}
