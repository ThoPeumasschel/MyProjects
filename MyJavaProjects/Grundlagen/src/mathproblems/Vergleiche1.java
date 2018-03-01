package mathproblems;

import java.awt.*;

public class Vergleiche1 {

	public static void main(String[] args) {
		
		Point p1 = new Point(7, 12);
		Point p2 = new Point(7, 12);
		Point p3 = new Point(7, 13);
		System.out.println(3 <= 4);		//true
		System.out.println(p1 == p2);	//false
		p2.y++;
		System.out.println(p2 == p3);
		System.out.println(p2.equals(p3));
		
		String s1 = "Maier";
		String s2 = "Maier";
		String s3 = new String("Maier");
		
		System.out.println();
		System.out.println(s1 == s2);	//true
		System.out.println(s2 == s3);	//false
		System.out.println(s1 != s3);	//true
		System.out.println(!s1.equals(s3));//false
		
		System.out.println();
		int i = 5;
		add1(i);
		System.out.println(i);
		i = add2(i);
		System.out.println(i);
		StringBuffer sb1 = new StringBuffer("Maier");
		StringBuffer sb2 = new StringBuffer("Maier");
		add3(sb1, "!");
		System.out.println(sb1); 	//"Maier!"
		System.out.println(sb2);	//"Maier"
		
	}

	static void add1(int zahl) {
		zahl++;
		
	}
	static int add2(int zahl) {
		zahl++;
		return zahl;
				
	}
	
	static void add3(StringBuffer buffer, String str) {
		buffer.append(str);
		
	}
	
	static void add4(StringBuffer buffer, String str) {
		buffer = new StringBuffer(buffer + str);
}
}