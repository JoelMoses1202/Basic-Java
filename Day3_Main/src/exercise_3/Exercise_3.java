package exercise_3;


public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

while(true) {


new Thread(new Runnable() {
	
	public void run() {
		
		
		Inventory.produce();
		
	}
}).start();

new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			    Inventory.consume();
				
			
				
			}
		}).start();

 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
      
}
	}
}
class Inventory{
	static int inventory=0;
	static void produce()  {
		
		    if(inventory==0)
		    {
			System.out.println("Product Added ");
			inventory=1;
		
		    }
		    
	}
	static void consume() {
		
		if(inventory==1) {
			System.out.println("Consumed Product");
			inventory=0;
		

		}
	
		
	}
	
	
	
}