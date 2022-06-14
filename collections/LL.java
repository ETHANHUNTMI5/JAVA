package collections;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
	 
		System.out.println(ll.offer(1)); // adds at the tail and returns true
		
		System.out.println(ll.getLast());
		System.out.println(ll.remove(3));
	}

}
