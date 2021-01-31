package Project;

import java.util.Arrays;

public class Checkout {
	 DessertItem dessertItem[]= new DessertItem[3];
	 static int count=0;
	 
	 public void cashRegister(DessertItem item) {
		   dessertItem[count]=item;
		   count++;	 
	 }
	 
	 public void clearCashRegister() {
		
		 dessertItem=null;
	 }
	 
	 public int getItems() {
		 if(dessertItem!=null) {
			 return dessertItem.length;
		 }
		 else {
			 return 0;
		 }
		
	 }
	 public int getCost() {
		 int sum=0;
		 for(DessertItem item:dessertItem) {
			 sum=sum+item.cost();
		 }
		return sum;
	 }

	 
	

}
