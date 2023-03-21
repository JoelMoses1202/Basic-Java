package exercise_4;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) throws ZeroException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter breadth of rectangle");
		int breadth=sc.nextInt();
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		if(length==0 || breadth==0)
		{
			throw new ZeroException("Zero is not alowwed");
		}

	}

}
