package exercise_5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_5 {



	public static void readFile(FileInputStream input) throws IOException {
		int ch = 0;
		while (ch != -1) {
			ch = input.read();
			System.out.print((char) ch);
		}

		System.out.println("\nFile Contents displayed Succesfully");
	}

	public static void main(String[] args) throws FileCannotBeReadException  {
		try {
		File source = new File("/Users/joelmoses/Documents/hey.rt");
		
		FileInputStream input = new FileInputStream(source);
			readFile(input);
			if (input != null) {
				input.close();
			}
		}
		

		catch(Exception e)
		{
			throw new FileCannotBeReadException();
		}

		
	}

}
