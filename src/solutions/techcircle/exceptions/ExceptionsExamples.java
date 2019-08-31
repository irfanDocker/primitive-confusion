package solutions.techcircle.exceptions;

import java.io.File;
import java.io.FileReader;

public class ExceptionsExamples {

	public static void main(String[] args) {

		String str = "Wellcome!";

	
		
		char[] chars = str.toCharArray();

		try {
			char lastChar = chars[chars.length - 1];

			System.out.println(lastChar);

			String subStr = str.substring(10);

			System.out.println(subStr);

		} catch (ArrayIndexOutOfBoundsException muneef) {
			System.out.println("Array index problem!");
		}catch(StringIndexOutOfBoundsException sajjad) {
			System.out.println("String index problem!");
			throw new ArithmeticException("/ by zero");
		}
		
		
		

//		File file = new File("C:\\Users\\techc\\eclipse-workspace\\solutions.techcircle\\.projects");
//		
//		//FileReader fr = new FileReader(file);
//		
//		
//		double a =1d;
//		
//		double q = 0.0000440040;
//		
//		double c = a/q;
//		
//		
//		System.out.println(c);
//		

//		System.out.println("First line");
//		System.out.println("Second line");
//		System.out.println("Third line");
//		int[] myIntArray = new int[] { 1, 2, 3 };
//		//print4thItemInArray(myIntArray);
//		
//		
//	    try {
//
//	        print4thItemInArray(myIntArray);
//	    } catch (ArrayIndexOutOfBoundsException e){
//	        System.out.println("The array doesn't have four items!");
//	    }
//		
//		System.out.println("Fourth line");
//		System.out.println("Fith line");

	}
	
	
	
	
	
	
	

	private static void print4thItemInArray(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed!");
	}

}
