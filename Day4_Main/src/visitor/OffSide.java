package visitor;

class OffSide extends Side {
	public OffSide(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Shot is..............:" + this.message;
	}
}