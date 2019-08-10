package solutions.techcircle.loop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {

		Scanner table = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = table.nextInt();
		int i = 2;
		int result = number * i;
//		
		System.out.println("Table of " + number + " is\n");
		
		System.out.println(number + " × " + i + " = " + result);
		
//		for (int i = 1; i <= 10 ; i++) {
//			int result = number * i;
//			System.out.println(number + " × " + i + " = " + result);
//		}
		
		
		
		
	}
}
