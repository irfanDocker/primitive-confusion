package solutions.techcircle.myMethods;

public class Method {

	public static void main(String[] args) {
		
		
		
		
//		int minNumber = minFunction(3, 5);
//		
//		
//		
//		
//		System.out.println(minNumber);
		
		
		minFunction(3, 5);
		minFunction(13, 5);
		minFunction(3, 25);
		minFunction(33, 5);
		minFunction(3, 3335);
		
		
		
		maxFunction(3, 5);
		maxFunction(13, 5);
		maxFunction(3, 25);
		maxFunction(33, 5);
		maxFunction(3, 3335);
		

//		int min;
//		int n1 = 33;
//		int n2 = 9;

		
//		if (n1 > n2) {
//			min = n2;
//			System.out.println("ssss");
//			System.out.println("ssss");
//			System.out.println("ssss");
//			System.out.println("ssss");
//			System.out.println("ssss");
//		}else {
//			min = n1;
//		}
		
		//ternary operator 
	//int min = (n1 > n2) ? n2 : n1 ;
		    // boolean   true:false\
	
	//result = testCondition ? trueValue : falseValue
		
	


		
		
	}

	
	
	
	
	
	
	
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		
		System.out.println(min);
		
		return min;
	}

	
	public static int maxFunction(int n1, int n2) {
		int min;
		if (n1 < n2)
			min = n2;
		else
			min = n1;

		
		System.out.println(min);
		
		return min;
	}
	
	
}
