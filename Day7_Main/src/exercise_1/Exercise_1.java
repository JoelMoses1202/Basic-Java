package exercise_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_1 {
	public static int countWords(String sentance) {
		if (sentance == null || sentance.isEmpty())
			return 0;
		String sen = sentance.replace(("\\n"), " ").replace("\\t", " ");
		System.out.println(sen);
		StringTokenizer tokens = new StringTokenizer(sen," ");
		return tokens.countTokens();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentance = scanner.nextLine();
		scanner.close();
		System.out.println(countWords(sentance));

	}

}