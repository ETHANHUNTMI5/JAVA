package interfaceAndGenerics;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car pcar, Car ocar) {
		
		
		return pcar.speed-ocar.speed;
	}

}
