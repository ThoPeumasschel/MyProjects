package dualmal;

public class Main
{

	public static void main(String[] args)
	{

		int dualint = 10101;
		String dualstr = "10101";
		int dezint = 234;
		String dezstr = "234";
		String test = "abc";

		System.out.println("Dualzahl als int " + dualint + " ist in Dezimal "
				+ DezimalDual.DualNachDezimal(dualint));
		System.out.println("Dualzahl als String " + dualstr + " ist in Dezimal "
				+ DezimalDual.DualNachDezimal(dualstr));
		System.out.println("Dezimalzahl als int " + dezint + " ist in Dual "
				+ DezimalDual.DezimalNachDual(dezint));
		System.out.println("Dezimalzahl als String " + dezstr + " ist in Dual "
				+ DezimalDual.DezimalNachDual(dezstr));
		System.out.println("-------------------------------");
		DezimalDual.DualNachDezimal(test);
		DezimalDual.DezimalNachDual(test);

		DezimalDual dd = DezimalDual.getDezimalDual();
		dd.hashCode();
		DezimalDual dd2 = DezimalDual.getDezimalDual();
		dd2.toString();
		System.out.println(dd.equals(dd2));
		System.out.println(dd);
		dd2.hallo = "Ade!";
		System.out.println(dd);
	}

}
