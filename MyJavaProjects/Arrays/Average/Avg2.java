/*
 *
 *
 *
 */

public class Avg2 {

//	static double avg( double[] array ) {

//		if ( array == null || array.lenght == 0 )

//			throw new IllegalArgumentException( "Array null oder leer" );		



//		double sum = 0;

//		for ( int i = 0; i < array.length; i++ )
//			sum += array[ i ];

//		double arg = sum / array.length;

//		return arg;
				

// Das Gleiche soll man so abkürzen können:
		
//		for ( double n : array )

//		Soll heißen: Für jedes Element n vom Typ double in array do...

//			  sum += n;


//		return sum / array.lenght;	
 

			



//	}

	public static void main( String[] args ) {

//		double[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9 };

//		System.out.println( avg( numbers ) ); // Durchschnitt. 
		
		for ( int prime : new int[]{ 2, 3, 5, 7, 11, 13, 17, 23, 29, 31 } )
		
			System.out.println( prime );


	}


}



