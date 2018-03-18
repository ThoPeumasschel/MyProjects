
public class FindMax {

	static int returnMax(int a, int b)
	{
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1234;
		int n2 = 5678;
		int max = returnMax(n1,n2);
		System.out.println("Maximum von " + n1 + " und " + n2 + " ist " + max);
	}
}
