package a5;

public class Sashimi implements Sushi {
	
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	private String name;
	private IngredientPortion[] ings = new IngredientPortion[1];
	
	public Sashimi(SashimiType type) {
		switch(type) {
		case TUNA:
			name = "tuna sashimi";
			ings[0] = new TunaPortion(0.75);
			break;
		case YELLOWTAIL:
			name = "yellowtail sashimi";
			ings[0] = new YellowtailPortion(0.75);
			break;
		case EEL:
			name = "eel sashimi";
			ings[0] = new EelPortion(0.75);
			break;
		case CRAB:
			name = "crab sashimi";
			ings[0] = new CrabPortion(0.75);
			break;
		case SHRIMP:
			name = "shrimp sashimi";
			ings[0] = new ShrimpPortion(0.75);
			break;
		}
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return ings;
	}

	@Override
	public int getCalories() {
		return (int)Math.round(ings[0].getCalories());
	}

	@Override
	public double getCost() {
		String result = String.format("%.2f", ings[0].getCost());
		return Double.parseDouble(result);
	}

	@Override
	public boolean getHasRice() {
		return ings[0].getIsRice();
	}

	@Override
	public boolean getHasShellfish() {
		return ings[0].getIsShellfish();
	}

	@Override
	public boolean getIsVegetarian() {
		return ings[0].getIsVegetarian();
	}
	

}
