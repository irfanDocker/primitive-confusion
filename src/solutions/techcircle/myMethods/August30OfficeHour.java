package solutions.techcircle.myMethods;

public class August30OfficeHour {
	public static void main(String[] args) {
	
		int additionTotal = calculator(33,3,"addition");
		
		int subtractionTotal = calculator(43,33,"subtraction");
		
		int multiplicationTotal = calculator(3,3,"multiplication");
		
		int divisionTotal = calculator(3,3,"division");
		
		
		if(additionTotal == 66) {
			System.out.println("you are correct");
		}else {
			System.out.println("There is something wrong your calculator method");
		}
		
		
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
	
	
	
	public static int divide2number(int a,int b) {
		int total = a / b; 
		return total;
	}
	
	
	
	
	
	
	
	public static void adding2number() {
		int a  = 1; 
		
		int b = 2; 
		
		int total = a + b; 
		
		
		System.out.println(total);
	}
	
}
