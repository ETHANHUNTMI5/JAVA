package a111;

import java.util.Collections;
import java.util.PriorityQueue;

public class E2 {

	public static void main(String[] args) {
		PriorityQueue<Long> left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Long> right = new PriorityQueue<Long>();
		long[] arr = {3,1,2};
		
		int l = arr.length;
		int n = l/3;
		
		long[] lh = new long[l];
		long[] rh = new long[l];
		
		long lsum=arr[0];
		left.add(arr[0]);
		if(left.size()==n)
		{lh[0]=lsum;}
		for(int a=1;a<2*n;a++)
		{
			
			if(left.size()<n)
			{left.add(arr[a]);
			lsum+=arr[a];}
			
			else {
			
			long g = left.peek();
			if(arr[a]<g)
			{
				lsum=lsum-g;
				left.remove();
				lsum+=arr[a];
				left.add(arr[a]);
			}
			}
			if(left.size()==n)
			{lh[a]=lsum;}
		}
		
		long rsum =arr[3*n-1];
		right.add(arr[3*n-1]);
		
		if(right.size()==n)
		{rh[3*n-1]=rsum;}
		
		
		for(int a=3*n-2;a>=n;a--)
		{
			if(right.size()<n)
			{right.add(arr[a]);
			rsum+=arr[a];
			}
			else {
			long g = right.peek();
			
			if(arr[a]>g)
			{
				rsum=rsum-g;
				right.remove();
				right.add(arr[a]);
				rsum+=arr[a];
			}
			}
			
			if(right.size()==n)
			{rh[a]=rsum;}
		}
		
		
	long ans=Integer.MAX_VALUE;
	
	for(long i : lh)
	{System.out.print(i+" ");}
	System.out.println();

	for(long i : rh)
	{System.out.print(i+" ");}
	System.out.println();
	for(long a=n-1;a<2*n;a++)
	{ans = Math.min(lh[(int) a]-rh[(int) (a+1)], ans);}
		
	System.out.println(ans);

	}

}
