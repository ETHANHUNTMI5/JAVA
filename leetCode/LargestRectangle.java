package leetCode;

import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {
	
		int [] arr = {1,1};
		
		int n = arr.length;
		
		int [] left = new int[n];
		int [] right= new int[n];
		
		left[0]=-1;
		right[n-1]=n;
		
		
		Stack<Integer> rb = new Stack<Integer>();
		
		rb.push(n-1);
		
		for(int a=n-2;a>=0;a--)
		{
			while(rb.size()>0 && arr[a]<=arr[rb.peek()])
			{
				rb.pop();
				
			}
			
		if(rb.size()==0)
		{
			right[a]=n;
		}
		else
		{
			right[a]=rb.peek();
		}
			
			
		
		rb.add(a);
		}
		
		Stack<Integer> lb = new Stack<Integer>();
		
		lb.push(0);
		
		
		for(int a=1;a<n;a++)
		{
			while(lb.size()>0 && arr[a]<=arr[lb.peek()])
			{
				lb.pop();
				 
			}
			
		if(lb.size()==0)
		{
			left[a]=-1;
		}
		else
		{
			left[a]=lb.peek();
		}
			
			
		
		lb.add(a);
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i : left)
		{
			System.out.print(i+" ");
		}
		System.out.println();	
		
		for(int i : right)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		int ans =0;
		
		for(int a=0;a<n;a++)
		{
			if((right[a]-left[a]-1)*arr[a]>ans)
			{
				ans = (right[a]-left[a]-1)*arr[a];
			}
		System.out.println(ans);	
		}
		
		System.out.println(ans);
	}
}