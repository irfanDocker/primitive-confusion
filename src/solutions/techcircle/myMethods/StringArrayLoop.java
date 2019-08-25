package solutions.techcircle.myMethods;





public class StringArrayLoop {
	
	static String[] months = {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};
	
	
	public static void main(String[] args) {
		loopIt("This is months of the year!!!!");
		loopIt("Second iteration");
		loopIt("Third iteration");
	}
	
	
	static void loopIt(String lable){
		
		
//		System.out.println("Iteration!!!");
		
		System.out.println(lable);
		for(int i =0 ; i < lable.length(); i ++) {
			
			System.out.print("*");
			
			
		}
		
		
		System.out.println();
		
		for(int i  = 0 ; i < months.length; i++ ) {
			System.out.println(months[i]);
		}
		
		
	}
	
	

}
