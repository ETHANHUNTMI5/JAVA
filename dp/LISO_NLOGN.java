package dp;

import java.util.ArrayList;
import java.util.Collections;

public class LISO_NLOGN {

	public static void main(String[] args) {
		
		int [] arr = {1,7,8,4,5,6,-1,9};
		
		ArrayList<Integer> ll = new ArrayList<>();
		
		ll.add(arr[0]);
		
		for(int a=1;a<arr.length;a++)
		{
			if(arr[a]>ll.get(ll.size()-1))
			{ll.add(arr[a]);}
			
			else
			{int idx = Collections.binarySearch(ll,arr[a]);
			
			if(idx<0)
			{
				idx = Math.abs(idx)-1;
				ll.set(idx,arr[a]);
			}
			}
		System.out.println(ll);}
		
		System.out.println(ll.size());// this gives the length and not the actual lcs!!-->imp
	}

}
