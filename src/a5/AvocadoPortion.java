package a5;

public class AvocadoPortion extends IngredientPortionImpl implements IngredientPortion {

	public AvocadoPortion (double amount) {
		super(amount);
		this.ingredient = new Avocado();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			AvocadoPortion avo = new AvocadoPortion(this.getAmount() + other.getAmount());
			return avo;
		}
	}

}
