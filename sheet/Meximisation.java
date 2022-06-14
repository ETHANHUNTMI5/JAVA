package sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Meximisation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			
			int n = scn.nextInt();
			int [] arr = new int[n];
			
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			
			for(int a=0;a<n;a++)
			{
				arr[a]= scn.nextInt();
				
				if(map.containsKey(arr[a]))
				{
					map.put(arr[a], map.get(arr[a])+1);
				}
				
				else
				{map.put(arr[a],1);}
				
			}
			
			
		
	ArrayList<Map.Entry<Integer, Integer>> ll = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());	
	
	for(int a=0;a<ll.size();a++)
	{
		System.out.print(ll.get(a).getKey()+" ");
		
		map.put(ll.get(a).getKey(),map.get(ll.get(a).getKey())-1);
		
	}
	
	for(int a=ll.size()-1;a>=0;a--)
	{
		int num = ll.get(a).getKey();
		int times = map.get(ll.get(a).getKey());
	
		
		for(int b=1;b<=times;b++)
		{System.out.print(num+" ");}
		
	}
	
	
	System.out.println();
		}
		
	}

}
