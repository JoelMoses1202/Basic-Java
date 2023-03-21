package exercise_5;

class Batsman {
	public void play(Ball ball, String side) {
		try {
			ball.play(side);
		} catch (OffSide on) {
			on.printStackTrace();
			new Boundry().handle(on);
		} catch (OnSide of) {
			of.printStackTrace();
			new Boundry().handle(of);
		} catch (Side d) {
			d.printStackTrace();
		}
	}
}
