package a5;

public class BluePlate extends PlateImpl implements Plate {
	
	public BluePlate(Sushi contents) throws PlatePriceException {
		
		super(contents, 4.0, Color.BLUE);
		
	}

}
