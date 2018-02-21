

public class Skalar {
	
	public static void main(String... args) {

		int[][] wertepaare = new int[3][3];
		int Skalar = 5;

		for(int i = 0; i < wertepaare.length; i++) {

			for(int j = 0; j < wertepaare.length; j++) {

				wertepaare[i][j] = (i + j);
				System.out.println(wertepaare[i][j]);

			}

		}
		for(int i = 0; i < wertepaare.length; i++) {

			for(int j = 0; j < wertepaare.length; j++) {
				wertepaare[i][j] *= Skalar;
				System.out.println(wertepaare[i][j]);

			}
		}
	}
}
				
