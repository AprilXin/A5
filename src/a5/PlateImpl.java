package a5;

public class PlateImpl implements Plate {
	
	protected Sushi content = null;
	protected double price = 0.0;
	protected Color color;

	@Override
	public Sushi getContents() {
		return content;
	}

	// If the plate is empty, returns null. 
	// If not, the plate is made empty and the prior contents of the plate is returned.
	@Override
	public Sushi removeContents() {
		
		if (content == null) {
			return null;
		} else {
			Sushi prior = content;
			content = null;
			return prior;
		}
		
	}

	@Override
	public void setContents(Sushi s) throws PlatePriceException {
		
		if (s == null) {
			throw new IllegalArgumentException();
		}
		
		if (s.getCost() >= this.price) {
			throw new PlatePriceException();
		}
		
		content = s;

	}

	@Override
	public boolean hasContents() {
		
		if (content == null) {
			return false;
		} else {
			return true;
		}
		
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public double getProfit() {
		
		if (content == null) {
			return 0.0;
		} else {
			return (this.price - content.getCost());
		}
		
	}

}
