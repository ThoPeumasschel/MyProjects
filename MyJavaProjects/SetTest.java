import java.util.*;


public class SetTest
{

public static void main(String...args)
{
	before();

}

public static void before() 
{
	Set set = new HashSet();
	set.add("2");
	set.add(3);
	set.add("1");
	Iterator it = set.iterator();
		while (it.hasNext())
	System.out.print(it.next() + " ");
}
}
