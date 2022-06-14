package pepcoding;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		
		int [] arr = {2 ,5 ,9 ,3 ,1, 12 ,6 ,8 ,7};
		
		int [] ans = solve(arr);
		for(int i : ans)
		{
			System.out.print(i+" ");
		}
		
	}
	 public static int[] solve(int[] arr){
		   
		 int n = arr.length;
		 int [] ans = new int[n];
		 
		 ans[0]=1;
		 Stack<Integer> stack = new Stack<Integer>();
		 stack.push(0);
		 
		 for(int a=1;a<n;a++)
		 {
			 if(arr[stack.peek()]>arr[a])
			 {
				 ans[a]=1;
				 
			 }
			 
			 else
			 {
				 
				 while(!stack.isEmpty() && arr[stack.peek()]<=arr[a])
				 {
					 
					 stack.pop();
				 
				 }
				 
				 if(stack.isEmpty())
				 {
					 ans[a]=a+1;
				 }
				 else {
				 ans[a]=a-stack.peek();
				 }
			 }
			 
			 
		 
		 
		 stack.push(a);
		 
		 }
		 
		 
		 
	
		 return ans;
	 }


}
