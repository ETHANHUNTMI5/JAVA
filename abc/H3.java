package abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class H3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			
			int n = scn.nextInt();
			int m = scn.nextInt();
			int k = scn.nextInt();
			
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int a=0;a<k;a++)
			{
				int p = scn.nextInt();
				
				if(p<=n)
				{
					if(map.containsKey(p))
					{map.put(p,map.get(p)+1);}
					
					else
					{
						map.put(p,1);
					}
					
				}
				
				
			}
			
	ArrayList<Map.Entry<Integer, Integer>> keys = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
	ArrayList<Integer> ans = new ArrayList<Integer>();
	int che=0;
	for(Entry<Integer, Integer> x : keys)
	{
		if(x.getValue()>=2)
		{
			che++;
			ans.add(x.getKey());
		}
		
	}
	
	System.out.print(che+" ");
	for(int i : ans)
	{System.out.print(i+" ");}
		
		
	System.out.println();}


	}
	}
