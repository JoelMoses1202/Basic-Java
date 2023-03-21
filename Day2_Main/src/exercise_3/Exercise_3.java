package exercise_3;

public class Exercise_3 {
	public void mth1()
	{
		
		mth2();
		System.out.println("Caller");
	}
	public void mth2() {
		try {
			System.exit(0);
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

		Exercise_3 exObj=new Exercise_3();
		exObj.mth1();
		

	}

}
