package debug;
import firma.*;


public class Main {

	public static void main(String[] args) {
		
		Aussenstelle aussen=new Aussenstelle();
		IT itAbteilung=new IT();
		Fuhrpark park=new Fuhrpark();
		Marketing marketing=new Marketing();
		
		
		IKostenberechnung[] kostenStellen=new IKostenberechnung[4];
		kostenStellen[0]=aussen;
		kostenStellen[1]=itAbteilung;
		kostenStellen[2]=park;
		kostenStellen[3]=marketing;
		
		new Main().testKostenberechnung(kostenStellen);
		
		

	}

	
	
	//testmethode für übergreifende kostenberechnung
	public double testKostenberechnung(IKostenberechnung[] kostenStellen)
	{
		double gesamtkosten=0;
		
		for(IKostenberechnung ks : kostenStellen)
		{
			gesamtkosten+=ks.berechneKosten();
		}
		return gesamtkosten;
		
		
		
		
	}
	
	
	
	
	
}
