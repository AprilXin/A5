package a5;

public class PlateImpl implements Plate {
	
	private Sushi content;
	private double price;
	private Color color;
	
	protected PlateImpl(Sushi contents, double price, Plate.Color color) throws PlatePriceException {
		
		if ((contents!= null) && (contents.getCost() > this.price)) {
			throw new PlatePriceException();
		}
		
		this.content = contents;
		this.color = color;
		this.price = price;
	}

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
