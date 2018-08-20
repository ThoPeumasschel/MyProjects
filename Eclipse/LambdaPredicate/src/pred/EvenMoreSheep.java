package pred;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

final public class EvenMoreSheep
{
	static boolean b = false;
	public static void main(String[] args)
	{
		EvenMoreSheep s = new EvenMoreSheep();
		EvenMoreSheep s2 = s;
		EvenMoreSheep s3 = null;
		s.go(x -> b == false);
		s.go(x -> s == s2);
		//s.go(x -> s3 = s);
		s3.b = true;
		//EvenMoreSheep.b = true;
		System.out.println("s3: " + s3.b);
		System.out.println(s2);
		int a = 1000;
		String b = "1000";
		String d = a + b;
		List<EvenMoreSheep> order = new ArrayList<>();
		order.add(new EvenMoreSheep());
		order.add(s);
		System.out.println(order);
		long[] a1 = {1, 2, 3};

	}
	void go(Predicate<EvenMoreSheep> e)
	{
		EvenMoreSheep s2 = new EvenMoreSheep();
		if(e.test(s2))
			System.out.println("true ");
		else
			System.out.println("false ");
	}
	static int adder(int x, int y)
	{
		return x + y;
	}
	public String toString()
	{
		return "true";
	}
}
