package ohneLambda;

import java.util.*;
import dogs.Dog;

class TestDogs
{

	public static void main(String[] args)
	{
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("boi", 30, 6));
		dogs.add(new Dog("tyri", 40, 12));
		dogs.add(new Dog("charis", 120, 7));
		dogs.add(new Dog("aiko", 50, 10));
		dogs.add(new Dog("clover", 35, 12));
		dogs.add(new Dog("mia", 15, 4));
		dogs.add(new Dog("zooey", 45, 8));

		System.out.println("all dogs " + dogs);
		System.out.println("min age 7 " + minAge(dogs, 7).toString());
		System.out.println("max weight " + maxWeight(dogs, 40).toString());

	}

	private static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor)
	{
		ArrayList<Dog> result1 = new ArrayList<>();
		for (Dog d : dogList)
			if (d.getAge() >= testFor)
				result1.add(d);
		return result1;
	}

	private static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor)
	{
		ArrayList<Dog> result1 = new ArrayList<>();
		for (Dog d : dogList)
			if (d.getWeight() >= testFor)
				result1.add(d);
		return result1;
	}

}
