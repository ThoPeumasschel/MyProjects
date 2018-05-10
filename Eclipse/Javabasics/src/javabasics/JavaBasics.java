package javabasics;

public class JavaBasics {

	public static void main(String[] args) {
		HausGrundriss haus1 = new HausGrundriss();
		haus1.wandanzahl = 4;
		haus1.wandmaterial = "Beton";
		haus1.dachmaterial = "Holz";
		haus1.tueranzahl = 2;
		haus1.fensteranzahl = 6;
		
		haus1.Status();
		
	}

}
