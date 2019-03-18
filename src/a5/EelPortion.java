package a5;

public class EelPortion extends IngredientPortionImpl implements IngredientPortion {

	public EelPortion (double amount) {
		super(amount);
		this.ingredient = new Eel();
	}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other.equals(null)) {
			return this;
		} else if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("Ingredients are not the same");
		} else {
			EelPortion eel = new EelPortion(this.getAmount() + other.getAmount());
			return eel;
		}
	}

}
