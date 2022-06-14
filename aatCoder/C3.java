package aatCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C3 {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long k = scn.nextLong();
		
		
		
		long [] arr = new long[(int) n];
		TreeMap<Long, Integer> m1 = new TreeMap<Long, Integer>();
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			m1.put((long) arr[a],a);
			
		}

		long min = k/n;
		k = k%n;
		
		long[] ans = new long[(int) n];
		
		for(int a=0;a<n;a++)
		{
			ans[a]= min;
		}
		
		ArrayList<Map.Entry<Long, Integer>> keys = new ArrayList<Map.Entry<Long,Integer>>(m1.entrySet());
		
		for(int a=0;a<k;a++)
		{
		int g = keys.get(a).getValue();
		ans[g]=ans[g]+1;
			
		}
		for(long l : ans)
		{
			System.out.println(l);
		}
		
	}
}