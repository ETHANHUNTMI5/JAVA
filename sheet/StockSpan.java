package sheet;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int [] arr = {100, 80, 60, 70, 60, 75, 85};
		
		Stack<Integer> ss = new Stack<>();
		
		int n = arr.length;
		int [] ans = new int[n];
		ans[0]=1;
		
		ss.push(0);
		
		for(int a=1;a<n;a++)
		{
			while(!ss.isEmpty() && arr[ss.peek()]<arr[a])
			{
				ss.pop();
			}
			
			if(ss.isEmpty())
			{
				ans[a]= a+1;
			}
			else
			{
				ans[a]=a-ss.peek();
			}
			ss.push(a);
		}
		
				
		for(int i: ans)
		{System.out.print(i+" ");}
		
		
	}

}
