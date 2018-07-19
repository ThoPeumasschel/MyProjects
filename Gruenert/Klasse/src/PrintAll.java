
public class PrintAll {

	public static void main(String[] args) {

		PrintSubSubClass obj = new PrintSubSubClass();
		obj.printMe();
		obj.setX(100);
		obj.setY(200);
		obj.printMe();
		
		PrintClassSub obj1 = new PrintClassSub();
		obj1.printMe();
		obj1.setX(1000);
		obj1.setY(2000);
		obj1.printMe();
	}
}
