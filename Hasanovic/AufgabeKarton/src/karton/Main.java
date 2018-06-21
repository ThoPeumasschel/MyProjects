package karton;

public class Main
{

	public static void main(String[] args)
	{
		IntKarton ik = new IntKarton(10, "Integer Box");
		DoubleKarton dk = new DoubleKarton(10, "Double Box");
		StringKarton sk = new StringKarton(10, "String Box");
		ContainerKarton ck = new ContainerKarton(10, "Super Box");
		ContainerKarton ck2 = new ContainerKarton(10, "Container Box");

		ck.getName();

		ik.addInt(5);
		ik.addInt(46);
		ik.addInt(2346);
		ik.addInt(97523);

		dk.addDouble(3.141);
		dk.addDouble(1.81357);
		dk.addDouble(36.56488861);

		sk.addString("Hallo");
		sk.addString("du");
		sk.addString("Sack!");

		ck.addKarton(ik);
		ck.addKarton(dk);
		ck.addKarton(sk);
		ck.addKarton(ck2);

		System.out.println("\nElemente in ik");
		ik.getAll();
		System.out.println("\nElemente in dk");
		dk.getAll();
		System.out.println("\nElemente in sk");
		sk.getAll();
		System.out.println("\nElemente in ck");
		ck.getAll();
		System.out.println("\nElemente in ck2");
		ck2.getAll();
		System.out.println();

		ik.deleteInt(1);
		ik.getAll();

		ck.deleteKarton(1);
		dk.deleteAll();
		dk.getAll();

		ck.deleteKarton(1);

	}

}
