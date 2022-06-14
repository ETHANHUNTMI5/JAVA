package interfaceAndGenerics;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car pcar, Car ocar) {
		
		return ocar.price-pcar.price;
	}

}
