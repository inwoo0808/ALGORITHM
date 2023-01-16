
public class Extra extends Food {
	
	public Extra (int type) {
		super(type);
	}
	
	public double calculateCost() {
		double cost = 0;
		
		if (super.getType() == 1) {
			cost = 1500;
		} else if (super.getType() == 2) {
			cost = 1300;
		} else {
			cost = 1700;
		}
		
		return cost;
	}

}
