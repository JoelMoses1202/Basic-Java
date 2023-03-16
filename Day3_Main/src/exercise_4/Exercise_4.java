package exercise_4;
import java.util.*;

public class Exercise_4 {
	static int hours=0, minutes=0, seconds=0;  
	static void printTime() {
		
		System.out.println(hours+":"+minutes+":"+seconds);
	}
	
	public static void main(String[] args) {		


new Thread(new Runnable() {
	
	public void run() {
		
		
		 while (true) {  
			  
	            Calendar cal = Calendar.getInstance();  
	            hours = cal.get( Calendar.HOUR_OF_DAY );  
	            minutes = cal.get( Calendar.MINUTE );  
	            seconds = cal.get( Calendar.SECOND );  


	            
	            printTime();  
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        	

	         } 		
	}
}).start();

	}
	}

	
	
	
