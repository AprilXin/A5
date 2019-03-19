package a5;

public class GreenPlate extends PlateImpl implements Plate {
	
	public GreenPlate(Sushi contents) throws PlatePriceException {
		
		super(contents, 2.0, Color.GREEN);
		
	}

}
