package solutions.techcircle.myMethods;

public class August30OfficeHour {
	public static void main(String[] args) {
	
		int additionTotal = calculator(33,3,"addition");
	
		int divisionTotal = calculator(3,0,"division");
	
		int subtractionTotal = calculator(43,33,"subtraction");
		
		int multiplicationTotal = calculator(3,3,"multiplication");
		
		
		System.out.println(subtractionTotal);
		System.out.println(multiplicationTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(additionTotal == 66) {
//			System.out.println("you are correct");
//		}else {
//			System.out.println("There is something wrong your calculator method");
//		}
//		
//		
//		if(additionTotal == 336) {
//			System.out.println("you are correct from line 23");
//		}else {
//			System.out.println("There is something wrong your calculator method");
//		}
//		
//		
//		if(subtractionTotal == 130) {
//			System.out.println("you are correct from line 31 subtracting 2 number");
//		}else {
//			System.out.println("There is something wrong your calculator method");
//		}
//		
//		
//		
//		if(multiplicationTotal == 39) {
//			System.out.println("you are correct multiplicationTotal");
//		}else {
//			System.out.println("There is something wrong your calculator method");
//		}
//		
//		
//		if(divisionTotal == 13) {
//			System.out.println("you are correct divisionTotal");
//		}else {
//			System.out.println("There is something wrong your calculator method");
//		}
//		
		
		
		
	}
	
	
	
	
	
	
	public static int calculator(int num1, int num2 , String operation ) {
		
		int total = 0;
//		if(operation.equalsIgnoreCase("addition")) {
//			total = num1 + num2;
//		}
		
		
		switch (operation) {
		case "addition":
			total = adding2number(num1, num2);
			break ;

		case "subtraction":
			total = subtract2number(num1, num2);
			break ;
			
			
		case "multiplication":
			total =multiply2number (num1, num2);
			break ;
			
		case "division":
			total = divide2number(num1, num2);
			break ;
		default:
			System.out.println("Please implement new operator");
			
		}
		return total;
	}
	
	
	
	
	
	
	
	
	public static void subtraction(int a,int b) {
		
		int total = a - b; 
		
		System.out.println(total);
	}
	
	
	
	
	
	
	public static void subtraction() {
		int a  = 10; 
		
		int b = 2; 
		
		int total = a - b; 
		
		System.out.println(total);
	}
	
	
	
	
	
	public static int adding2number(int a,int b) {
		int total = a + b; 
		return total;
	}
	
	
	public static int subtract2number(int a,int b) {
		int total = a - b; 
		return total;
	}
	
	
	public static int multiply2number(int a,int b) {
		int total = a * b; 
		return total;
	}
	
	
	
	public static int divide2number(int a,int b)  throws ArithmeticException {
		
//		if (b == 0) {
//			throw new ArithmeticException("/ by zero");
//		}
		int total = 0;
		try {
			

				total = a / b;
		} catch (Exception e) {
			
//			e.printStackTrace();
			System.out.println("Check your divide2number method");
		}

		return total;
	}
	
	
	
	
	
	
	
	public static void adding2number() {
		int a  = 1; 
		
		int b = 2; 
		
		int total = a + b; 
		
		
		System.out.println(total);
	}
	
}
