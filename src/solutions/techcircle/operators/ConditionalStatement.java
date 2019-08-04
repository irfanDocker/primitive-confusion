package solutions.techcircle.operators;

import java.util.Scanner;

public class ConditionalStatement {
	
	
	
	public static void main(String[] args) {
		
		
		//Conditional Statement 
				//if
				//else
				
				
		
		int a = 1;
		int b = 11;
		
		
//		boolean conditionCheck = a==b;
//		
//		if(conditionCheck) {
//			System.out.println("Hello Class");
//		}else{
//			System.out.println("NO WAY");
//			
//		}
		
		//else if
		//<,>,<=,>=
		//!
		if (a < b ) {
			System.out.println("you are right ");
		}
		
		
//		if(a == b) {
//			System.out.println("This is not correct");
//			System.out.println("This is not correct");
//			System.out.println("This is not correct");
//			System.out.println("This is not correct");
//			System.out.println("This is not correct");
//			System.out.println("This is not correct");
//			
//		}else if(b == b) {
//			System.out.println("they are the same variable crazy");
//		}else{
//			System.out.println("what up Y");
//			
//		}
		
	//////	
		Scanner ageVerification = new Scanner(System.in);
				
		System.out.println("Please enter your legal Age?");		
		int userEnteredNumber = ageVerification.nextInt();
		

		if(userEnteredNumber < 4 && userEnteredNumber > 0) {
			System.out.println("Welcome to this world kid");
		}else if(userEnteredNumber >=4 && userEnteredNumber <= 19){
			System.out.println("You just getting started");
		}else if(userEnteredNumber >=20 && userEnteredNumber <= 55) {
			System.out.println("life is good");
		}else if(userEnteredNumber > 55) {
			System.out.println("getting old");
		}else {
			System.out.println("are you sure about your age?");
		}
		
		//////Grades
		Scanner youGrade = new Scanner(System.in);
		System.out.println("Enter your grade!");
		int number =  youGrade.nextInt();;
		
		
        if (number< 40) {
            System.out.println("Fail, GO STUDY !");
        }else if (number <= 59) {
            System.out.println("C Grade, you still need to practice!");
        }else if (number<= 79) {
            System.out.println("B Grade, you're good enough to pass");
        }else if (number<= 95) {
            System.out.println("A Grade, Great Job!");
        }else {
            System.out.println("A+ Grade, Above and Beyond");
        }
				
		
//		
		
		
		
		
		
		

		
		
	}

}
