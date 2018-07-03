package test;

import fahrplan.*;

public class Test {

	public static void main(String[] args) {
		Zuglinie rb1=new Zuglinie("RB1");
		Haltepunkt h1=new Haltepunkt();
		h1.setAnkunft("12:31");
		Haltepunkt h2=new Haltepunkt();
		h2.setAnkunft("09:20");
		Haltepunkt h3=new Haltepunkt();
		h3.setAnkunft("13:12");
		
		
		rb1.addHaltepunkt(h1);
		rb1.addHaltepunkt(h2);
		rb1.addHaltepunkt(h3);
		
		Fahrplan plan=new Fahrplan();
		plan.addZuglinie(rb1, new Zug("12A"));
		
		plan.printFahrplan(rb1);
		
		
	}

}
