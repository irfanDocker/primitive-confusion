package solutions.techcircle.accessModifier;

public class A {
	private int data = 40;
	
	private void msg() {
		System.out.println("Hello from class A");
	}
	
	int defaultIntA = 400;
	
	void defaultMsg() {
		System.out.println("Hello from class A default msg method");
	}
	
	protected String strProtected = "Hello";
	
	protected String protectedMethodFromClassA() {
		
		return "Hello TechCircle";
		
	}
	
	
	
	
	public static void main(String[] args) {
		A classA = new A();
		
		//Private
//		System.out.println(classA.data);
//		
//		classA.msg();
		
		
		//Default
//		System.out.println(classA.defaultIntA);
//		
//		classA.defaultMsg();
		
		
		//Protected
		
		String a = classA.strProtected;
		
		System.out.println(a);
		
		
		String str = classA.protectedMethodFromClassA();
		
		System.out.println(str);
		
		
	}
	
	
}
