package solutions.techcircle.ObjectAndClasses;

public class Dog {

	String breed;
	int age;
	String color;
	static int numberOfLegs;
	
	public Dog() {
		System.out.println("This prints out before anything");
	}
	
	public Dog(String name, String sureName) {
		System.out.println("Second Constructor");
	}
	
	

	void barking() {
		System.out.println("Woof");
	}

	void sleeping() {
		System.out.println("Sleeping");
	}

	void eating() {
		System.out.println("MUNCH MUNCH");
	}
	
	public static void main(String[] args) {
		
			
		numberOfLegs = 4;
		
	}
	
	

}
