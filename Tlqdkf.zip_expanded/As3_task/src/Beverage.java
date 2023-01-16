
public class Beverage extends Food {
	private boolean ice;
	
	public Beverage (int type, boolean ice) {
		super(type);
		setIce(ice);
		
	}

	public boolean isIce() {
		return ice;
	}

	public void setIce(boolean ice) {
		this.ice = ice;
	}

	public double calculateCost() {
		double cost = 0;
		if (super.getType() == 1) {
			cost = 1000;
		} else if (super.getType() == 2) {
			cost = 1100;
		} else if (super.getType() == 3) {
			cost = 900;
		} else if (super.getType() == 4) {
			cost = 1200;
		} else if (super.getType() == 5){
			cost = 2000;
		} else cost = 0;
		
		return cost;
	}
}
