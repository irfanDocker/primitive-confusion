package solutions.techcircle.ObjectAndClasses;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//		Student student = new Student();
//		
//		student.dispay();
//		student.message();
		
		
//		Student student2 = new Student("Faizan", 18);
//		
//		student2.dispay();
		
		Person p = new Person();
		Student student3 = new Student();
		Person p2 = new Student();
		
		
//		p.message();
//		
//		student3.message();
//		
//		p2.message();
		
		int move = student3.move();
		
		System.out.println("Moving : "+ move+ " miles");
		
		String [] strArray = {"string1","str2","str3"};
		
		
		ArrayList<String> strList = student3.someMethod(strArray);
		
		
		System.out.println(strList.get(0));
		
		System.out.println(strList.get(2));
		
		
		
	}

}
