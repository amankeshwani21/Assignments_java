package Project;

public abstract class DessertItem {
    String name;
    public DessertItem() {
		// TODO Auto-generated constructor stub
	}
    public DessertItem(String name) {
		// TODO Auto-generated constructor stub
    	this.name=name;
	}
    public abstract int cost();
    
    public final String printInfo() {
    	return this.name;
    }
}
