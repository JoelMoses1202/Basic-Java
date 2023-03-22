package visitor;

class Ball {
	public void play(String item) throws Side {
		if (item.equals("on")) {
			throw new OnSide("Pull Shot");
		} else if (item.equals("off")) {
			throw new OffSide("Cover Drive");
		}
	}
}