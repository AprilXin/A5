package a5;

public class Nigiri implements Sushi {
	
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	private String name;
	private IngredientPortion[] ings = new IngredientPortion[2];
	
	public Nigiri(NigiriType type) {
		ings[0] = new RicePortion(0.5);
		switch(type) {
		case TUNA:
			name = "tuna nigiri";
			ings[1] = new TunaPortion(0.75);
			break;
		case YELLOWTAIL:
			name = "yellowtail nigiri";
			ings[1] = new YellowtailPortion(0.75);
			break;
		case EEL:
			name = "eel nigiri";
			ings[1] = new EelPortion(0.75);
			break;
		case CRAB:
			name = "crab nigiri";
			ings[1] = new CrabPortion(0.75);
			break;
		case SHRIMP:
			name = "shrimp nigiri";
			ings[1] = new ShrimpPortion(0.75);
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
		double sum = ings[0].getCalories();
		sum += ings[1].getCalories();
		return (int)Math.round(sum);
	}

	@Override
	public double getCost() {
		String result = String.format("%.2f", ings[0].getCost() + ings[1].getCost());
		return Double.parseDouble(result);
	}

	@Override
	public boolean getHasRice() {
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		return ings[1].getIsShellfish();
	}

	@Override
	public boolean getIsVegetarian() {
		return ings[1].getIsVegetarian();
	}

}
