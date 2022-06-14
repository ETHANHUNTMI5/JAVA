package challengesHashAndTries;

import java.util.HashMap;
import java.util.Scanner;

public class SubArr {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		 int [] arr = new int[n];
		 for(int a=0;a<n;a++)
		 {
			 arr[a]= scn.nextInt();
			 
			 map.put(arr[a],0);
		 }

		 System.out.println(map);
		 
	}

}
