package solutions.techcircle.hashMap;

import java.util.HashMap;

public class HashMapTask {

	public static void main(String[] args) {


		// Create a HashMap object called people
	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("Shafkat", 19);
	    people.put("Irfan", 20);
	    people.put("Imran", 37);
	    people.put("Aqeel", 35);
	    people.put("Muneef", 12);
	    people.put("Sajjad", 55);
	    people.put("Zainap", 22);
	    people.put("Rena", 21);
	    people.put("Iskander", 15);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
		
		
		

	}

}
