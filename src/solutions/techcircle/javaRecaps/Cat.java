package solutions.techcircle.javaRecaps;

public class Cat extends Animal {


	public void makeSound() {
		System.out.println("Cat is making sound!");
	}
	

	public void walk() {
		System.out.println("Cat is walking");
	}


	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}
}
