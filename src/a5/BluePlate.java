package a5;

public class BluePlate extends PlateImpl implements Plate {
	
	public BluePlate(Sushi contents) throws PlatePriceException {
		
		this.color = Color.BLUE;
		this.price = 4.0;
		
		if (contents == null) {
			this.content = null;
		} else if (contents.getCost() >= this.price) {
			throw new PlatePriceException();
		}
		
		this.content = contents;
		
	}

}
