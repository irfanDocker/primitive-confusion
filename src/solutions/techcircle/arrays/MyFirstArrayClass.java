package solutions.techcircle.arrays;

public class MyFirstArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "cat" };
//		int[] numbers = {2,44,5,3,21,4,3,2};
//		
//		System.out.println(cars[3]);
//		
//		System.out.println(cars.length);
//		System.out.println(numbers.length);
		
//		int[] arr = {0,10,20,30,40,50,60,70,80,90,100};
//		
//	       
//	      for (int i = 0; i < arr.length; i++) {
//	           System.out.println("10 x " + i + " = " + arr[i]);
//	      }
		
		
//		for (int i = 0; i < cars.length; i++) {
//			  System.out.println(cars[i]);
//			}
//		
//		
//		///////////////////////////
		
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		 
		 
		 System.out.println(myNumbers[0][2]);
		 
//			 
		 System.out.println(myNumbers.length);
		 System.out.println(myNumbers[0].length);
		 
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		 
		    for (int i = 0; i < myNumbers.length; ++i) {
		    	
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		    	  
		        System.out.println(myNumbers[i][j]);
		      }
		      
		    }
//		////////////////////////////////
//		
		
		
	}

}
