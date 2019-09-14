package solutions.techcircle.ObjectAndClasses;

public class Person {
	
	void message() {
		System.out.println("This is from Person class");
	}
	
	Person(){
//		System.out.println("Printing from Person class default constructor");
	}
	
	
	Person(String name){
		
		System.out.println("Printing the name : "+ name);
		
//		System.out.println("Printing from Person class Argument constructor");
	}
	
	
}
