package solutions.techcircle.inheritance.overriding;

public class Company {

	public void address() {
		System.out.println("This address of TechCircle!!");
	}

	void methodDefault() {
		System.out.println("This is a default method");
	}

	private void methodPrivate() {
		System.out.println("This is a Private method");
	}
	
	protected void methodProtected() {
		System.out.println("This is a protected method");
	}	

	
	public void TestingArray() {
		
		String str = "TechCircle";
		
		char[] charArr = str.toCharArray();
		
		
		try {
			for (int i = 0; i <= charArr.length; i++) {
				
				System.out.println(" Printing char : "+ charArr[i] );
				
			}
		} catch (Exception e) {
			System.out.println("Array index Problem!!");
			e.printStackTrace();
		}
		
	}

	public void TestingMethodNotReturningValue(int a, int b) {
	int total = a+b;
		System.out.println("Printing from TestidngMethodNotReturningValue  total is " + total);
		
	}
	
	public String TestingMethodReturningAStringValue(int a, int b) {
		int total1 = a+b;
		System.out.println("Printing from TestingMethodReturningAStringValue  total is " + total1);
		
		String total = Integer.toString(a+b);
		
		return total;
		
	}
	
	
}
