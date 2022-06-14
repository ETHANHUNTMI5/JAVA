package pepcoding;

import java.util.ArrayList;
import java.util.HashSet;

public class Prac {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int a=0;a<=5;a++)
		{
			arr.add(a);
		}

		System.out.println(arr.contains(3));
		System.out.println(arr);
		System.out.println(set);
	}

}
