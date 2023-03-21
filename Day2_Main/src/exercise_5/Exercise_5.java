package exercise_5;


import java.util.Scanner;

import exercise_4.ZeroException;

public class Exercise_5 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter breadth of rectangle");
		int breadth=sc.nextInt();
		System.out.println("Enter length of rectangle");
		int length=sc.nextInt();
		try {
		if(length==0 || breadth==0)
		throw new ZeroExeption();
		}
		catch(ZeroExeption e)
		{
			System.out.println("Zero Exception Occurs");
		}
         
		}
	}




