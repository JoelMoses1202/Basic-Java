package exercise_2b;

import java.io.File;

public class Exercise_2b {


	public static void main(String[] args) {
		
		File file = new File("/Users/joelmoses/Documents/Create.odt");

		File rename = new File("/Users/joelmoses/Documents/delete.odt");

		if (file.exists()) {
			System.out.println("File found in the directory");
			
			if(rename.exists()) {
				System.out.println("Rename File Already exsist..");
				return;
			}

			if (file.renameTo(rename)) {

				System.out.println("File Successfully Rename");

			} else {

				System.out.println("Operation Failed");

			}
		} else {
			System.out.println("No file found in the directory");

		}

	}

}