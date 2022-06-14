package aatCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
	    ArrayList<Long> arr = new ArrayList<Long>();
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(long a=0;a<n;a++)
		{
			arr.add(scn.nextLong());
			map.put(arr.get((int) a),a+1);
		}
		
		Collections.sort(arr);
		
		long ans = arr.get((int) (n-2));
		System.out.println(map.get(ans));
		
	}

}
