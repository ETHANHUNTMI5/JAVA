package pepcoding;

import java.util.Stack;

public class MaxMinDiff {

	public static void main(String[] args) {
		
		int [] arr = {2, 1, 8};
		
		int n = arr.length;
		int [] larr = new int[n];
		int [] rarr = new int[n];
		
		Stack<Integer> ss = new Stack<>();
		
		larr[0]=0;
		
		ss.push(arr[0]);
		for(int a=1;a<n;a++)
		{
			if(arr[a]<=ss.peek())
			{
				while(!ss.isEmpty() && arr[a]<=ss.peek())
				{ss.pop();}
			}
			
			if(ss.isEmpty())
			{
				larr[a]=0;
			}
			else
			{
				larr[a]= ss.peek();
			}
			ss.push(arr[a]);
		}
		for(int i : larr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		ss.clear();
		
		rarr[n-1]=0;
		ss.push(arr[n-1]);
		for(int a=n-2;a>=0;a--)
		{
			
			if(arr[a]<=ss.peek())
			{
				while(!ss.isEmpty() && arr[a]<=ss.peek())
				{ss.pop();}
			}
			
			if(ss.isEmpty())
			{
				rarr[a]=0;
			}
			else
			{
				rarr[a]= ss.peek();
			}
			ss.push(arr[a]);
			
			
		}
		for(int i : rarr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int ans=Math.abs(larr[0]-rarr[0]);
		
		for(int a=1;a<n;a++)
		{
			if(Math.abs(larr[a]-rarr[a])>ans)
			{
				ans= Math.abs(larr[a]-rarr[a]);
			}
		}
		
		System.out.println(ans);
	}

}
