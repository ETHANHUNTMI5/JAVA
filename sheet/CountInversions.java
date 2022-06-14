package sheet;

import java.util.PriorityQueue;

public class CountInversions {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(2);
		heap.add(1);
		
		System.out.println(heap.poll());
		System.out.println(heap);
	}

}
