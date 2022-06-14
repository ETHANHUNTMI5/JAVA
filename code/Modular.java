package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Modular {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		
		for(int w=1;w<=t;w++)
		{
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int N = scn.nextInt();
			int M = scn.nextInt();
			
			int k=0;
			for(int a=2;a<=N;a++)
			{
				int num = M%a;
				
				if(map.containsKey(num))
				{map.put(num,map.get(num)+1);}
				else
				{
					map.put(num,1);
				}
				
				
			}
			
			Set<Map.Entry<Integer, Integer>> keys = map.entrySet();
			
			int sans=0;
			int ans=0;
			for(Map.Entry<Integer, Integer> key:keys)
			{
				int get = key.getValue();
				sans = (get)*(get-1)/2;
				
				ans = ans+sans;
			}
			
			
			ans = ans + N-1;
			System.out.println(map);
			System.out.println(ans);
			
		}
		
		
	}

}
