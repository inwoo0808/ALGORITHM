
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int i = 0;
	int burgerChoice;
	int cheeseChoice;
	int ingredientChoice = -1;
	int beverageChoice;
	int iceChoice;
	boolean iceBool;
	int extraChoice;
	double totalCost = 0;
	
	Food[] customFood = new Food[5];
	
	System.out.println("============================");
	System.out.println("Welcome to SKKU-SUBWAY!");
	System.out.println("Choose burgers (sandwiches):");
	System.out.println("1. Egg Mayo - 4,000 won");
	System.out.println("2. Chicken Tikka - 5,000 won");
	System.out.println("3. Chicken Ham - 5,000 won");
	System.out.println("4. Roasted Chicken - 5,500 won");
	System.out.println("0. Cancel Order");
	System.out.print("Select Burger (1-5): ");
	burgerChoice = scanner.nextInt();
	Burger burger = new Burger(burgerChoice);
	//customFood[0] = new Burger(burgerChoice);
	
	System.out.println("============================");
	System.out.println("Select Cheese Type:");
	System.out.println("1. American Cheese - (+0 won)");
	System.out.println("2. Swiss - (+100 won)");
	System.out.println("3. Cheddar - (+0 won)");
	System.out.print("Select Cheese (1-3): ");
	cheeseChoice = scanner.nextInt();
	//customFood[1] = new Cheese(cheeseChoice);
	Cheese cheese = new Cheese(cheeseChoice);
	burger.setCheeseObject(cheese);
	//customFood[0].set
	
	//ArrayList<Integer> ingredientsList = new ArrayList<>();
	//Ingredient[] ingredients = new Ingredient[100];
	
	while (ingredientChoice != 0) {
		
		System.out.println("============================");
		System.out.println("Select Ingredients:");
		System.out.println("1. Lettuce - (+0 won)");
		System.out.println("2. Tomatoes - (+0 won)");
		System.out.println("3. Cucumbers - (+50 won)");
		System.out.println("4. Olives - (+50 won)");
		System.out.println("0. Skip");
		System.out.print("Select Ingredients (1-4): ");
		ingredientChoice = scanner.nextInt();
		//Ingredient ingredients = new Ingredient(ingredientChoice);
		
		burger.AddIngredient(ingredientChoice);
	}
	
 	
	System.out.println("============================");
	System.out.println("Select Beverages:");
	System.out.println("1. Cola - 1,000 won");
	System.out.println("2. Fanta - 1,100 won");
	System.out.println("3. Chilsung Cider - 900 won");
	System.out.println("4. Zero Cola - 1,200 won");
	System.out.println("5. Coffee - 2,000 won");
	System.out.println("0. Skip");
	System.out.print("Select Beverage (1-5): ");
	beverageChoice = scanner.nextInt();
	
	System.out.println("============================");
	System.out.print("With ice? (0 [no] or 1[yes]): ");
	iceChoice = scanner.nextInt();
	
	if (iceChoice == 0) iceBool = true;
	else iceBool = false;
	
	Beverage beverage = new Beverage(beverageChoice,iceBool);
	
	/*
	if (beverageChoice != 0) {
		
		System.out.println("============================");
		System.out.print("With ice? (0 [no] or 1[yes]): ");
		iceChoice = scanner.nextInt();
	}*/
	
	System.out.println("============================");
	System.out.println("Select Extras:");
	System.out.println("1. Cookies - 1,500 won");
	System.out.println("2. French Fries - 1,300 won");
	System.out.println("3. Chips - 1,700 won");
	System.out.println("0. Skip");
	System.out.print("Select Extra (1-3): ");
	extraChoice = scanner.nextInt();
	Extra extra = new Extra(extraChoice);
	
	System.out.println("============================");
	System.out.printf("| Burger (with cheese and Ingredients): %.1f\n", burger.calculateCost());
	
	if (beverageChoice == 0) {
		
		System.out.printf("| no Beverage: %.1f\n", beverage.calculateCost());
		
	} else {
		
		if (iceBool) {
			
			System.out.printf("| Beverage (without ice): %.1f\n", beverage.calculateCost());
		} else {
			
			System.out.printf("| Beverage (with ice): %.1f\n", beverage.calculateCost());
			
		}
	}
	
	if (extraChoice  != 0) {

		System.out.printf("| Extra: %.1f\n", extra.calculateCost());
		
	}
	//오브젝트 루프로 돌려보기
	totalCost = burger.calculateCost() + beverage.calculateCost() + extra.calculateCost();
	System.out.printf("| TOTAL: %.1f", totalCost);

	}
	

}
