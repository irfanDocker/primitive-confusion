package solutions.techcircle.javaRecaps;

public class Horse extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Horse is neighing!!!!!!!");
	}
	
	@Override
	public void walk() {
		System.out.println("Horse is walking");
	}

	@Override
	public void eat() {
		System.out.println("Horse is eating");
		
	}
}
