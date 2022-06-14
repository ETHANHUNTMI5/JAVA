package twoD_Array;

import java.util.ArrayList;

public class ARRAYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list.size());

		list.add(10);
		System.out.println(list.size());
		System.out.println(list);
		list.add(20);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list.size());
		list.add(40);
		System.out.println(list.size());
		System.out.println(list)	;
		
		list.remove(2);
		System.out.println(list);
	}
}

