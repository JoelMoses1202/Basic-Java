package command;
class Card {
	Command card[] = new Command[3];

	public Card() {
		for (int i = 0; i < card.length; i++) {
			card[i] = new Command() {
				@Override
				public void execute() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}

	public void executeCommand(int slot) {
		card[slot].execute();
	}

	public void setCommand(int slot, Command command) {
		card[slot] = command;
	}
}