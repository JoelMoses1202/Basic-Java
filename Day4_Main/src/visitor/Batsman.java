package visitor;

class Batsman {
	public void play(Ball ball, String side) {
		try {
			ball.play(side);
		} catch (OffSide off) {
			off.printStackTrace();
			new Boundry().handle(off);
		} catch (OnSide on) {
			on.printStackTrace();
			new Boundry().handle(on);
		} catch (Side sideException) {
			sideException.printStackTrace();
		}
	}
}
