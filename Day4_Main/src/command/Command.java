package command;

abstract class Command {
	Light light;
	Fan fan;
	Lock lock;

	public abstract void execute();
}