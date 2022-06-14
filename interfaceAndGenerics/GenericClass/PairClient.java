package interfaceAndGenerics.GenericClass;

public class PairClient {

	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair<Integer>();
		p1.one=10;
		p1.two=20;
		Pair<String> p2 = new Pair<String>();
		p2.one="Hello";
		p2.two="World";
		
		PairTwo<Integer, String> p3 = new PairTwo<Integer, String>();
		p3.one=5;
		p3.two="xyz";
		
	}

}
