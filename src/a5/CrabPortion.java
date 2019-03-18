package a5;

public class CrabPortion extends IngredientPortionImpl implements IngredientPortion {

	public CrabPortion (double amount) {
		super(amount);
		this.ingredient = new Crab();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			CrabPortion crab = new CrabPortion(this.getAmount() + other.getAmount());
			return crab;
		}
	}
}
