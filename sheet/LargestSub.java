package sheet;

import java.util.HashMap;

public class LargestSub {
	public static HashMap<Integer,Integer> map = new HashMap();
	public static HashMap<Integer,Integer> rank = new HashMap();
	public static void main(String[] args) {
		int ans=1;
		int [] arr = {10, 12, 12, 10, 10, 11, 10};
		int n = arr.length;
		for(int a=0;a<n;a++)
		{
			int g = arr[a];
			if(map.containsKey(arr[a]))
			{map.clear();
			rank.clear();}
			map.put(arr[a],arr[a]);
			rank.put(arr[a],1);
			if(map.containsKey(arr[a]-1))
			{
				int s1 = find(arr[a]);
				int s2 = find(arr[a]-1);
				if(s1!=s2)
				{
					map.put(s1,s2);
					rank.put(s2,rank.get(s2)+rank.get(s1));
					if(rank.get(s2)>ans)
					{ans= rank.get(s2);}
				}
			}
			if(map.containsKey(arr[a]+1))
			{
				int s1 = find(arr[a]);
				int s2 = find(arr[a]+1);
				if(s1!=s2)
				{
					map.put(s2,s1);
					rank.put(s1,rank.get(s1)+rank.get(s2));
					if(rank.get(s1)>ans)
					{ans=rank.get(s1);}
				}
				
			}
		
		}
		System.out.println(ans);
	}
	
	public static int find(int v)
	{
		if(map.get(v)==v)
		{return v;}
		
	
		int p = map.get(v);
		int g = find(p);
		map.put(v,g);
		return g;
	}


}
