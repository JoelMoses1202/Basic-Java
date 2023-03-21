package exercise_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_7 {
static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		
		

		while(true)
		{
			try {
			System.out.println("Enter Numerator");
			int num=sc.nextInt();
			System.out.println("Enter Divisor");
			int div=sc.nextInt();
			int result=num/div;
			System.out.println(result);
		
		}catch(InputMismatchException e)
		{
			String a=sc.next();
			if(a.equals("q")||a.equals("Q"))
			{
				System.out.println("QUIT");
				break;
			}
			System.out.println("Enter Valid Number");

		}
		catch (ArithmeticException e) {
			System.out.println("DIVISOR SHOULD NOT BE 0");
		}
		
	}

}
	}
	
	


