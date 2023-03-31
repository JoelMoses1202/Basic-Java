package Exercise_4;

public class Coffee {
	private int price;
	private String coffeeName = "";

//	int[] salesForWeek = { 175, 150, 60, 155, 90 };
//	String[] coffees = { "Colombian", "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };
	public void setCoffee(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public String getCoffee() {
		return this.coffeeName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
