package solutions.techcircle.myMethods;

public class HomeworkPart2 {
	public static void main(String[] args) {

		
		
		
		
		String str = "abasdfasdfasdfcd";
		
		
		
		
		
		str = str.concat("e");
		str = str.concat("f");
		//System.out.println(str);
		
		str = str.concat("assa").concat("2131").concat("sdfs");
				String str2 = str.substring(4);
		
//		int length = str.length();
				
		String substringLastCharacter = str.substring(str.length() -1);
		String substringOneParameter = str.substring(6);
		String subsringTwoParameters = str.substring(0,5);
	
		System.out.println("str -- " + str);
		System.out.println("substringLastCharacter -- " + substringLastCharacter);
		System.out.println("substringOneParameter -- " + substringOneParameter);
		System.out.println("subsringTwoParameters -- " + subsringTwoParameters);

		//System.out.println(str.substring(15, 25));
		
		
		/////////////////////////////////
//		String str = "muneef@hotmail.com"; 
		
		
		
//        String[] arrOfStr = str.split("@"); 
//        
//        System.out.println(arrOfStr[1]);
  
      
	
		
		
		
		
		
//		String result = aqeelsCode("car", 4);
//		System.out.println(result);
		
		System.out.println("Muneef Method " + homeWorkPart2("Muneef", 31));

	}

	
	
	
	
	public static String homeWorkPart2(String str, int length) {

		String newStr = null;

		if (str.length() == length) {

			newStr = str;
		} else if (str.length() > length) {

			newStr = str.substring(str.length() - length);
			
		} else if (str.length() < length) {
			int difference = length - str.length();

			System.out.println("I need to loop <" + difference + "> time");

			while (difference >= 0) {
				str = str.concat("a");
				if(str.length() == length) {
					break;
				}

				difference--;
			}
			newStr = str;
		}

		return newStr;
	}
}
