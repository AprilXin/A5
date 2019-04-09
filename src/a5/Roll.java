package a5;

public class Roll implements Sushi {
	
	private String name;
	private IngredientPortion[] ings;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		this.name = name;
		if (roll_ingredients.equals(null)) {
			throw new RuntimeException("Array is null");
		}
		
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].equals(null)) {
				throw new RuntimeException("Ingredient is null");
			}
		}
		
		for (int i = 0; i < roll_ingredients.length; i++) {
			for (int z = i + 1; z < roll_ingredients.length; z++) {
				if (roll_ingredients[i].getIngredient().equals(roll_ingredients[z].getIngredient())) {
					roll_ingredients[i] = roll_ingredients[i].combine(roll_ingredients[z]);
					for (int y = z; y < roll_ingredients.length - 1; y++) {
						roll_ingredients[y] = roll_ingredients[y + 1];
					}
					roll_ingredients[roll_ingredients.length - 1] = null;
					IngredientPortion[] ingres = new IngredientPortion[roll_ingredients.length - 1];
					for (int k = 0; k < ingres.length; k++) {
						ingres[k] = roll_ingredients[k];
					}
					roll_ingredients = ingres;
				}
			}
		}
		
		boolean ifSea = false;
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIngredient().getName().equals("seaweed")) {
				ifSea = true;
				if (roll_ingredients[i].getAmount() < 0.1) {
					roll_ingredients[i] = new SeaweedPortion(0.1);
				}
			}
		}
		
		if (!ifSea) {
			IngredientPortion[] ingres = new IngredientPortion[roll_ingredients.length + 1];
			for (int i = 0; i < roll_ingredients.length; i++) {
				ingres[i] = roll_ingredients[i];
			}
			ingres[ingres.length - 1] = new SeaweedPortion(0.1);
			roll_ingredients = ingres;
		}
		
		this.ings = roll_ingredients.clone();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return ings.clone();
	}

	@Override
	public int getCalories() {
		double sum = 0;
		for (int i = 0; i < ings.length; i++) {
			sum += ings[i].getCalories();
		}
		return (int)Math.round(sum);
	}

	@Override
	public double getCost() {
		double sum = 0;
		for (int i = 0; i < ings.length; i++) {
			sum += ings[i].getCost();
		}
		String result = String.format("%.2f", sum);
		return Double.parseDouble(result);
	}

	@Override
	public boolean getHasRice() {
		for (int i = 0; i < ings.length; i++) {
			if (ings[i].getIsRice()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i = 0; i < ings.length; i++) {
			if (ings[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i = 0; i < ings.length; i++) {
			if (!ings[i].getIsVegetarian()) {
				return false;
			}
		}
		return true;
	}

}
