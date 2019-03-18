package a5;

public class RicePortion extends IngredientPortionImpl implements IngredientPortion {

	public RicePortion (double amount) {
		super(amount);
		this.ingredient = new Rice();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			RicePortion rice = new RicePortion(this.getAmount() + other.getAmount());
			return rice;
		}
	}
}
