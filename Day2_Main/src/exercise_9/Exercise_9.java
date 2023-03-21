package exercise_9;

import java.util.Scanner;

import exercise_4.ZeroException;

public class Exercise_9 {

	public static void main(String[] args) throws NegativeValueException,OutOfRangeException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
while(true)
			
		{  			
			int sum=0;

			for(int i=1;i<=10;i++) {
				try {

			System.out.println("Enter Student"+i+" Mark:");
			String a=sc.next();
			int b=Integer.parseInt(a);
			if(b<0)
				throw new NegativeValueException();
			if(b>100)
				throw new OutOfRangeException();
			sum+=b;
			if(i==10)
				System.out.println("AVERAGE OF 10 STUDENTS MARKS"+sum/10);

			
			
			}catch(NumberFormatException e)
			{
				System.out.println("Enter Valid Number");
				--i;
			}
			catch(NegativeValueException e)
			{
				System.out.println("Enter positive value starting from zero");
				--i;

				
			}
			catch(OutOfRangeException e)
			{
				System.out.println("Enter values before 100");
				--i;

				
			}
			}

	}

	}

}
