package Project;

public class Sundae extends IceCream {
       int toppings=15;
       
       public Sundae() {
		// TODO Auto-generated constructor stub
	}
       public Sundae(int toppings) {
   		// TODO Auto-generated constructor stub
    	   this.toppings=toppings;
   	}
       public int cost() {
     		return super.price+this.toppings;
     	}
}
