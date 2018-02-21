
public class EvenSteven {

	static void evenCheck(int val) {

		System.out.println("Value is " + val + ". ");
		if (val % 2 == 0)
			System.out.println("Steven!");

	}

	public static void main(String[] args) {

		evenCheck(1);
		evenCheck(2);
		evenCheck(54);
		evenCheck(77);
		evenCheck(1364);

	}
}
