package exercise_5;

class OnSide extends Side {

	public OnSide(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Shot is..............:" + this.message;
	}
}