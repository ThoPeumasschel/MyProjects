package klassen;

import java.util.Random;

import klassen.Charakter.*;

public class GameInit {

	Stadt s = new Stadt();

	public void planquadrateErzeugen() {

		for (int i = 0; i < 100; i++) {
			s.planquadrat[i] = new Planquadrat();
		}

	}

	public void doIT(Stadt stadt) {

		this.planquadrateErzeugen();
		this.charakterAufPlanquadratZuweisen();

	}

	public void charakterAufPlanquadratZuweisen() {

		/*
		 * 
		 * Die Charaktere sollen also mit einer von Ihnen zu entwickelnden Methoden
		 * zufällig über diese Planquadrate verteilt werden. Beim Übergeben eines neu
		 * erzeugten Charakters an diese Methode, sollen alle oben genannten Werte per
		 * zufall gesetzt werden.
		 * 
		 * -> Übergeben Sie bei der Erzeugung jeden Charakter in Form einer anonymen
		 * Klasse!(Nur für Fortgeschrittene)
		 * 
		 * 
		 */

		for (int i = 0; i < 12; i++) {
			int k = new Random().nextInt(99);
			s.planquadrat[k].setC(new Charakter() {

				public void initialisiereCharakter() {
					this.setName(Name.values()[new Random().nextInt(Name.values().length)]);
					this.setGeschlecht(Geschlecht.values()[new Random().nextInt(Geschlecht.values().length)]);
					this.setSpezielleGabe(SpezielleGabe.values()[new Random().nextInt(SpezielleGabe.values().length)]);
					this.setWaffe(Waffe.values()[new Random().nextInt(Waffe.values().length)]);
					this.setIDplanquadrat(getIDplanquadrat());
					

				}
			});

		}

		for (int i = 0;  s.planquadrat[i] != null && i < 99; i++) {
			if (s.getPlanquadrat()[i].getC()!=null) 
				System.out.println("Name: \t"+s.planquadrat[i].getC().getName()+"\nGeschl.: "+s.planquadrat[i].getC().getGeschlecht()+
			"\nGabe: \t"+s.planquadrat[i].getC().getSpezielleGabe()+"\nWaffe: \t"+s.planquadrat[i].getC().getWaffe()+"\n");
		
		}

	}

}
