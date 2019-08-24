package solutions.techcircle.myMethods;

public class MyNewTestClass {

	

	public static void main(String[] args) {

		myMethod();
		myMethod("Shafkat");
		System.out.println(myMethod(5));
		System.out.println(myMethod(4,4));
		checkAge(24);

	}

	static void myMethod() {
		System.out.println("hello World");
	}

	static void myMethod(String fname) {
		System.out.println(fname + " Ali");
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
