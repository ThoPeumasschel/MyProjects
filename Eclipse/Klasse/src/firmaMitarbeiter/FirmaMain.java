package firmaMitarbeiter;

import java.io.*;
import java.util.*;

public class FirmaMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Angestellter> angarr = new ArrayList<Angestellter>(30);
		Angestellter ang = new Angestellter();

		ArrayList<Arbeiter> arbarr = new ArrayList<Arbeiter>(30);
		Arbeiter arb = new Arbeiter();

		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben............1");
			System.out.println("Arbeiter Daten eingeben................2");
			System.out.println("Angestellten Daten anzeigen............3");
			System.out.println("Arbeiter Daten anzeigen................4");
			System.out.println("Mitarbeiterzahl gesamt.................5");
			System.out.println("Mitarbeiter in Text-Dateien schreiben..6");
			System.out.println("Mitarbeiter aus Text-Dateien lesen.....7");
			System.out.println("Zeige Person aufrufen..................8");
			System.out.println("Programmende...........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();
				Angestellter ang1 = new Angestellter(ang.vorname, ang.name, ang.adresse, ang.telefonnummer,
						ang.monatsgehalt);
				angarr.add(ang1);

				try {
					FileOutputStream fs = new FileOutputStream("Angestellte.ser");
					ObjectOutputStream os = new ObjectOutputStream(fs);
					os.writeObject(angarr);
					os.close();

				} catch (IOException e) {
					System.out.println(e.toString());
				}

				if (angarr.size() > 3) {
					System.out.println(
							"\n\tEinstellungsstop!\nWir können keine " + "weiteren Angestellten mehr einstellen!");
				}
				break;
			}

			case 2: {

				System.out.println("Neue Arbeiter erfassen."); // Satzeingabe-Funktion
				arb.getData();
				Arbeiter arb1 = new Arbeiter(arb.vorname, arb.name, arb.adresse, arb.telefonnummer,
						arb.stundenlohn, arb.anzahlStunden);
				arbarr.add(arb1);

				try {
					FileOutputStream fs = new FileOutputStream("Arbeiter.ser");
					ObjectOutputStream os = new ObjectOutputStream(fs);
					os.writeObject(arbarr);
					os.close();

				} catch (IOException e) {
					System.out.println(e.toString());
				}

				if (arbarr.size() > 3) {
					System.out.println(
							"\n\tEinstellungsstop!\nWir können keine " + "weiteren Angestellten mehr einstellen!");
				}

				break;
			}

			case 3: {

				System.out.println("Angestellten Daten zeigen");
				try {

					FileInputStream fs = new FileInputStream("Angestellte.ser");
					ObjectInputStream os = new ObjectInputStream(fs);
					angarr = (ArrayList<Angestellter>) os.readObject();

					System.out.println(angarr);

					os.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				} catch (ClassNotFoundException e) {
					System.out.println(e.toString());
				}

				break;
			}

			case 4: {

				System.out.println("Arbeiter Daten zeigen");
				try {

					FileInputStream fs = new FileInputStream("Arbeiter.ser");
					ObjectInputStream os = new ObjectInputStream(fs);
					arbarr = (ArrayList<Arbeiter>) os.readObject();

					System.out.println(arbarr);

					os.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				} catch (ClassNotFoundException e) {
					System.out.println(e.toString());
				}
				break;
			}

			case 5: {

				System.out.println("\n\tAktuell sind " + angarr.size() + " Angestellte und " + arbarr.size() + " Arbeiter im Unternehmen beschäftigt.");
				break;
			}

			case 6: {
				System.out.println("\n\tZwei Text-Dateien wurden beschrieben.");
				writeToFile(angarr, arbarr);
				break;
			}

			case 7: {

				readFromFile();
				break;
			}
			case 8: {
				ang.zeigePerson();
				arb.zeigePerson();
			}
			}

		} while (cEingabe != 0);
		sc.close();
	}

	/*
	 * Angestellter[] angarr1 = new Angestellter[30]; Arbeiter[] arbarr1 =
	 * new Arbeiter[30];
	 * 
	 * Angestellter ang1 = new Angestellter("Balder", "Hugo", "Hamburg",
	 * "0178/34 56 426", "3500"); Angestellter ang2 = new Angestellter("CCCC",
	 * "DD", "HHHH", "3456378", "4564"); Angestellter ang3 = new
	 * Angestellter("EEEE", "UU", "FGHJ", "111111", "22222");
	 * 
	 * angarr1[0] = ang1; angarr1[1] = ang1; angarr1[2] = ang1;
	 * 
	 * Arbeiter arb = new Arbeiter(); Firma firmaMitarbeiter = new Firma(); //
	 * firmaMitarbeiter.writeToFile(); // firmaMitarbeiter.readFromFile();
	 */

	static void writeToFile(ArrayList<Angestellter> angarr, ArrayList<Arbeiter> arbarr) {

		try {
//			Formatter f = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			Formatter f = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			f.format("\r\n%s\r\n", angarr);
			f.close();
//			Formatter g = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Arbeiter.txt");
			Formatter g = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Arbeiter.txt");
			g.format("\r\n%s\r\n", arbarr);
			g.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}
	}

	static void readFromFile() {
		try {
			System.out.println("Die Angestellten: \n");
//			File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			File x = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			Scanner rff = new Scanner(x);
			while (rff.hasNext()) {
				System.out.println(rff.next());
				}
			System.out.println("Die Arbeiter: \n");
//			File y = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Arbeiter.txt");
			File y = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Arbeiter.txt");
			Scanner rgg = new Scanner(y);
			while (rgg.hasNext()) {
				System.out.println(rgg.next());
			}
			rff.close();
			rgg.close();
		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}

	}

}
