package visitor;

import java.util.Scanner;

public class Visitor {

	public static void main(String[] args) {
		Batsman batsman = new Batsman();
		Ball ball = new Ball();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter side to bowl:");
		String side = scanner.next();
		batsman.play(ball, side);
	}
}
