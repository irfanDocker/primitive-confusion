package solutions.techcircle.datatype.primitive;

import java.util.Scanner;

public class Calculate_Multipilication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This calculator can calculate only Multipilication");
		System.out.println("Please enter your first integer value");
		
		int avalue = scanner.nextInt();
		
		System.out.println("Please enter your second integer value");
		
		int bvalue = scanner.nextInt();
		
		int atotal = avalue * bvalue;
		
		System.out.println("You are multiplaying  <"+avalue+"> to < "+bvalue+" >");
		
		System.out.println(avalue +" x "+bvalue +" = "+atotal );
		
		scanner.close();
	}
}
