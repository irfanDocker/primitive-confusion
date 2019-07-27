package solutions.techcircle.datatype.primitive;

import java.util.Scanner;

public class Calculate_Division {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This calculator can calculate only Division");
		System.out.println("Please enter your first integer value");
		
		double avalue = scanner.nextDouble();
		
		System.out.println("Please enter your second integer value");
		
		double bvalue = scanner.nextDouble();
		
		double atotal = avalue / bvalue;
		
		System.out.println("You are dividing  <"+avalue+"> to < "+bvalue+" >");
		
		System.out.println(avalue +" / "+bvalue +" = "+atotal );
		
		scanner.close();
		
	}
}
