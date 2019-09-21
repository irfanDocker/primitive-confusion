package solutions.techcircle.javaRecaps;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog is making sound!");
	}
	
	@Override
	public void walk() {
		System.out.println("Dog is walking");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating!");
		
	}
}
