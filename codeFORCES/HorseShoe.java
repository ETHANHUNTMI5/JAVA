package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class HorseShoe {

	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
		 for(int a=0;a<4;a++)
		 {
			 int s = scn.nextInt();
			 
			 if(map.containsKey(s))
			 {map.put(s,map.get(s)+1);}
			 else
			 {
				 map.put(s,1);
			 }
		 }

		 System.out.println(4-map.size());
	}

}
