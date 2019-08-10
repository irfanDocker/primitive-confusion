package solutions.techcircle.operators;

import java.util.Scanner;

public class SwitchDay2 {
	public static void main(String[] args) {

//		int day = 7;
//		if(day == 1) {
//			 System.out.println("Saturday");
//		}else if(day == 2){
//			 System.out.println("Sunday");
//		}else if(day == 7){
//				 System.out.println("Monday");
//		}else {
//			System.out.println("Weekend");
//		}
//
//		switch (day) {
//		  
//		case 1:
//		    System.out.println("Saturday");
//		    break;
//		  
//		case 2:
//		    System.out.println("Sunday");
//		    
//		    break;
//		
//		    
//		case 7:
//		    System.out.println("Monday");
//		    
//		    break;
//		    
//		default:
//		    System.out.println("Weekend");
//		}

//		Scanner week = new Scanner (System.in);
//        System.out.println("Please Enter the number of day");
//        int day = week.nextInt();
//        
//        
//        //using switch method
//        
////        switch (day) {
////        
////        case 1:
////            System.out.println("Monday");
////            break;
////        case 2:
////            System.out.println("Tuesday");
////            break;
////        case 3:
////            System.out.println("Wednesday");
////            break;
////        case 4:
////            System.out.println("Thursday");
////            break;
////        case 5:
////            System.out.println("Friday");
////            break;
////        case 6:
////            System.out.println("Saturday");
////            break;
////        case 7:
////            System.out.println("Sunday");
////            break;
////        default:
////            System.out.println("Invalid selection");
////        
////        }
//        
//        
//        
//        
//        //lets try the same with if and else if
//        
//        
//if (day == 1) {
//            System.out.println("Monday");
//}
//else if (day == 2) {
//            System.out.println("Tuesday");
//    }
//else if (day == 3) {
//            System.out.println("Wednesday");
//    }
//else if (day == 4) {
//            System.out.println("Thursday");
//}
//else if (day == 5) {
//            System.out.println("Friday");
//}
//else if (day == 6) {
//            System.out.println("Saturday");
//}
//else if (day == 7) {
//            System.out.println("Sunday");
//}
//else {
//            System.out.println("Invalid selection");
//        
//        }

		// int age = 65;
//		switch (age)
//		{
//		   case (16):
//		       System.out.println("You are under 18.");
//		       break;
//		   case (18):
//		       System.out.println("You are eligible for vote.");
//		       break;
//		   case (65):
//		       System.out.println("You are senior citizen.");
//		       break;
//		   default:
//		       System.out.println("Please give the valid age.");
//		       break;
//		}

		/// && >= <=

//		if (age < 18 && age >= 0) {
//			System.out.println("You are under 18.");
//		}

		Scanner AGE = new Scanner(System.in);

		System.out.println("Enter you age");

		int age = AGE.nextInt();

//        int age = 65;

		if (age < 18 && age >= 0) {
			System.out.println("you are under 18");
		} else if (age >= 18 && age <= 65) {
			System.out.println("you are eligible for vote.");

		} else if (age > 65) {
			System.out.println("stay healthy!!");
		} else {
			System.out.println("please give a valid age.");
		}

//		int a = 29;
//        int b = 17;
//        
//        
//    
//        if (a == b) {
//            System.out.println("You are under 18.");
//        } else {
//            System.out.println("You are eligible for vote.");
//            
//            if (a<b) {
//              System.out.println("You are senior citizen.");
//            } else {
//            System.out.println("Please give the valid age.");
//            }
//        }

//		Scanner scanner = new Scanner(System.in);
//
//		
//		
//	    System.out.println("Please enter a month of the year in all UPPERCASE!");
//	     String month = scanner.nextLine();
//	     switch(month.toUpperCase()) {
//	         case "JANUARY":
//	             System.out.println("Jan");
//	             break;
//	         case "FEBRUARY":
//	             System.out.println("Feb");
//	             break;
//	         case "MARCH":
//	             System.out.println("Mar");
//	             break;
//	         case "APRIL":
//	             System.out.println("Apr");
//	             break;
//	         case "MAY":
//	             System.out.println("May");
//	             break;
//	         case "JUNE":
//	             System.out.println("Jun");
//	             break;
//	         case "JULY":
//	             System.out.println("Jul");
//	             break;
//	         case "AUGUST":
//	             System.out.println("Aug");
//	             break;
//	         case "SEPTEMBER":
//	             System.out.println("Sep");
//	             break;
//	         case "OCTOBER":
//	             System.out.println("Oct");
//	             break;
//	         case "NOVEMBER":
//	             System.out.println("Nov");
//	             break;
//	         case "DECEMBER":
//	             System.out.println("Dec");
//	             break;
//	         default:
//	             System.out.println("Not sure");
//	     }

//		 System.out.println("Please enter letter between A through E!");
//	     String stringVal = scanner.nextLine();
//	     switch(stringVal) {
//	         case "A":
//	             System.out.println("A was found");
//	             break;
//	         case "B":
//	             System.out.println("B was found");
//	             break;
//	         case "C": case "D" : case "E":
//	             System.out.println(stringVal + " was found");
//	             break;
//	         default:
//	             System.out.println("Could not find A, B, C, D or E");
//	             break;
//	     }

		//
//		System.out.println("Please enter value between 1 and 5!");
//
//		int switchValue = scanner.nextInt();
//		// SWITCH STATEMENT #1
//		switch (switchValue) {
//		default:
//			System.out.println("Was not 1,2,3, 4 or 5");
//			break;
//		case 1:
//			System.out.println("Value was 1");
//			break;
//		case 2:
//			System.out.println("Value was 2");
//			break;
//		case 3:
//			System.out.println("Value was 3");
//			break;
//		case 4:
//			System.out.println("Value was 4");
//			break;
//		case 5:
////			System.out.println("was a 3 or a 4, or a 5");
//			System.out.println("Actually it was a " + switchValue);
//			break;
//
//		}

	}
}
