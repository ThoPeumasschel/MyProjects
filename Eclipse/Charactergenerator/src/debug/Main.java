package debug;

import klassen.*;

public class Main {

	static Charakter[] charakterArr=new Charakter[12];
	
	
	public static void main(String[] args) {

		for(int i = 0; i <12;i++)
		{
			charakterArr[i]=new Charakter();
		}
		
		//Charakter c1 = new Charakter();
		//c1.erzeugeCharakter();
		System.out.println("--------------------------------\n");
		for(Charakter c : charakterArr)
			System.out.println(c.zeigeCharakter()+"\n");
		
		
		
	}

}
