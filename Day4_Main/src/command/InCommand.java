package command;

class InCommand extends Command {

	public InCommand(Light light, Fan fan, Lock lock) {
		this.light = light;
		this.fan = fan;
		this.lock = lock;

	}

	@Override
	public void execute() {
		System.out.println("IN COMMAND initiated....");
		light.on();
		fan.on();
		lock.in();

	}
}