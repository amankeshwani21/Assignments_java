package Project;

public class TestCheckout {
  public static void main(String[] args) {
	Checkout c=new Checkout();
	IceCream ice1=new IceCream();
	Cookie c1=new Cookie();
	c.cashRegister(c1);
	c.cashRegister(ice1);
	c.cashRegister(ice1);
	
	System.out.println(c.getItems());
	System.out.println(c.getCost());
	System.out.println(c.toString());
	c.clearCashRegister();
	}
}
