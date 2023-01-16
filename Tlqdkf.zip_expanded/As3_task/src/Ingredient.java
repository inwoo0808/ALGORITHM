
public class Ingredient extends Food {
	public Ingredient (int type) {
		super(type);
	}

	public double calculateCost() {
		double cost = 0;
				
		if (getType() == 3 || getType() == 4) {
			cost = 50;
		} else cost = 0;
		
		return cost;
	}
}
