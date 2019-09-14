package solutions.techcircle.inheritance.overriding;

public class NotASubClass extends Company {

	@Override
	public void address() {
		System.out.println("This address of NotASubClass!!");
	}

	@Override
	public void TestingArray() {

		String str = "NotASubClass";

		char[] charArr = str.toCharArray();

		try {
			for (int i = 0; i <= charArr.length; i++) {

				System.out.println(" Printing char : " + charArr[i]);

			}
		} catch (Throwable e) {
			System.out.println("Array index Problem!! from NotASubClass");
			e.printStackTrace();
		}

	}

}
