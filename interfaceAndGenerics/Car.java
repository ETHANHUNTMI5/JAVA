package interfaceAndGenerics;

public class Car {//implements Comparable<Car>{

	int speed;
	int price;
	String colour;

public Car(int speed,int price,String colour)
{
     this.speed=speed;
     this.price=price;
     this.colour=colour;
 
}

@Override
public String toString() {
	
	return "S:"+this.speed+" P:"+this.price+" C:"+this.colour;
}



//@Override
//public int compareTo(Car other) {
//	return this.speed-other.speed;
//	return other.price-this.price;
//	return this.colour.compareTo(other.colour);
}

