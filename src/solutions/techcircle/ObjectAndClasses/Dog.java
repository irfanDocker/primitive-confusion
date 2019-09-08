package solutions.techcircle.ObjectAndClasses;

public class Dog {

	String breed;
	int age;
	String color;
	static int numberOfLegs;
	
	public Dog() {
		System.out.println("This prints out before anything");
	}
	
	
	//Create parameterized constructor of the Dog
	public Dog(String breed,int age ,String color ) {
		
		this.breed = breed;
		this.age = age;
		this.color = color;
		//Dog.numberOfLegs = numberOfLegs;
		System.out.println("Printing from parameterized constructor");
		System.out.println("Dog breed : " + breed +" , age : "+ age + " , color "+ color );
		
		
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
	
	
	void talk() {
		System.out.println("woof woof");
	}
	
//	public static void main(String[] args) {
//		
//			
//		numberOfLegs = 4;
//		
//	}
	
	

}
