package solutions.techcircle.datatype.primitive;

import java.math.BigDecimal;
import java.util.Scanner;

public class PrimitiveVariables {

	public static void main(String[] args) {
//		byte imran  = 58;
//		boolean isFound = false;
//		char someCharValue = 'a';
//		short someShortValue = 3215;
//		int  myInt = 10000000; 
//		long myLong = 321654987L;
//		float someFloat = 32165.12645f;
//		double myDoubleValue = 0.2d;
//		
//		System.out.println("Testing ------"+imran);
//		System.out.println("This is my boolean "+ !isFound);
//		System.out.println("This is my  char "+ someCharValue);
//		System.out.println("This is my  short "+someShortValue);
//		System.out.println("This is my  Int "+ myInt);
//		System.out.println("This is my  long "+myLong);
//		System.out.println("This is my  float "+someFloat);
//		System.out.println("This is my  double "+myDoubleValue);
//		
//		String str = "techcirssss444444cle";
		
		//add   +
		//sub   -
		// mult *
		//devi  /
		
		
//		int a  = 9;
//		int b = 91;
//		int total = a +b;
//		
//		System.out.println("a + b = "+total);
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("This calculator can calculate only addition");
//		System.out.println("Please enter your first integer value");
//		
//		int avalue = scanner.nextInt();
//		
//		System.out.println("Please enter your second integer value");
//		
//		int bvalue = scanner.nextInt();
//		
//		int atotal = avalue + bvalue;
//		System.out.println("You are adding <"+avalue+"> to < "+bvalue+" >");
//		
//		System.out.println(avalue +" + "+bvalue +" = "+atotal );
//		
//		scanner.close();
		
		
		double doubleValue = 0.2;
		
		double total = doubleValue+doubleValue+doubleValue;
		
		System.out.println(total);
		
		
		String str = "0.2";
		
		BigDecimal BigDec1 = new BigDecimal(str);
		BigDecimal BigDec2 = new BigDecimal(str);
		BigDecimal BigDec3 = new BigDecimal(str);
		
		BigDec1 = BigDec1.add(BigDec2).add(BigDec3);
		System.out.println(BigDec1);
//		System.out.println(BigDec1.abs());
		
		
	//	System.out.println(BigDec1);
		
		
//        // Create two new BigDecimals
//        BigDecimal BigDec1 = new BigDecimal("1238126387123");
//        BigDecimal BigDec2 = new BigDecimal("1213669989183");
// 
//        // Addition of two BigDecimals
//        BigDec1 = BigDec1.add(BigDec2);
//        System.out.println("BigDec1 = " + BigDec1);
// 
//        // Multiplication of two BigDecimals
//        BigDec1 = BigDec1.multiply(BigDec2);
//        System.out.println("BigDec1 = " + BigDec1);
// 
//        // Subtraction of two BigDecimals
//        BigDec1 = BigDec1.subtract(BigDec2);
//        System.out.println("BigDec1 = " + BigDec1);
// 
//        // Division of two BigDecimals
//        BigDec1 = BigDec1.divide(BigDec2);
//        System.out.println("BigDec1 = " + BigDec1);
// 
//        // BigDecima1 raised to the power of 2
//        BigDec1 = BigDec1.pow(2);
//        System.out.println("BigDec1 = " + BigDec1);
// 
//        // Negate value of BigDecimal1
//        BigDec1 = BigDec1.negate();
//        System.out.println("BigDec1 = " + BigDec1);
		
		
		
		
		
		
		

		
	}

}
