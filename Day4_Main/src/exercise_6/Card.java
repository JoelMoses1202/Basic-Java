package exercise_6;

class Card {
	Command c[] = new Command[3];

	public Card() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Command() {
				@Override
				public void execute() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}

	public void executeCommand(int slot) {
		c[slot].execute();
	}

	public void setCommand(int slot, Command cc) {
		c[slot] = cc;
	}
}