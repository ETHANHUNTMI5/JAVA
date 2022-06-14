package leetCode;

import java.util.HashMap;

public class NiceSub {

	public static void main(String[] args) {
	
		int [] arr = {2,2,2,1,2,2,1,2,2,2};
		
		int k = 2;
		
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]%2==0)
			{
				arr[a]=0;
			}
			else
			{
				arr[a]=1;
			}
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(0,1);
		int [] pre = new int[arr.length];
		pre[0]=arr[0];

		int ans =0;
		for(int a=1;a<arr.length;a++)
		{
			pre[a]=arr[a]+pre[a-1];
			
			
		}
	
		for(int a=0;a<arr.length;a++)
		{
			if(map.containsKey(pre[a]-k))
			{
				ans+=map.get(pre[a]-k);
			}
			
			if(map.containsKey(pre[a]))
			map.put(pre[a],map.get(pre[a])+1);
			
			else
			{map.put(pre[a],1);}
		
			
		}
		System.out.println(ans);
	
	}
}