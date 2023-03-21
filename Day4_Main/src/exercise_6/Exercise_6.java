package exercise_6;

public class Exercise_6 {

	public static void main(String[] args) {

		Light light = new Light();
		Fan fan = new Fan();
		Lock lock = new Lock();

		Card card = new Card();

		card.setCommand(1, new InCommand(light, fan, lock));
		card.setCommand(2, new OutCommand(light, fan, lock));

		card.executeCommand(1);

	}
}
