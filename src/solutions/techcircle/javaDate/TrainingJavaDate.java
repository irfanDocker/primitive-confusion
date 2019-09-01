package solutions.techcircle.javaDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TrainingJavaDate {

	public static void main(String[] args) {
		
		
			 //local date
		LocalDate localDate = LocalDate.now(); // Create a date object
	    System.out.println(localDate); // Display the current date
	    	    
	    	 //local time
	    LocalTime localTime = LocalTime.now();
	    System.out.println(localTime);
	    
	    	 //local DateTime
	    LocalDateTime myObj = LocalDateTime.now();
	    System.out.println(myObj);
	    
	    	 //dateTimeFormatter
	    LocalDateTime myDateObj = LocalDateTime.now(); 
	    System.out.println("Before formatting: " + myDateObj); 
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 

	    String formattedDate = myDateObj.format(myFormatObj); 
	    System.out.println("After formatting: " + formattedDate); 
	}

}
