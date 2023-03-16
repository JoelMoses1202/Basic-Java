package exercise_5;


public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread greet = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hii");
				
			}
		});
        greet.start();
//        	evenThread.start();
//			ILLEGAL THREAD STATE EXCEPTION
//       	A THREAD CAN BE STARTED ONLY ONCE


	}

}
