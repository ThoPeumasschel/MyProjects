package test;

import seminare.Dozent;
import seminare.IKursInfo;
import seminare.Seminar;
import seminare.Seminarverwaltung;
import seminare.Teilnehmer;

public class Main
{

	public static void main(String[] args)
	{
		Seminar java = new Seminar("Java");
		Teilnehmer[] tn = { new Teilnehmer("Otto"), new Teilnehmer("Petra"), new Teilnehmer("Dieter") };
		java.setTeilnehmer(tn);
		Dozent dozi = new Dozent("Mr. Garisson");
		java.setDozi(dozi);

		Seminarverwaltung.getSV().addSeminar(java);

		dozi.addVerwaltung();

		IKursInfo teilnehmer = new Teilnehmer("Horst");

		Teilnehmer t2 = new Teilnehmer("Willi");

		Seminarverwaltung.getSV().getKursInfos();

	}

}
