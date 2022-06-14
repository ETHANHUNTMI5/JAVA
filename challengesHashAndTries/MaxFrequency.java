package challengesHashAndTries;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MaxFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();
		
		if(map.containsKey(arr[a]))
		{
			map.put(arr[a],map.get(arr[a])+1);
		}
		
		else
		{
			map.put(arr[a],1);
		}
		
		
		}
		
		Set<Entry<Integer, Integer>> entries = map.entrySet();
		
		int max=0;
		int ans=0;
		
		for(Entry<Integer, Integer>entry:entries)
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				ans = entry.getKey();
				
			}
			
		}
		System.out.println(ans);
	}

}
