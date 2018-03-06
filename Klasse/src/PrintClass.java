
public class PrintClass {
	private int x = 0;
	private int y = 1;

	void printMe() {
		System.out.println("I am an instance of the class " + this.getClass().getName());
		System.out.println("X = " + x + ", Y = " + y);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
