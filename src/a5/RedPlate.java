package a5;

public class RedPlate extends PlateImpl implements Plate {
	
	public RedPlate(Sushi contents) throws PlatePriceException {
		
		this.color = Color.RED;
		this.price = 1.0;
		
		if (contents == null) {
			this.content = null;
		} else if (contents.getCost() >= this.price) {
			throw new PlatePriceException();
		}
		
		this.content = contents;
		
	}

}
