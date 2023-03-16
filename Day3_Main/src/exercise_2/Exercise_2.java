package exercise_2;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance("[---THREAD 1 OBJECT---]");
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance("[---THREAD 2 OBJECT---]");
				
			}
		}).start();
	    new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance("[---THREAD 3 OBJECT---]");
				
			}
		}).start();
	    new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance("[---THREAD 4 OBJECT---]");
				
			}
		}).start();
	}
}
class MySingleTon{
	private MySingleTon(String str) {
		System.out.println(str);
	}
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance(String str) {
		if(obj==null) {
			obj=new MySingleTon(str);
		}
		return obj;
	}
}
