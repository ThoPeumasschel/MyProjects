
public class MyRect {
	static int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	
	static int[] buildRect(int a1, int b1, int a2, int b2)
	{
		x1 = a1; y1 = b1;
		x2 = a2; y2 = b2;
		int[] arr = new int[4];
		arr[0] = a1; arr[1] = b1;
		arr[2] = a2; arr[3] = b2;
		return arr;
	}
	
	static void printRect() {
		System.out.println("MyRect: <" + x1 + ", " + y1 + ", " + x2 + ", " + 
					y2 + ">") ;
		System.out.println("***");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting coordinates: " + x1 + ", " + y1 + ", "
				+ x2 + ", " + y2);
		int[] arr = new int[4];
		System.out.println("Calling buildRect with coordinates 25, 25, 50, 50");
		arr = buildRect(25,25,50,50);
		System.out.println("Global coordinates: " + arr[0] + ", " + arr[1] + ", "
				+ arr[2] + ", " + arr[3]);
		printRect();
		
		System.out.println("Calling buildRect with coordinates 10, 10, 20, 20");
		arr = buildRect(10,10,20,20);
		System.out.println("Global coordinates: " + arr[0] + ", " + arr[1] + ", "
				+ arr[2] + ", " + arr[3]);
		printRect();
		
		System.out.println("Calling buildRect with coordinates 10, 10, 50, 50");
		arr = buildRect(10,10,50,50);
		System.out.println("Global coordinates: " + arr[0] + ", " + arr[1] + ", "
				+ arr[2] + ", " + arr[3]);
		printRect();
	}

}
