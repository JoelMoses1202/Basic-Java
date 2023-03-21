package exercise_2;

public class Exercise_2 {
	public void mth1()
	{
		mth2();
		System.out.println("Caller");
	}
	public void mth2() {
		try {
			int a=1/0;
			return;
		}
		catch(Exception e)
		{
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_2 exerObj=new Exercise_2();
		exerObj.mth1();
		
		
		

	}

}
