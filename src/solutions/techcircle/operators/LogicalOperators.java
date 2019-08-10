package solutions.techcircle.operators;

public class LogicalOperators {
	public static void main(String[] args) {

//		int intValueA = 20;
//		int intValueB = 10;
//		int intValueC = 5;

		// And &&
		
		
		///(FALSE && FALSE)
		///(FALSE && TRUE)
		///(TRUE && TRUE )

//				//true                    true
//		if(intValueA > intValueB  && intValueA > intValueC) {
//			System.out.println("You are right");
//		}else {
//			System.out.println("Please check your numbers");
//		}

//		// true                                false    
//		if (intValueA > intValueB && intValueA < intValueC) {
//			System.out.println("You are right");
//		} else {
//			System.out.println("Please check your numbers");
//		}

//		// FALSE                                false 	
//		if (intValueA < intValueB && intValueA < intValueC) {
//			System.out.println("You are right");
//		} else {
//			System.out.println("Please check your numbers");
//		}
		
		
		
		// Logical or operator ||
		
		
		int intValueA = 20;
		int intValueB = 10;
		int intValueC = 5;
		////       true             false
		if (intValueA >= intValueB || intValueA < intValueC) {
			System.out.println("You are right");
		} else {
			System.out.println("Please check your numbers");
		}
		
		
		
		int ValueA = 12;
		int ValueB= 21;
		int ValueC=111;
		
		
		// True False
		if ((!(ValueA == ValueB) && (ValueC <= ValueA)) || ((ValueB == ValueA))) {
			System.out.println("You are correct");
		} else
			System.out.println("You are not correct");
		

	}
}

