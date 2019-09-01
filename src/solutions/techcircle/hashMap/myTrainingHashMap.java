package solutions.techcircle.hashMap;
import java.util.HashMap; // import the HashMap class

public class myTrainingHashMap {

	public static void main(String[] args) {
		//creating HashMap object
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		
		//to add items
		capitalCities.put("Uyghuryer", "Urumqi");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Turkiyer", "Istanbul");
		capitalCities.put("Pakistan", "Islamabad");
	
		System.out.println(capitalCities);
		
		//calling out individual key/value 
		System.out.println(capitalCities.get("Uyghuryer"));
		
		//to remove an item
		capitalCities.remove("USA");
		
		//to remove all items
		capitalCities.clear();
		
		//to get size
		capitalCities.size();
		
	}

}
