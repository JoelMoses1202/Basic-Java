package command;

public class CommandDemo {

	public static void main(String[] args) {

		Light light = new Light();
		Fan fan = new Fan();
		Lock lock = new Lock();

		Card card = new Card();

		card.setCommand(1, new InCommand(light, fan, lock));
		card.setCommand(2, new OutCommand(light, fan, lock));

		card.executeCommand(1);
		card.executeCommand(2);


	}
}
