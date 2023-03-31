package exercise_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_4 {


	public static void copyImg(FileInputStream input, FileOutputStream output) throws IOException {
		int ch = 0;
		while (ch != -1) {
			ch = input.read();
			output.write(ch);
		}
		System.out.println("Image Copied Succesfully");
	}

	public static void main(String[] args) throws IOException {

		File source = new File("/Users/joelmoses/Documents/2.png");
		FileInputStream input = new FileInputStream(source);
		FileOutputStream output = new FileOutputStream(new File("/Users/joelmoses/Documents/3.png"));

		if (source.exists()) {
			System.out.println("File found in the directory");
			copyImg(input, output);
		} else {
			System.out.println("No file found in the directory");
		}
		if (output != null) {
			output.close();
		}
		if (input != null) {
			input.close();
		}
	}

}
