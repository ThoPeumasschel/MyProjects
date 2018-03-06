
public class JabberwockTest {

	public static void main(String[] args) {
		Jabberwock j = new Jabberwock();
		Jabberwock j2 = new Jabberwock("blue", "undefined");
		j2.showAttributes();
		
		j.showAttributes();
		System.out.println("Calling showAttribute...");
		j.showAttributes();
		System.out.println("Feeding the jabberwock...");
		j.feedJabberwock();
		j.setColor("red");
		j.setSex("male");
		j.setHungry(true);
		System.out.println("Calling showAttribute...");
		j.showAttributes();
		System.out.println("Feeding the jabberwock...");
		j.feedJabberwock();

		Jabberwock j1 = new Jabberwock();
		j1.setColor("yellow");
		j1.setSex("female");
		System.out.println("Calling showAttribute...");
		j1.showAttributes();
		System.out.println("Feeding the jabberwock...");
		j1.feedJabberwock();
		System.out.println("Calling showAttribute...");
		j1.showAttributes();
		System.out.println("Feeding the jabberwock...");
		j1.feedJabberwock();

	}

}
