package a5;

public class GoldPlate extends PlateImpl implements Plate {
	
	public GoldPlate(Sushi contents, double price) throws PlatePriceException {
		
		this.color = Color.GOLD;
		
		if (price <= 5.0) {
			throw new IllegalArgumentException();
		}
		
		if (contents == null) {
			this.content = null;
		} else if (contents.getCost() >= this.price) {
			throw new PlatePriceException();
		}
		
		this.content = contents;
		this.price = price;
		
	}

}
