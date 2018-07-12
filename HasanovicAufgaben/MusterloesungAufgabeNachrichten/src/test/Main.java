package test;
import nachrichten.*;



public class Main {

	public static void main(String[] args) 
	{
		Vermittler v=new Vermittler(20);
		Radio swr=new Radio("SWR", v);
		Fernsehen rtl=new Fernsehen("RTL", v);
		
		PrivatPerson otto=new PrivatPerson("12383888A");
		
		swr.registerVermittler(v);
		rtl.registerVermittler(v);
		
		v.register(otto);
		
		rtl.neueNachricht("Albanien gewinnt die Fuﬂball-WM");
		
		
		
		

	}

}
