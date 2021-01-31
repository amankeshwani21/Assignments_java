package Project;

public class Candy extends DessertItem {
	
	double weight;
	int price;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	public Candy(double weight,int price) {
		// TODO Auto-generated constructor stub
		this.weight=weight;
		this.price=price;
	}
	public int cost() {
		return (this.price);
	}

	
	

}
