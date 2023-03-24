package visitor;

class Boundry {
	public void handle(OffSide off) {
		System.out.println("Boundry....4");
	}

	public void handle(OnSide on) {
		System.out.println("Boundry....6");
	}
}