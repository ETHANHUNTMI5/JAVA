package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class LongSS {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		
		int n = s1.length();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		int max=1;
		
		z:for(int i = 0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				char cc= s1.charAt(j);
				
				if(map.containsKey(cc))
				{map.put(cc,map.get(cc)+1);}
				else
				{
					map.put(cc,1);
				}
				
				Collection<Integer> vals = map.values();
				
				for(int p : vals)
				{
					if(p>1)
					{map.clear();
					
				    continue z;	}
				}
				
				System.out.println(map);
				if(map.size()>max)
				{max=map.size();}
			}
		}
        		System.out.println(max);	
 		

	}
}