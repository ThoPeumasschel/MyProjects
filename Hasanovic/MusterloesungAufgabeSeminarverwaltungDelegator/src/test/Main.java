package test;
import seminare.*;
public class Main {

	public static void main(String[] args) 
	{
		Seminar java=new Seminar("Java");
		Teilnehmer[] tn= {new Teilnehmer("Otto"), new Teilnehmer("Petra"), new Teilnehmer("Dieter")};
		java.setTeilnehmer(tn);
		Dozent dozi=new Dozent("Mr. Garisson");
		java.setDozi(dozi);
		
		Seminarverwaltung.getSV().addSeminar(java);
		
		dozi.addVerwaltung();
		
		
		Seminarverwaltung.getSV().getKursInfos();
		
		
		

	}

}
