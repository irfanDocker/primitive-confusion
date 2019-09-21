package solutions.techcircle.javaRecaps.OlivePress.model;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		



		List<Olive> oliveList = new ArrayList<>();

		oliveList.add(new Kalamata());
		oliveList.add(new Ligurian());
		oliveList.add(new Ligurian());
	
		
		OlivePress press = new OlivePress();
		
		int totalOil = press.getOil(oliveList);
		
		System.out.println("Total oil : "+ totalOil);
		
		
//		for (Olive olive : oliveList) {
//			System.out.println(olive.name);
//		}
	}

}
