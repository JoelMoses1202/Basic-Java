package exercise_2c;

import java.io.File;
import java.util.Scanner;

public class Exercise_2c {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = "/Users/joelmoses/Documents/";
		String fileName = scanner.next();
		path += fileName;
		File file = new File(path);
		Files fileObj=new Files();
		fileObj.SetBytes(file.length());
		if (file.exists()) {
			System.out.println("File found in the directory");
			System.out.println(fileObj.getBytes() + " " + fileObj.getUnits());

		} else {
			System.out.println("No file found in the directory");
		}
		if (scanner != null) {
			scanner.close();
		}
	}

}