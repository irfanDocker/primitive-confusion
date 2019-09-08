package solutions.techcircle.ObjectAndClasses;

import java.util.ArrayList;

public class JavaConstructorsTask {
	/*
	 * Task:
	 * Using parameterized constructor, create list of Dog object.  
	 * Iterate the list and call talk() method for each dog. 
	 * */
	
	
	public static void main(String[] args) {
		/*
		 *  1- Create parameterized constructor of the Dog
			2- Create multiple  Dogs using step 1
			3- Create list of Dog object
			4- Loop step 3
			5- for each dog call talk() method
			*/
		
		
		//Create parameterized constructor of the Dog
		
//		2- Create multiple  Dogs using step 1
//		String breed,int age ,String color
		Dog dog1 = new Dog("Dog1",2,"Black");
		
		Dog dog2 = new Dog("Dog2",1,"white");
		
		Dog dog3 = new Dog("Dog3",1,"brown");
		
//		3- Create list of Dog object
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(new Dog("dog4",3,"red"));
		
		
//		4- Loop step 3
		
		dogList.remove(2);
		
		for (Dog dog : dogList) {
//			String dogBreed = dog.breed;
//			
//			System.out.println(dogBreed);
//			
//			System.out.println(dog.age);
//			
//			5- for each dog call talk() method
			
			dog.talk();
			
		}
		
		
		
		
		
//		int[] nums = {1,2,1,2,1,2,1};
		
//		Dog[] dogs = {dog1, dog2 , dog3}; 
//		
//		try {
//			for (int i = 0; i <= dogs.length ; i++) {
//				dogs[i].talk();
//			}
//			
//			dogs[3] = dog1;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index problem");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
