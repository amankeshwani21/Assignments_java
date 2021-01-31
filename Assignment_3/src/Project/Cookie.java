package Project;

public class Cookie extends DessertItem {
	
	int units=4,price=10;
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(int units, int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
		this.units=units;
	}
	public int cost() {
		return (this.price/this.units);
	}


}
