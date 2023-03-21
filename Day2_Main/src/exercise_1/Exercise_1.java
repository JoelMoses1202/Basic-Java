package exercise_1;


import java.io.*;


public class Exercise_1{

	public static void main(String[] args)  {	
		
		FileReader fileReader = new FileReader("Test.txt");

	    System.out.println(fileReader.read());

	    fileReader.close();
		}
		
		
	


	}

