import MyJavaProjects.Animal.mammal.Animal;

class Program {
	public static void main(String args[]) {
		Animal a = new Dog();
		Animal b = new Cat();
		Animal c = new Animal();


		System.out.print("The dog says: ");
		a.makeSound();
		System.out.print("The cat says: ");
		b.makeSound();
		System.out.print("The cat also says: ");	
		c.makeSound();
	}
}
