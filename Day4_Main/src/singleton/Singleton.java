package singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			System.out.println("NEW OBJECT CREATED");
			instance = new Singleton();
		}
		System.out.println("OLD OBJECT USED");
		return instance;

	}

}