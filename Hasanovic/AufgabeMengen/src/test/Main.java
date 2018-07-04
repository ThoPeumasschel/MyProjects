package test;

import mengen.ArrayListMenge;
import mengen.Element;
import mengen.Menge;

public class Main
{

	public static void main(String[] args)
	{

		Element element = new Element();
		// Aufgabe 1) --------------------------------------------------------
		// a) leere Menge erzeugen
		Menge<Element> me = new Menge<Element>();
		System.out.println(me);
		// b) Gleichheit
		Menge<String> ms = new Menge<String>();
		System.out.println("Gleiche Mengen? " + me.equals(ms));
		Menge<Element> me2 = new Menge<Element>();
		System.out.println("Gleiche Mengen? " + me.equals(me2));
		// c) Hinzufügen
		System.out.println(me.addElement(element));
		// d) Entfernen
		System.out.println(me.removeElement(element));
		// e) ist vorhanden?
		System.out.println(me.containsElement(element));
		// f) Schnittmenge

		// g) Vereinigungsmenge

		// h) Differenzbildung

		// i) Iterator
		me.iterator();

		// j) Comparable
		// z. B. class Element implements Comparable<Element> {}

		// Exceptions!!!

		// Aufgabe 2) --------------------------------------------------------

		Menge<ArrayListMenge<Element>> alm = new Menge<ArrayListMenge<Element>>();

	}

}
