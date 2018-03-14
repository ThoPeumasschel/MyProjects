package firmaNeu;

import java.io.*;
import java.util.*;

public class FirmaProgrammNeu {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<AngestellterNeu> angarr = new ArrayList<AngestellterNeu>(30);
		AngestellterNeu ang = new AngestellterNeu();

		ArrayList<ArbeiterNeu> arbarr = new ArrayList<ArbeiterNeu>(30);
		ArbeiterNeu arb = new ArbeiterNeu();

		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("Arbeiter Daten eingeben.............2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("Arbeiter Daten anzeigen.............4");
			System.out.println("Mitarbeiterzahl gesamt..............5");
			System.out.println("Mitarbeiter in Dateien schreiben....6");
			System.out.println("Mitarbeiter aus Dateien lesen.......7");
			System.out.println("Zeige Person aufrufen...............8");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();
				AngestellterNeu ang1 = new AngestellterNeu(ang.vorname, ang.name, ang.adresse, ang.telefonnummer,
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
				ArbeiterNeu arb1 = new ArbeiterNeu(arb.vorname, arb.name, arb.adresse, arb.telefonnummer,
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
					angarr = (ArrayList<AngestellterNeu>) os.readObject();

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
					arbarr = (ArrayList<ArbeiterNeu>) os.readObject();

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
	 * AngestellterNeu[] angarr1 = new AngestellterNeu[30]; ArbeiterNeu[] arbarr1 =
	 * new ArbeiterNeu[30];
	 * 
	 * AngestellterNeu ang1 = new AngestellterNeu("Balder", "Hugo", "Hamburg",
	 * "0178/34 56 426", "3500"); AngestellterNeu ang2 = new AngestellterNeu("CCCC",
	 * "DD", "HHHH", "3456378", "4564"); AngestellterNeu ang3 = new
	 * AngestellterNeu("EEEE", "UU", "FGHJ", "111111", "22222");
	 * 
	 * angarr1[0] = ang1; angarr1[1] = ang1; angarr1[2] = ang1;
	 * 
	 * ArbeiterNeu arb = new ArbeiterNeu(); FirmaNeu firmaNeu = new FirmaNeu(); //
	 * firmaNeu.writeToFile(); // firmaNeu.readFromFile();
	 */

	static void writeToFile(ArrayList<AngestellterNeu> angarr, ArrayList<ArbeiterNeu> arbarr) {

		try {
			Formatter f = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
//			Formatter f = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			f.format("%s\r\n", angarr);
			f.close();
			Formatter g = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Arbeiter.txt");
//			Formatter g = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Arbeiter.txt");
			g.format("%s\r\n", arbarr);
			g.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}
	}

	static void readFromFile() {
		try {
			System.out.println("Die Angestellten: \n");
			File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
//			File x = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			Scanner rff = new Scanner(x);
			while (rff.hasNext()) {
				System.out.println(rff.next());
				}
			System.out.println("Die Arbeiter: \n");
			File y = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Arbeiter.txt");
//			File y = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Arbeiter.txt");
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
