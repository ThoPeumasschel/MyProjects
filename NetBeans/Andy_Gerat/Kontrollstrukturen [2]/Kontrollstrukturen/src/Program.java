import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Verzweigungen
		// einseitige Verzweigung
		
		
		if(true){
			System.out.println("Bedingung erfüllt");
		}
			
		// mehrseitige Verzweigung
		int i = 100;
		if(i > 0){
			System.out.println("Wert von i ist positiv");
		}else if(i == 0){
			System.out.println("Wert von i ist 0");
		}else{
			System.out.println("Wert von i ist negativ");
		}
		
		
		switch(i){
		case 1:
			System.out.println("wert ist 1");
			break;
		default:
			System.out.println("default block");
			break;
		case 2:
			System.out.println("wert ist 2");
			break;
		
		}
		
		// Schleifen
		// Zählschleife
		System.out.println("Zählschleife");
		for(int j = 0; j < 10; j++)
			System.out.println(j);
		
		// Kopfgesteuerte Schleife
		System.out.println("Kopfgesteuerte Schleife");
		int k = 0;
		while( k < 10 ){
			System.out.println(k);
			k++;
		}
		
		// Fussgesteuerte Schleife
		System.out.println("Fussgesteuerte Schleife");
		k = 0;
		do{
			System.out.println(k);
			k++;
		}while( k < 10 );
		
		// Übung Schleifen
		// Konsolen-Auswahl Menü
		
		int menu;
		do{
			System.out.println("1 - Radius berechnen");
			System.out.println("2 - Umfang berechnen");
			System.out.println("3 - Flaecheninhalt berechnen");
			System.out.println("4 - Programm Ende");
			
			menu = new Scanner(System.in).nextInt();
			
			/*
			switch(menu){
			case 1:
				System.out.println("Radius berechnen gewaehlt");
				break;
			case 2:
				System.out.println("Umfang berechnen gewaehlt");
				break;
			case 3:
				System.out.println("Flaecheninhalt berechnen gewaehlt");
				break;
			case 4:
				System.out.println("Programm wurde beendet");
				break;
			default:
				System.out.println("falsche Eingabe");
				break;
			}
			*/
			
			if(menu == 1){
				System.out.println("Radius berechnen gewaehlt");
			}else if(menu == 2){
				System.out.println("Umfang berechnen gewaehlt");
			}else if(menu == 3){
				System.out.println("Flaecheninhalt berechnen gewaehlt");
			}else if(menu == 4){
				System.out.println("Programm beenden");
			}else{
				System.out.println("falsche Eingabe");
			}
			
		}while(menu != 4);
		
	}

}
