package interfaceAndGenerics;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car>{

	@Override
	public int compare(Car pcar, Car ocar) {
		
		
		return pcar.colour.compareTo(ocar.colour);
	}

}
