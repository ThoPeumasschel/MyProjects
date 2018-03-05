import java.awt.*;

public class SetPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point location = new Point(4,13);
		
		System.out.println("Starting location:");
		System.out.println("X = " + location.x);
		System.out.println("Y = " + location.y);
		
		System.out.println("\nMoving to (7,6)");
		location.x = 7;
		location.y = 6;
		
		System.out.println("Ending location:");
		System.out.println("X = " + location.x);
		System.out.println("Y = " + location.y);
	}
}
