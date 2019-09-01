package solutions.techcircle.accessModifier;

public class ClassFields_attribute {
	
	//class Attributes or fields
	  int y = 5;
	  int myAge = 19;
	  String myName = "Shafkat";
	  String friend = "Irfanjan";

	public static void main(String[] args) {
		
		ClassFields_attribute myObj = new ClassFields_attribute();
		ClassFields_attribute myObj2 = new ClassFields_attribute();//created OBJECT of ClassFields_attribute CLASS TWICE
		myObj.y = 10;	//Override value of class attribute Y in object 1.
		System.out.println("value of Y in object 1 --> " + myObj.y); //printing out the value of Y using OBJECT1
		System.out.println("value of Y in object 2 --> " + myObj2.y); //printing out the value of Y using OBJECT2
	} //main method bracket is closing
	
	
	

} //class bracket is closing
