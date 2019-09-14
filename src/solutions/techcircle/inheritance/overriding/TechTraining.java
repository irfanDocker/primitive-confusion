package solutions.techcircle.inheritance.overriding;

public class TechTraining extends Company {
	
	
	@Override
	public void address() {
		System.out.println("This address of TechTraining!!");
	}
	
	
	@Override
 	void methodDefault() {
		System.out.println("This is a default method");
	}
	
	@Override
public void TestingArray() {
		
		String str = "TechTraining";
		
		char[] charArr = str.toCharArray();
		
		
		try {
			for (int i = 0; i <= charArr.length; i++) {
				
				System.out.println(" Printing char : "+ charArr[i] );
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index Problem!!  from TechTraining Class");
			
		}
		
	}
	
	@Override
	public void TestingMethodNotReturningValue(int a, int b) {
		
		System.out.println("Printing from TestingMethodNotReturningValue  total is " + (a - b));
	
		
		
	}
	
	@Override
	public String TestingMethodReturningAStringValue(int a, int b) {
		
		String total = Integer.toString(a-b);
		
		System.out.println("Printing from TestingMethodReturningAStringValue  total is " + total);
		
		
		
		return total;
		
	}
	
	
	
	
	
}
