package test;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import autos.BMW;
import autos.VW;

public class Main
{

	@SuppressWarnings("all")
	public static void main(String[] args)
	{

		// Unteraufgabe 2.
		VW golf = new VW("Golf", 1990);
		BMW z4 = new BMW("Z4", 2000);

		System.out.println(golf);
		System.out.println(z4);

		// Unteraufgabe 3.
		VW vw1 = new VW("Passat", 2012);
		VW vw2 = new VW("Lupo", 2017);
		VW vw3 = new VW("Touran", 2014);
		System.out.println(vw1);

		// Unteraufgabe 4.
		LinkedList vwList = new LinkedList();
		vwList.add(vw1);
		vwList.add(vw2);
		vwList.add(vw3);
		HashSet vwHashSet = new HashSet();
		vwHashSet.add(vw1);
		vwHashSet.add(vw2);
		vwHashSet.add(vw3);
		TreeSet vwTreeSet = new TreeSet();
		vwTreeSet.add(vw1);
		vwTreeSet.add(vw2);
		vwTreeSet.add(vw3);

		// Unteraufgabe 5.
		System.out.println("--------------------------");
		for (Object v : vwList)
			System.out.println(v);
		System.out.println("--------------------------");
		for (Object v : vwHashSet)
			System.out.println(v);
		System.out.println("--------------------------");
		for (Object v : vwTreeSet)
			System.out.println(v);
		System.out.println("--------------------------");

		// Unteraufgabe 6.
		BMW bmw1 = new BMW("1er", 2011);
		BMW bmw2 = new BMW("2er", 2009);

		LinkedList bmwList = new LinkedList();
		bmwList.add(bmw1);
		bmwList.add(bmw2);

		HashSet bmwHashSet = new HashSet();
		bmwHashSet.add(bmw1);
		bmwHashSet.add(bmw2);

		TreeSet bmwTreeSet = new TreeSet();
		bmwTreeSet.add(bmw1);
		bmwTreeSet.add(bmw2);

		System.out.println("--------------------------");
		for (Object v : bmwList)
			System.out.println(v);
		System.out.println("--------------------------");
		for (Object v : bmwHashSet)
			System.out.println(v);
		System.out.println("--------------------------");
		for (Object v : bmwTreeSet)
			System.out.println(v);
		System.out.println("--------------------------");

		// Unteraufgabe 7.
		System.out.println(bmwHashSet.contains(bmw1));
		// Methode liefert true

		// Unteraufgabe 8.
		bmw1.setBaujahr(3333);
		System.out.println(bmwHashSet.contains(bmw1));
		// Methode liefert jetzt false
		// im HashSet wird eine Kopie von bmw1 gehalten, die durch setBaujahr verändert
		// wird.
		// damit wird auch der Hashwert verändert.

		// Unteraufgabe 9.
		vwList.add(new VW("Polo", 2200));

		// Unteraufgabe 10.
		System.out.println("Aufgabe 10");
		System.out.println(Collections.binarySearch(vwList, vw1));
		System.out.println(Collections.binarySearch(vwList, vw2));
		System.out.println(Collections.binarySearch(vwList, vw3));
		System.out.println(Collections.binarySearch(vwList, new VW("Polo", 2200)));

		// Unteraufgabe 11.
		System.out.println("Aufgabe 11");
		System.out.println(Collections.binarySearch(vwList, new VW("Passat", 2012)));

		// Unteraufgabe 12.
		System.out.println("Aufgabe 12");
		// System.out.println(Collections.binarySearch(vwList, null));

		// Unteraufgabe 13.
		TreeSet autoTree = new TreeSet();
		autoTree.add(vw1);
		autoTree.add(vw2);
		autoTree.add(vw3);
		autoTree.add(bmw1);
		autoTree.add(bmw2);

		// Unteraufgabe 14.

		// Unteraufgabe 15.

	}

}
