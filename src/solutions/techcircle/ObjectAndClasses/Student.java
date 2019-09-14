package solutions.techcircle.ObjectAndClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person implements Player{
	
	String name; 
	int age;
	
	
	void message() {
		System.out.println("This is from Student class");
	}

	void dispay() {
		message();
		super.message();
	}
	
	Student(){
		super();
//		System.out.println("Printing from Student class default constructor");
	}
	
	Student(String name, int age){
		super("Faizan!!!!!");
		this.name = name;
		this.age = age;
		
		System.out.println("Student name is "+ name+" age : "+age +".");
	}

	@Override
	public int move() {
		
		return 100;
	}

	@Override
	public ArrayList<String> someMethod(String[] arr) {
		
		ArrayList<String> strList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			strList.add(arr[i]);
		}
		
		return strList;
	}
	
	
}
