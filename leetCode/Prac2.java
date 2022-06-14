package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class Prac2 {

	public static void main(String[] args) {
		long n=10;

		long [] arr = {10,10,10,10,10,10,10,10,10,10};
		
   long l = arr.length;
		 ArrayList<Long > ll = new ArrayList<Long>();
		
		for(long a=0;a<n;a++)
		{ll.add(arr[(int)a]);}
		
		System.out.println(ll);
		Collections.sort(ll);
		
		long ans=1;
		
		for(long a=1;a<n;a++)
		{
			if(ll.get((int)a)>=ll.get((int)a-1)+1)
			{ll.set((int)a, ll.get((int)a-1)+1);
				ans = ans+1;
			}
			
		
		}
		System.out.println(ll);
	System.out.println(ans);	
		}
}
