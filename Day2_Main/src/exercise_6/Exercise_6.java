package exercise_6;


public class Exercise_6 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       p pppp=new pp();
      
	}

}




class p{
	int a;
	p()throws ArithmeticException{
		a=1/0;
	}
	
}

class pp extends p{
	public pp(){
		// TODO Auto-generated constructor stub
		try {
			
		System.out.println(a);}
		catch(ArithmeticException e)
		{
			System.out.println(("we"));
		}
		
	}
}