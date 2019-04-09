package a5;

public class SeaweedPortion extends IngredientPortionImpl implements IngredientPortion {

	public SeaweedPortion (double amount) {
		super(amount);
		this.ingredient = new Seaweed();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			SeaweedPortion sea = new SeaweedPortion(this.getAmount() + other.getAmount());
			return sea;
		}
	}

}
