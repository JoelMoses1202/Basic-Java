package visitor;

class OnSide extends Side {

	public OnSide(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Shot is..............:" + this.message;
	}
}