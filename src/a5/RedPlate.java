package a5;

public class RedPlate extends PlateImpl implements Plate {
	
	public RedPlate(Sushi contents) throws PlatePriceException {
		
		super(contents, 1.0, Color.RED);
		
	}

}
