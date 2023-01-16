
public class Cheese extends Food {
	public Cheese (int type) {
		super(type);
	}
	
	public double calculateCost() {
		double cost = 0;
		
		if (getType() == 2) {
			cost = 100;
		} else cost = 0;
		
		return cost;
	}
}
