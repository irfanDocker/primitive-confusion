package solutions.techcircle.javaRecaps;

public class MethodOverloading {
	
	
	
	//Area calculator of square = a * a;
	public int getArea(int a) {
		return a*a;
	}
	
	//getArea with return type double
	public double getArea(double a) {
		return a*a;
	}
	
	
	public long getArea(long a) {
		return a*a;
	}
	
	
	
	//getArea for rectangle, return type method1 integer , method2 double ==> Area = length * width
	
	
	public int getArea(int length, int width) {
		return length* width;
	}
	
	
	public double getArea(double a , int b) {
		return a * b;
	}
	
	
	public double getArea(double a , double b) {
		return a * b;
	}
	
	
}
