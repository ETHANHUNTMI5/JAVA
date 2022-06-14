package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int [] arr1 = new int[n];
		int [] arr2 = new int[m];
		
		for(int a=0;a<n;a++)
		{arr1[a]=scn.nextInt();
		map.put(arr1[a],1);}
		
		for(int a =0;a<m;a++)
		{
			arr2[a]=scn.nextInt();
			
			int k = arr2[a];
			
			
			if(map.get(k)!=null && map.get(k)==1)
			{System.out.print(k+" ");}
			
			// or use a hashmap of integer and boolean ...
		}
		
		
		
	}

}
