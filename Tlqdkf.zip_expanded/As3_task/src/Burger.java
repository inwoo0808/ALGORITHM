public class Burger extends Food {
	private Cheese cheeseObject;
	Ingredient[] ingredientsArray = new Ingredient[100];
	int c = 0;
	
	public Burger (int type) {
		super(type);
	}
	
	public void AddIngredient(int type) {
		ingredientsArray[c] = new Ingredient(type);
		c++;
	}

	public Cheese getCheeseObject() {
		return cheeseObject;
	}

	public void setCheeseObject(Cheese cheeseObject) {
		this.cheeseObject = cheeseObject;
	}

	public Ingredient[] getIngredientsArray() {
		return ingredientsArray;
	}
	
	public double calculateCost() {
		double cost;
		
		if (getType() == 1) {
			cost = 4000;
		} else if (getType() == 2 || getType() == 3) {
			cost = 5000;
		} else if (getType() == 4) {
			cost = 5500;
		} else cost = 0;
		
		cost = cost + cheeseObject.calculateCost();
		
		for (int i=0; i < ingredientsArray.length; i++) {
			cost = cost + ingredientsArray[i].calculateCost();
		}
		
		return cost;
	}

	
}