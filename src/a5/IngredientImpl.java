package a5;

public class IngredientImpl implements Ingredient {
	
	private String name;
	private double caloriesPerDollar;
	private int caloriesPerOunce;
	private double pricePerOunce;
	private boolean isVege;
	private boolean isRice;
	private boolean isShellfish;
	
	public IngredientImpl(String n, int cpo, double ppo, boolean v, boolean r, boolean s) {
		this.name = n;
		this.caloriesPerOunce = cpo;
		this.pricePerOunce = ppo;
		this.isVege = v;
		this.isRice = r;
		this.isShellfish = s;
		
		this.caloriesPerDollar = cpo / ppo;
		
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getCaloriesPerDollar() {
		return caloriesPerDollar;
	}

	@Override
	public int getCaloriesPerOunce() {
		return caloriesPerOunce;
	}

	@Override
	public double getPricePerOunce() {
		return pricePerOunce;
	}

	@Override
	public boolean equals(Ingredient other) {
		if (this.getName().equals(other.getName())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean getIsVegetarian() {
		return isVege;
	}

	@Override
	public boolean getIsRice() {
		return isRice;
	}

	@Override
	public boolean getIsShellfish() {
		return isShellfish;
	}

}
