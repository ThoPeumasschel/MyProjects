package karton;

public class Main
{

	public static void main(String[] args)
	{

		KartonInt ki = new KartonInt(35);
		KartonDouble kd = new KartonDouble();
		KartonString ks = new KartonString();
		KartonContainer kc = new KartonContainer(5);

		ki.putElement(5);
		ki.putElement(7);
		ki.putElement(34);
		ki.getElements();
		System.out.println(ki.getElement(2));
		ki.deleteElement(2);
		System.out.println(ki.getElement(2));
		System.out.println(ki.isempty());

	}

}
