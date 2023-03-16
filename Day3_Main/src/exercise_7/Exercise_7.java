package exercise_7;


public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(new Runnable() {
			
			public void run() {
				
				
              for(int i=1;i<101;i++)
              {
            	  System.out.println("counting...."+i);
            	  if(i%10==0)
            	  {
            		  System.out.println("This String marks every 10th count.");
            	  }
            	  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	  
              }
			}
		}).start();

	}

}
