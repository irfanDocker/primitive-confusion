package solutions.techcircle.myMethods;

public class MyFirstMethods {

	public static void main(String[] args) {
		//A method is a block of code which only runs when it is called
		/*You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.*/
		
		//Java provides some pre-defined methods, such as System.out.println()
		
		/*
		 * 1) myMethod() -- is the name of the method
		   2) static --  means that the method belongs to the MyClass class and 
				not an object of the MyClass class. You will learn more about 
				objects and how to access methods through objects later in this tutorial.
		   3) void --  means that this method does not have a return value. 
		   		You will learn more about return values later in this chapter*/
		

	}

	static void myMethod() {
		// code to be executed
	}

	static void myMethod(String fname) {
		System.out.println(fname + " Refsnes");
	}

	static int myMethod(int x) {
		return 5 + x;
	}

	static int myMethod(int x, int y) {
		return x + y;
	}

	static void checkAge(int age) {

		
		
		
		
		// If age is less than 18, print "access denied"
		if (age < 18) {
			System.out.println("Access denied - You are not old enough!");

			// If age is greater than 18, print "access granted"
		} else {
			System.out.println("Access granted - You are old enough!");
		}

	}

}
