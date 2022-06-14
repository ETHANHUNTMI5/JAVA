package pepcoding;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {

		int [] arr = {2 ,5, 8, 5, 2, 8, 2, 8 ,5 ,4,6};
	
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		int [] l = new int[n];
		int [] r = new int[n];
		
		
		l[0]=-1;
		stack.push(0);
		
		for(int a=1;a<n;a++)
		{
			
			
			while(!stack.isEmpty() && arr[stack.peek()]>=arr[a])
			{
				
			
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				l[a]=-1;
			}
			
			else
			{
				l[a] =stack.peek();
			}
		
			stack.push(a);
			
		}
		
		stack.clear();
		
		
		stack.push(n-1);
		r[n-1]=n;
		
		for(int a=n-2;a>=0;a--)
		{
			while(!stack.isEmpty() && arr[stack.peek()]>=arr[a])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				r[a]=n;
			}
			else
			{
				r[a]= stack.peek();
			}
			
		stack.push(a);}
		
		
		int ans=0;
		
		for(int a=0;a<n;a++)
		{
			int area = (r[a]-l[a]-1)*arr[a];
			
			if(area>ans)
			{
				ans=area;
			}
			
		}
		for(int i : l)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : r)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(ans);
	}
	

}
