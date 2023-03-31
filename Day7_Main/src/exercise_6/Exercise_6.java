package exercise_6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_6 {

	public static void copyFile(FileReader fileReader, FileWriter fileWriter) throws IOException {
		int c;
		while ((c = fileReader.read()) != -1) {
			fileWriter.write(c);
		}
		System.out.println("Copy finish...");
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String input = "/Users/joelmoses/Documents/hi.rtf";
		String output = "/Users/joelmoses/Documents/hey.rtf";
		File inputFile = new File(input);
		File ouputFile = new File(output);
		FileReader fileReader = new FileReader(input);
		FileWriter fileWriter = new FileWriter(output);
		if (inputFile.exists()) {

			if (!ouputFile.exists()) {
				copyFile(fileReader, fileWriter);

			} else {
				System.out.println("Do you wish to Override exsisting File, Type Yes or No");
				String msg = scanner.next();
				if (msg.equals("yes")) {
					copyFile(fileReader, fileWriter);

				} else {
					System.out.println("Copy File Operation Denied");
				}

			}
		} else {
			System.out.println("No file found in the directory");

		}
		if (fileReader != null)
			fileReader.close();
		if (fileWriter != null)
			fileWriter.close();
		if (scanner != null) {
			scanner.close();
		}
	}

}
