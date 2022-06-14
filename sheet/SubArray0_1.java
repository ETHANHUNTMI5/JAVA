package sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArray0_1 {

	public static void main(String[] args) {
		
		int [] arr = {0, 0, 0, 1, 0, 1, 1};
		int n = arr.length;
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]==0)
			{arr[a]=-1;}
		}
		
		int [] pre = new int[n];
		
		pre[0] = arr[0];
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(pre[0],1);
		for(int a=1;a<n;a++)
		{
			pre[a] = pre[a-1]+arr[a];
			
			if(map.containsKey(pre[a]))
			{
				map.put(pre[a],map.get(pre[a])+1);
			}
			else
			{
				map.put(pre[a],1);
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i : pre)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(map);

		ArrayList<Map.Entry<Integer,Integer>> ll = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
	int ans=0;
		for(int a=0;a<ll.size();a++)
		{
			if(ll.get(a).getKey()==0)
			{
				int k = ll.get(a).getValue();
				ans= ans + k + (k)*(k-1)/2;
			}
			else
			{int k = ll.get(a).getValue();
			
			ans = ans + (k)*(k-1)/2;
				
			}
		}
		System.out.println(ans);
	}

}
