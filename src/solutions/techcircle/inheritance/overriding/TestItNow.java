package solutions.techcircle.inheritance.overriding;

public class TestItNow {

	public static void main(String[] args) {
		
		Company a = new Company();
		Company b = new TechTraining();

		int numA = 10;
		
		int numB = 5;
		
		b.TestingMethodNotReturningValue(numA, numB);
		String total = b.TestingMethodReturningAStringValue(numA, numB);
		
		System.out.println("This is your total from Test it now Class : "+ total);
		
	}

}
