

class Handlungsschritt_4 {

	
		static double anfangskapital = 1000.0, endkapital = 1050.0, zinssatz = 2.0; 

	public static void main(String...args) {
		
		rechneJahre(anfangskapital, zinssatz);
		
		
	}

	static int rechneJahre(double ak, double zins) {
		
		int jahre = 0;	
		double kontostand = ak;
		while (kontostand <= endkapital) {
			jahre++;
			kontostand = (1 + zins/100) * rechneJahre(kontostand, zins);
			System.out.println("Der Kontostand nach dem " + jahre + ". Jahr ist " + kontostand); 
			}
		return jahre;

	}
}
//		static double rechneKontostand(double ak, double zins) {

			
