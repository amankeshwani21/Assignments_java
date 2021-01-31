package Project;

public class IceCream extends DessertItem {
	int price=20;
      public IceCream() {
		// TODO Auto-generated constructor stub
	}
      public IceCream(int price) {
  		// TODO Auto-generated constructor stub
    	  this.price=price;
  	}
      
      public int cost() {
  		return this.price;
  	}
}
