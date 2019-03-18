package a5;

public class YellowtailPortion extends IngredientPortionImpl implements IngredientPortion {

	public YellowtailPortion (double amount) {
		super(amount);
		this.ingredient = new Yellowtail();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			YellowtailPortion yel = new YellowtailPortion(this.getAmount() + other.getAmount());
			return yel;
		}
	}
}
