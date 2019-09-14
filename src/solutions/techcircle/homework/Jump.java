package solutions.techcircle.homework;

public class Jump {
	private int rope = 1;
	protected boolean outside;
	static boolean a;
	static int i;
	static byte b;
	static long l;
	static double d;
	static float f;
	static String str;
	static short s;

	public Jump() {
		// p1
		this(4);
		// new Jump(4);
		// this(5);
//		rope = 4;
		outside = true;
	}

	int $$$$$$$$$ = 4;

	public Jump(int rope) {
		this.rope = outside ? rope : rope + 1;

//		System.out.println("outside "+ outside);

//		int a = outside ? rope : rope+1 ;

//		System.out.println("Value of a "+ a);

	}

	public static void main(String[] args) {

		boolean balloonInflated = false;
		do {
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
			}
		} while (!balloonInflated);
		
		System.out.println("done");

		// System.out.println(new Jump().rope);

//		System.out.println("Deafult value of boolean "+a);
//	
//		System.out.println("Deafult value of byte : "+b);
//		System.out.println("Deafult value of short : "+s);
//		System.out.println("Deafult value of int : "+i);
//		System.out.println("Deafult value of long : "+l);
//		System.out.println("Deafult value of float : "+f);
//		System.out.println("Deafult value of double : "+d);
//		System.out.println("Deafult value of string : "+str);

	}

	public short someMethod() {

		short a = 0;

		return a;
	}

}
