package exercise_8;

public class Exercise_8 {
	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("A");
		A.aa(str);
		
		str.setCharAt(0, (char)(str.charAt(0) + 1));
		A.aa(str);
		str.setCharAt(0, (char)(str.charAt(0) + 1));
		A.aa(str);

		
	}

}


class A extends Thread{
	StringBuffer a;

	private  void A(StringBuffer str) {
		// TODO Auto-generated constructor stub
		a=str;
		run();
	}
	public void run() {
		// TODO Auto-generated method stub
		synchronized (a) {
			for(int i=1;i<=100;i++)
			{
				System.out.println(a);
			}
			
		}
		
	}
	
    static void aa(StringBuffer a) {
        A a2 = new A();
		a2.A(a);
		
	}
	
	
	
	
}