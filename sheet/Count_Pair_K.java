package sheet;

import java.util.HashMap;
import java.util.Map;

public class Count_Pair_K {

	public static void main(String[] args) {
		int k = 3;
		int [] arr = {5, 9, 36, 74, 52, 31, 42};
		HashMap<Integer,Integer>map = new HashMap();
		int n = arr.length;
		for(int a=0;a<n;a++)
		{
			arr[a] = arr[a]%k;
			if(!map.containsKey(arr[a]))
			{map.put(arr[a],1);}
			else
			{map.put(arr[a],map.get(arr[a])+1);}
		}
	    int ans=0;
		for(int a=0;a<k;a++)
		{
			if(map.containsKey(a))
			{
				if(k%2==0 && k/2==a)
				{ans+=map.get(a)/2;}
				else
				{
					if(map.containsKey(k-a))
					{
						ans+=map.get(a)*map.get(k-a);
					}
					map.remove(k-a);
				}
				
			}
		}
		if(map.containsKey(0))
		{ans+=map.get(0);}
		System.out.println(ans);
	}

}
