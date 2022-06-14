package codeFORCES;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FiveCards {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int [] arr = new int[5];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum=0;
		for(int a=0;a<5;a++)
		{
			
			arr[a]= scn.nextInt();
			sum+=arr[a];
			if(map.containsKey(arr[a]))
			{map.put(arr[a],map.get(arr[a])+1);}
			else
			{map.put(arr[a],1);}
			
		}
		
		int ans = sum;
		int local=0;
		Set<Map.Entry<Integer , Integer>> ss =map.entrySet();
		
		for(Map.Entry<Integer , Integer>s:ss)
		{
			int x = s.getValue();
			if(x>=2)
			{
				if(x==2 || x==3)
				local= sum- s.getKey()*x;
				else
				{local= sum- s.getKey()*3;}
				
				if(local<ans)
				{ans= local;}
			}
		}
		System.out.println(ans);
		
	}

}
