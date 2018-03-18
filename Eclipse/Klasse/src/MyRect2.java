import java.awt.Point;

public class MyRect2 {
	int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

	// Konstruktor mit 4 Übergabeparameter
	MyRect2(int a1, int b1, int a2, int b2) {
		x1 = a1; 	y1 = b1;
		x2 = a2; 	y2 = b2;
	}

	// Konstruktor mit 2 Übergabeparameter
	MyRect2(Point topLeft, Point bottomRight) {
		x1 = topLeft.x; 	y1 = topLeft.y;
		x2 = bottomRight.x; y2 = bottomRight.y;
	}

	// Konstruktor mit 3 Übergabeparameter
	MyRect2(Point topLeft, int w, int h) {
		x1 = topLeft.x; 	y1 = topLeft.y;
		x2 = x1 + w; y2 = y1 + h;
	}
	
	void printRect() {
		System.out.println("MyRect: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
		System.out.println("***");
	}

}
