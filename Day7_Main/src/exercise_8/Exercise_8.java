package exercise_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Exercise_8 {
	public static void writeObject(ObjectOutputStream objectOutputStream, LocalDate localDate) throws IOException {
		objectOutputStream.writeObject(localDate);

	}

	public static LocalDate readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
		LocalDate temp = (LocalDate) objectInputStream.readObject();
		return temp;

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		LocalDate localDate = LocalDate.now();
		String input = "/Users/joelmoses/eclipse-workspace/Day7_Main/src/exercise_8/bye.dat";
		String output = "/Users/joelmoses/eclipse-workspace/Day7_Main/src/exercise_8/bye.dat";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(input));
		writeObject(objectOutputStream, localDate);
		if (objectOutputStream != null) {
			objectOutputStream.close();
		}
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(output));
		System.out.println(readObject(objectInputStream));
		if (objectInputStream != null) {
			objectInputStream.close();
		}

	}

}
