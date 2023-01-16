
public abstract class Food implements Payment {
	private int type;
	private double cost;
	
	public Food (int type) {
		super();
		this.type = type;
		//this.cost = cost;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public abstract double calculateCost();

}
