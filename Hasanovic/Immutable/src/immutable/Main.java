package immutable;

public class Main
{

	public static void main(String[] args)
	{

		int wert = 12;
		char[] arr = { 'a', 'b', 'c' };
		// char[] arr=new char[3];
		// arr[0]='a';
		// arr[1]='b';
		// arr[2]='c';
		String text = new String("Text");

		Immutable immu = new Immutable(wert, arr, text);

		System.out.println(immu.getArray());
		System.out.println(immu.getZahl());

		wert = 14;

		System.out.println(immu.getZahl());
		System.out.println(immu.getText());
		arr[0] = 'z';
		text = "TextA";

		System.out.println("-------------------");
		System.out.println(immu.getArray());
		System.out.println(immu.getText());

		char[] tempArr = immu.getArray();
		tempArr[2] = 'F';

		System.out.println("------------------------------");
		System.out.println(immu.getArray());

	}

}
