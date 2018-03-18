
public class LabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	thisLoop:
		for (int i=1; i <= 5; i++)
			for (int j = 1; j <= 3; j++)
			{
				System.out.println("i = " + i + " , j = " + j);
				if ((i + j) > 4)
					break thisLoop;
			}
		int x = 9;
		System.out.println(x-- == 9 && x == 8);
	}

}
