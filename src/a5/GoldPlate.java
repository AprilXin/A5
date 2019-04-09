package a5;

public class GoldPlate extends PlateImpl implements Plate {
	
	public GoldPlate(Sushi contents, double price) throws PlatePriceException {
		
		super(contents, checkPrice(price), Color.GOLD);
		
			
	}
	
	public static double checkPrice (double price) {
		
		if (price <= 5.0) {
			throw new IllegalArgumentException();
		} else {
			return price;
		}
		
	}

}
