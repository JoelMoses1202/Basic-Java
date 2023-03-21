package exercise_6;

class OutCommand extends Command {
	public OutCommand(Light light, Fan fan, Lock lock) {
		this.light = light;
		this.fan = fan;
		this.lock = lock;

	}

	@Override
	public void execute() {
		System.out.println("OUT COMMAND initiated....");
		light.off();
		fan.off();
		lock.out();

	}
}