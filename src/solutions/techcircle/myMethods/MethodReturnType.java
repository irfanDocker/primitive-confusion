package solutions.techcircle.myMethods;

public class MethodReturnType {
	
	public static void main(String[] args) {
		
		
		int a = addingNumbers();
		
		int b = addingNumbers(3, 90);
		
		
		System.out.println(a + b);
		
		
		
		
		
		
//		int total = addingNumbers();
//		
//		int adding2Number = addingNumbers(3,3);
//		
//		System.out.println(addingNumbers(4,3));
//		
//		System.out.println(adding2Number);
		
		
		
//		System.out.println("Printing from main method--"  + total);
		
		
		
		
//		addingNumber(2,5);
//		addingNumber(2.2,2.3);
//		
	}
	
	//Overloaded  
	public static void addingNumber() {
		int numA = 10;
		int numB = 20;
		
		int total = numA + numB;
		
		System.out.println(total);
		
	
	}
	
	public static int addingNumbers() {
		int numA = 10;
		int numB = 230;
		
		int total = numA + numB;
		
//		System.out.println("This is from line 39");
//		System.out.println(total);
		
		return total;
	
	}
	
	
	


	
	public static void addingNumber(int numA,int numB) {
		
		int total = numA + numB;
		
		System.out.println(total);
		
	}
	
	
	public static int addingNumbers(int numA,int numB) {
		
		int total = numA + numB;
		
//		System.out.println(total);
		
		return total;
		
	}
	
	
	public static void addingNumber(double numA,double numB) {
		
		double total = numA + numB;
		
		System.out.println(total);
		
	}
	
	
	public static void addingNumber(double numA,double numB,double numC) {
		
		double total = numA + numB + numC;
		
		System.out.println(total);
		
	}
	
	
	
	public static void subtractNumber(double numA,double numB,double numC) {
		
		double total = numA - numB - numC;
		
		System.out.println(total);
		
	}
	
	

}
