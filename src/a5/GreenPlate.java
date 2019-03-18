package a5;

public class GreenPlate extends PlateImpl implements Plate {
	
	public GreenPlate(Sushi contents) throws PlatePriceException {
		
		this.color = Color.GREEN;
		this.price = 2.0;
		
		if (contents == null) {
			this.content = null;
		} else if (contents.getCost() >= this.price) {
			throw new PlatePriceException();
		}
		
		this.content = contents;
		
	}

}
