
public class Operatoren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		x = y = z = 7;
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		x += 2;
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		x++;
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		System.out.println();
		x = 42;
		y = x++;		// 42
		z = ++x;		// 44
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		y = 6 + 4 / 2;		// 8
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		y = (6 + 4) / 2;		// 5
		System.out.println("X = " + x + "  Y = " + y + "  Z = " + z);
		
		String firstName = "Raymond";
		System.out.println("Everybody loves " + firstName);
		System.out.println(4 + " score and " + 7 +  " years ago.");
		System.out.println("4 score and 7 years ago.");
		String myName = "Efraim Zimbalist";
		myName += " Jr.";
		System.out.println(myName);
	}

}
