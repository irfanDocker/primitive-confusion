package solutions.techcircle.arrays;

public class ArrayDay2 {
	public static void main(String[] args) {

		char[] lowerCaseCharArray = { 'a', 'b', 'c', 'b', 'c', 'b', 'c', 'b', 'c', 'b', 'c', 'b', 'c', 'd', 'e', 'f' };
		// 'a','b','c','b','c','b','c','b','c','b','c','b','c','D','E','f'

//		char d =  lowerCaseCharArray[3];

		int index = 0;

		for (char singleChar : lowerCaseCharArray) {
			// System.out.println(singleChar);
			if (singleChar == 'd') {

				lowerCaseCharArray[index] = 'D';
			}

			if (singleChar == 'e') {

				lowerCaseCharArray[index] = 'E';
			}

			if (singleChar == 'b') {

				lowerCaseCharArray[index] = 'B';

			}

			index++;
		}

		System.out.println(lowerCaseCharArray);

//		int numbers[] =  {1,2,3,4,5};
		
//		for (int i : numbers) {
//			System.out.println(i);
//		}

//		char[] upperCaseCharArray = {'A','B','C','D'};
//		
//		int[] nums = {1,2,3,4,4};
//		
//		char[][] charS = {lowerCaseCharArray,upperCaseCharArray};

//		for (char[] cs : charS) {
//			
//		}

//		System.out.println(charS[0][0]);
//		
//		System.out.println(charS[1][2]);

//			int array1[] = {1, 2, 3, 4};
//			int array2[] = {5, 6, 7};
//			int array3[] = {15, 16, 17};
//			int array4[] = {3,4,7,5} ;
//			///char array5[] = {'1',')','d'};
//			
//			String array6[] = {"hello","hello"};
//			
//		 int[][] myNumbers = { array1, array2, array3 };

//			int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7},{15, 16, 17} };

//		 System.out.println(myNumbers[0][0]);
//		 System.out.println(myNumbers[0][1]);
//		 System.out.println(myNumbers[0][2]);
//		 System.out.println(myNumbers[0][3]);
//		 System.out.println(myNumbers[1][0]);
//		 System.out.println(myNumbers[1][1]);
//		 System.out.println(myNumbers[1][2]);
//		 System.out.println(myNumbers[1][3]);

//		String name ;
//		
//				name = "Techcircle";
//				
//				
//		int age ;
//			age = 5;
//			
//			int[] ages = {19,39,93,33,46};
//			
//			
//			int[] agess = new int[5];
//			
//			agess[0] = 4 ;
//			agess[4] = 4 ;
//			agess[2] = 4 ;
//			agess[1] = 4 ;
//			agess[3] = 4 ;
//			
//			

//		char status[] = new char[20];
//		
//		
//		System.out.println("This is status array "+ status[0]);
//		
//		System.out.println("This is status array "+ status[4]);
//		
//		System.out.println("This is status array "+ status[status.length -1]);
//		
//
//		String email = "techcircle@gmail.com";
//		
//		char firstChar = email.charAt(0);
//		
//		System.out.println(firstChar);
//		status[0] = 't';
////		status[0] = firstChar;

//		System.out.println(email.length());
//		status[0] = 't';
//		status[19] = 'm';

//		for (int i = 0 ; i < email.length() ; i ++) {
//			
//			char singleChar  = email.charAt(i);
//			status[i] = singleChar;
//			
//		}
//		
//		
//		System.out.println("This is status array "+ status[0]);
//		
//		System.out.println("This is status array "+ status[4]);
//		
//		System.out.println("This is status array "+ status[status.length -1]);
//		
//		

//		int[] numbers = new int[5];
//		
//		System.out.println("This is the first element -- "+numbers[0]);

//		numbers[0]  = 1;
//		numbers[1]  = 1;
//		numbers[2]  = 1;
//		numbers[3]  = 1;
//		numbers[4]  = 1;
//	
//		
//		System.out.println(numbers.length);

//		int[] ages = {27,12,82,70,54,1,30,34};
//		
//		System.out.println("This is the length of the ages array - "+ages.length);
//		
//		int firstElement = ages[0];
//		
//		System.out.println(firstElement);
//		
//		System.out.println(ages[2]);

	}
}
