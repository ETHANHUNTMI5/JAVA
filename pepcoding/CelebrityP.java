package pepcoding;

import java.util.Stack;

public class CelebrityP {

	public static void main(String[] args) {
		
		int [][] arr = {{0,0,0,0},
				        {1,0,1,1},
				        {1,1,0,1},
				        {1,1,1,0}};
		
		
		Stack<Integer> stack = new Stack<Integer>();
		int n = arr.length;
		
		for(int a=n-1;a>=0;a--)
		{
			stack.push(a);
		}
	
		for(int a=1;a<=n-1;a++)
		{
			
			int v1 = stack.pop();
			int v2 = stack.pop();
			
			if(arr[v2][v1]==1)
			{
				stack.push(v1);
			}
			else
			{
				stack.push(v2);
			}
			
		}
		
		int pc = stack.peek();
		boolean b= true;
		
		
		for(int a=0;a<n;a++)
		{
			if(arr[pc][a]==1)
			{
				System.out.println("none");
				b=false;
				break;
			}
		}
		
		if(b)
		{
			for(int a=0;a<n;a++)
		{
				
			if(arr[a][pc]==0 && pc!=a)
			{
				System.out.println("none");
				b=false;
				break;
			}
			
		}
		}
		if(b)
		{
			System.out.println(pc);
		}
		
	}

}
