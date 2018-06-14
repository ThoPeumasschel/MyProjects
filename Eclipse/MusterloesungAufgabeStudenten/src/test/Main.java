package test;
import studenten.*;

public class Main {

	public static void main(String[] args) 
	{
		EFaecher[] studiFaecher= {EFaecher.BIOLOGIE, EFaecher.PHYSIK};
		
		
		Student studi=new Student("Peterle", "A345F", 2, studiFaecher);
		
		studi.printFaecher();
		studi.checkSemester();
		
		
		
		
		
	}

}
