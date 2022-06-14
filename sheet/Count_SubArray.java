package sheet;

import java.util.Collection;
import java.util.HashMap;

public class Count_SubArray {

	public static void main(String[] args) {
		int [] arr = {4, 5, 0, -2, -3, 1,0,0};
		int k = 5;
		int n = arr.length;
		int [] pre = new int[n];
		pre[0] = arr[0];
		for(int a=1;a<n;a++)
		{
			pre[a] = arr[a]+pre[a-1];
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(arr[0]%k,1);
		for(int a=1;a<n;a++)
		{
			pre[a] = pre[a]%k;
			if(map.containsKey(pre[a]))
			{map.put(pre[a],map.get(pre[a])+1);}
			else
			{
				map.put(pre[a],1);
			}
			
		}
		System.out.println(map);
		
//		for(int i:pre)
//		{
//			System.out.print(i+" ");
//		}
		
		Collection<Integer> c = map.values();
		int ans =0;
		for(int l : c)
		{
			
			if(l>1)
			{
				ans =ans+ l*(l-1)/2;
			}
		}
		
		if(map.containsKey(0) && map.get(0)==1)
		{
			ans +=1;
		}
		System.out.println(ans);
		
	}

}
