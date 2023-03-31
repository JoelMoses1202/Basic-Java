package exercise_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise_7 {
	
	public static void readLine(BufferedReader inputStream,PrintWriter outputStream) throws IOException
	{
		String l;
		while ((l = inputStream.readLine()) != null) {
			outputStream.println(l);
		}
	}

	public static void main(String[] args) throws IOException {
	
		    String input="/Users/joelmoses/Documents/hi.rtf";
		    String output="/Users/joelmoses/Documents/bye.rtf";
		    
		    File inputFile=new File(input);
		    
			BufferedReader inputStream =new BufferedReader(new FileReader(input));
			PrintWriter outputStream = new PrintWriter(new FileWriter(output));
			
            if(inputFile.exists()) {

			   readLine(inputStream, outputStream);
			   System.out.println("Line Read and wrote in destination");
			}
			
            else
            {
            	System.out.println("Files doesnot exsist");
            }
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		

	}

}
