package exercise_8;

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
		
		

		while(true)
			
		{  			
			int sum=0;

			try {
			for(int i=1;i<=10;i++) {
			
			System.out.println("Enter Student"+i+" Mark:");
			String a=sc.next();
			int b=Integer.parseInt(a);
			sum+=b;
			if(i==10)
				System.out.println("AVERAGE OF 10 STUDENTS MARKS"+sum/10);

			}
			
			}catch(NumberFormatException e)
			{
				System.out.println("Enter Valid Number");
				
			}

	}

}
}
