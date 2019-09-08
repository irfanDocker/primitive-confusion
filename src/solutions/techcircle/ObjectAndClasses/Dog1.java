package solutions.techcircle.ObjectAndClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog obj1Dog = new Dog();
		
		obj1Dog.age = 4;
		obj1Dog.breed = "pitBull";
		obj1Dog.color = "jetBlack";
		
		
		System.out.println( "Breed of this dog is " + obj1Dog.breed);
		System.out.println("Age of " + obj1Dog.breed + " is " + obj1Dog.age);
		
		obj1Dog.barking();
		
		Dog obj2Dog = new Dog();
		
		Scanner scan = new Scanner(System.in);
		
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		
		
		list.add(obj1Dog);
		list.add(obj2Dog);
		list.add(obj2Dog);
		list.add(obj2Dog);
		list.add(obj2Dog);
		list.add(obj2Dog);
		
		// iterating
//		Iterator<Dog> itr = list.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}


		for (Dog obj : list) {
			System.out.println(obj.age);
		}
		
		
		
		
		Student st = new Student();
		
		
		ArrayList<Student> list1s = new ArrayList<Student>();
		
		
		Student nums[] = {new Student(),new Student(),new Student(),new Student()};
		
		Car cars[] = {new Car(),new Car()};
	}

}

