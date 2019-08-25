package solutions.techcircle.myMethods;

public class HomeworkPart2 {
	public static void main(String[] args) {

		
		
		
		
//		String str = "abcd";
//		
//		str = str.concat("e");
//		str = str.concat("f");
//		System.out.println(str);
//		
//		str = str.concat("assa").concat("2131").concat("sdfs");
		
//		String str2 = str.substring(4);
//		
//		int length = str.length();
//		String str3 = str.substring(length -10);
//	
////		System.out.println(str3);
//	
//		System.out.println(str.substring(15, 25));
		
	
		
		
		
		
		
//		String result = aqeelsCode("car", 4);
//		System.out.println(result);

	}

	
	
	
	
	
	
	
	
	public static String aqeelsCode(String str, int length) {

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
