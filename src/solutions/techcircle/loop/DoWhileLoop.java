package solutions.techcircle.loop;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		int x = 108;
		
		do {
			System.out.println("from line 9 Value of x --- "+x);
			++x;
			
			if(x == 150 ) {
				System.out.println("Value of x ====" + x);
				 continue;
			}
			
			
			if (x == 160) {
				continue;
			}
			
			if(x == 160) {
				
				System.out.println("Value of x ====" + x +" exit from the loop");
				break;
			}
			
			
		}while(x <= 200);
		
		
	}
}
