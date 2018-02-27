package zusammenfassungprozedural;

public class MinMax {

}

public class FindMin {
	
	static double returnMin(double arg[]) {
		double min;
		if (arg[0]<arg[1])
			min=arg[0];
		else min=arg[1];
		if (min>arg[2])
			min=arg[2];
		return min;
	}

	static double returnMin(double a, double b, double c) {
		double min;
		if (a<b)
			min=a;
		else min=b;
		if (min>c)
			min=c;
		return min;
	}
	
	public static void main(String[] args) {
		double a=2516.47;
		double b=1002.44;
		double c=5497.1;
		double arr[]= {a, b, c};
		double min=returnMin(arr);
		double min2=returnMin(a,b,c);
		System.out.println("Das Minimum von \t "+a+" \t "+b+" \t "+c+"\nist "+min);
		System.out.println("Das Minimum von \t "+a+" \t "+b+" \t "+c+"\nist "+min2);
		
	}

}
