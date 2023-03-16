package exercise_6;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(true)
		{
			int flag=0;
			String str=sc.next();
			try {
            int num=Integer.parseInt(str);
			}catch(Exception e)
			{
				System.out.println("Count:"+count);
				count++;
				flag=1;
			}
			if(flag==0) {
			System.out.println("Numerical Characters are not allowed..");
			break;
			}
		}

	}

}
