/* CS 225 - Fundamentals of Computer Science
 * File Name: Lex_Luthor_Client.java
 * Java Programming
 * Chapter 10 Demonstration
 * Instructor: Dan Grissom
 * 
 * Description: This file contains the source code for the evil
 * Lex Luthor client. In a diabolical scheme, Lex orders all people
 * to enter into his line of doom. He proceeds to ask each person
 * in his line what their first name is and then attacks if the name
 * is Clark (commented out)...or if he determines that person is really
 * a superhero. 
 */
package Classes;
import java.util.ArrayList;




public class Lex_Luthor_Client
{

	public static void main(String[] args)
	{
		// Adding some "random" people and superheroes to Lex's line
		ArrayList<Person> lexLineOfDoom = new ArrayList<Person>();
		lexLineOfDoom.add(new Person("Dan", "Grissom", 'M', 29));
		lexLineOfDoom.add(new Person("Jay", "Brown", 'M', 46));
		lexLineOfDoom.add(new Person("Jane", "Smith", 'F', 12));
		lexLineOfDoom.add(new Person("Jimmy", "Bartholomew", 'M', 20));
		lexLineOfDoom.add(new Person("Esther", "Obama", 'F', 73));
		lexLineOfDoom.add(new SuperHero("Clark", "Kent", 'M', 20, "X-Ray Vision", "Kryptonite", "Wonder Woman"));
		lexLineOfDoom.add(new SuperHero("Larry", "Boy", 'M', 30, "Joy", "Can't Read", "Archibald"));
		lexLineOfDoom.add(new Person("Montrell", "Thigpen", 'M', 19));
		lexLineOfDoom.add(new Person("Wallace", "Grommit", 'M', 44));
		lexLineOfDoom.add(new Person("Edward", "Kim", 'M', 21));
		
		// Lex now examines each person
		for (Person p : lexLineOfDoom)
		{
			if (p instanceof SuperHero)
			{
				// If Lex finds a superhero, an epic battle ensues
				System.out.println("Lex initiates POW attack on " + p.getFirstName());
				SuperHero sh = (SuperHero)p;
				System.out.println("\t" + sh.defend());
				System.out.println("\t" + sh.punch());
				System.out.println("\t" + sh.randomAttack());
				System.out.println("\t" + sh.fly());
			}
			else // Otherwise, Lex moves on
				System.out.println("You're lucky I'm in a good mood " + p.getFirstName() + ". Have a great day!");

			// This logic checks only if the person says their name is Clark
			//if (p.getFirstName().toUpperCase().contains("CLARK"))
			//	System.out.println("Lex initiates POW attack on " + p.getFirstName());
			//else
			//	System.out.println("You're lucky I'm in a good mood " + p.getFirstName() + ". Have a great day!");
		}
		
		// Print out details of each person in line, just because we can!
		System.out.println("\n\nOfficial \"toString()\" details of each person in line:");
		for (Person p : lexLineOfDoom)
			System.out.println(p.toString());
		
	}

}
