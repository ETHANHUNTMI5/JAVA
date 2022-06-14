package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class Digital {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s= scn.nextLine();
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0,2);
		map.put(1,7);
		map.put(2,2);
		map.put(3,3);
		map.put(4,3);
		map.put(5,4);
		map.put(6,2);
		map.put(7,5);
		map.put(8,1);
		map.put(9,2);
			
		
		String c1= s.charAt(0)+"";
		String c2 = s.charAt(1)+"";
		
		int b1 = Integer.parseInt(c1);
		int b2 =Integer.parseInt(c2);
		
		
		System.out.println(map.get(b1)*map.get(b2));
		
	}

}
