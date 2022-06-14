package pepcoding;

import java.util.Stack;

public class MaxInK {

	public static void main(String[] args) {
		int [] arr = {2 ,9, 3, 8, 1 ,7 ,12 ,6 ,14 ,4 ,32, 0, 7 ,19 ,8, 12 ,6};
		int k =4;
		
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		int [] r = new int[n];
		
		stack.push(n-1);
		r[n-1]=n;
		for(int a=n-2;a>=0;a--)
		{
			while(!stack.isEmpty() && arr[stack.peek()]<=arr[a])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				r[a]= n;
			}
			else
			{
				r[a]= stack.peek();
			}
			stack.push(a);
		}
		
//		for(int i : r)
//		{
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
		for(int i=0;i<=n-k;i++)
		{
	     int j = i;
			
	     while(r[j]<i+k)
	     {
	    	 j=r[j];
	     }
	   System.out.print(arr[j]+" ");
			
			
		}
		
	}

}
