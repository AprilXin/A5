package a5;

public class ShrimpPortion extends IngredientPortionImpl implements IngredientPortion {

	public ShrimpPortion (double amount) {
		super(amount);
		this.ingredient = new Shrimp();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			ShrimpPortion shr = new ShrimpPortion(this.getAmount() + other.getAmount());
			return shr;
		}
	}
}
