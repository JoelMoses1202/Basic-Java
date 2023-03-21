package exercise_7;

import java.util.Scanner;

public class Exercise_7 {
	static int flag=0;

	public static void isArmstrong(int num) 
	{
	    int lastDigit, sum, originalNum, digits=0;
	    sum = 0;
	    
	    originalNum = num;
        int temp=num;

	    while(temp%10!=0)
	    {
	    	digits++;
	    	temp/=10;
	    }

	   
	    while(num > 0)
	    {
	        lastDigit = num % 10;
	        sum = sum +(int)(Math.pow(lastDigit, digits));
	        num = num / 10;
	    }
	    
	    if(originalNum == sum)
	    {
	    	System.out.println(originalNum+" is Armstrong Number");
flag=1;
	    }
	}
	
	public static void isPerfect(int num)
	{
		 
		    int sum = 0;		    
		    for(int i=1; i<num; i++)  
		    {  
		        if(num%i == 0)  
		        {  
		            sum += i;  
		        }  
		    }
		    if(num==sum) {
		    	System.out.println(num+" is Perfect Number");
		    	flag=1;

		    }
	}
	
	public static void isPalindrome(int num)
	{
	    int temp=num;
		int result=temp%10;
		temp/=10;
	    while(temp>0)
	    {
	        result*=10;
	        result+=(temp%10);
	        temp/=10;
	       

	    }
	    if(result==num) {
	    	System.out.println(num+" is Palindrome Number");
	    	flag=1;

	    }
	    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primeNumbers="";
		int counter;
		for (int i = 1; i <= 100; i++)         
	       { 		  	  
	          counter=0; 	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	       
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Number:");
	       int num=sc.nextInt();
	       sc.close();
	       isArmstrong(num);
	       isPerfect(num);
	       isPalindrome(num);
	       if(flag==0)
	       {
	    	   System.out.println(num+" is neither of them");
	       }
	       

	}
}
