import java.awt.Point;

public class RectTest {

	public static void main(String[] args) {

		System.out.println("Calling MyRect2 with coordinates 25, 25, 50, 50");
		MyRect2 rect1 = new MyRect2(25, 25, 50, 50);
		rect1.printRect(); // Objektvariable.Methode

		System.out.println("Calling MyRect2 with points (10, 10), (20, 20)");
		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		MyRect2 rect2 = new MyRect2(p1, p2);
		rect2.printRect();

		System.out.println("Calling MyRect2 with a point (10, 10), width 50, height 50");
		MyRect2 rect3 = new MyRect2(p1, 50, 50);
		rect3.printRect();

	}

}
