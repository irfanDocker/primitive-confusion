package solutions.techcircle.homework;

public class NameCheck {
	public static void main(String[] args) {
		String john = "john";
		String jon = new String(john);
		System.out.println((john==jon)+" "+ (john.equals(jon)));
	}
}
