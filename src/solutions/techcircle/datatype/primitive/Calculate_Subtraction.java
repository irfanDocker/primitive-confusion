package solutions.techcircle.datatype.primitive;

import java.util.Scanner;

public class Calculate_Subtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This calculator can calculate only Subtraction");
		
		System.out.println("Please enter your first integer value");
		
		int avalue = scanner.nextInt();
		
		System.out.println("Please enter your second integer value");
		
		int bvalue = scanner.nextInt();
		
		int atotal = avalue - bvalue;
		
		System.out.println("You are subtracting  ,"+avalue+" to , "+bvalue);
		
		System.out.println(avalue +" - "+bvalue +" = "+atotal );
		
		scanner.close();
	}
}
