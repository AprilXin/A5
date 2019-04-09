package a5;

public class TunaPortion extends IngredientPortionImpl implements IngredientPortion {

	public TunaPortion (double amount) {
		super(amount);
		this.ingredient = new Tuna();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			TunaPortion tuna = new TunaPortion(this.getAmount() + other.getAmount());
			return tuna;
		}
	}
}
