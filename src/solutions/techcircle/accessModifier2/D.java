package solutions.techcircle.accessModifier2;

import solutions.techcircle.accessModifier.A;
import solutions.techcircle.myMethods.HomeworkPart2;

public class D {
	
	String str = "hello";
	
	static String str2 = "cat";
	

	public static void main(String[] args) {

//		HomeworkPart2 hwp2 = new HomeworkPart2();
//		
//		String result = hwp2.homeWorkPart2("Hello",15 );
//		
//		System.out.println(result);
		
		
		
		D classD = new D();
		classD.str = "updated"; 
		classD.msg ();
		 
		 
		D classD2 = new D();
		classD2.msg ();
		 
		 
//		 System.out.println(classD.str);
//		 
//		 
//		 System.out.println(str2);
		 
	}
	
	private void msg () {
		
		System.out.println(str);
	}
	
	

}
