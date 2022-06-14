package a111;

import java.util.ArrayList;

public class F1 {

	public static void main(String[] args) {

		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(1); ll.add(2); ll.add(3); ll.add(4); ll.add(2);ll.add(5);
		System.out.println(ll);
		ll.remove((4));
		System.out.println(ll);
		
	}
}