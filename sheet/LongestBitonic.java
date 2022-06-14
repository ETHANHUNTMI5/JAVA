package sheet;

import java.util.ArrayList;
import java.util.Collections;

public class LongestBitonic {

	public static void main(String[] args) {
		int [] arr = {10,22,9,33,21,50,41,60,80,3};
		
		int n = arr.length;
		int [] left = new int[n];
		
		ArrayList<Integer> ll = new ArrayList<>();
		

		ll.add(arr[0]);
		left[0]=1;
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]>ll.get(ll.size()-1))
			{ll.add(arr[a]);}
			
			else
			{
				int idx = Collections.binarySearch(ll,arr[a]);
				
				if(idx<0)
				{
					idx = Math.abs(idx)-1;
					ll.set(idx,arr[a]);
				}
			}
			left[a] = ll.size();
		}
		ll.clear();
		int [] right = new int[n];
		right[n-1]=1;
		ll.add(arr[n-1]);
		
		
		for(int a=n-2;a>=0;a--)
		{
			if(arr[a]>ll.get(ll.size()-1))
			{ll.add(arr[a]);}
			
			else
			{
				int idx = Collections.binarySearch(ll,arr[a]);
				
				if(idx<0)
				{
					idx = Math.abs(idx)-1;
					ll.set(idx,arr[a]);
				}
			}
			right[a] = ll.size();
			
		}
		int ans=1;
		for(int a=0;a<n;a++)
		{ans = Math.max(ans, left[a]+right[a]-1);}
		System.out.println(ans);
	}

}
