package exercise_2a;

import java.io.File;
import java.util.Scanner;

//delete.rtf
public class Exercise_2a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String path = "/Users/joelmoses/Documents/";
		String fileName = scanner.next();
		path += fileName;
		File file = new File(path);
		if (scanner != null) {
			scanner.close();
		}

		if (file.exists()) {
			System.out.println("File found in the directory");

			if (file.delete()) {
				System.out.println("File deleted successfully");

			} else {
				System.out.println("Failed to delete the file");
			}
		} else {
			System.out.println("No file found in the directory");
		}

	}

}
