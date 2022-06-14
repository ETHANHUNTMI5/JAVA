package sheet;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int n = 5;
		int [] arr = {10,9,8,7,0};
		Stack<Integer> ss = new Stack<>();

		ss.push(arr[0]);
		int [] ans = new int[n];
		
		int a=1;
		int b=0;
		Arrays.fill(ans,-1);
		
		while(a<=n-1)
		{
			if(arr[a]>ss.peek())
			{
				while(!ss.isEmpty() && arr[a]>ss.peek())
				{
					ss.pop();
					ans[b]=arr[a];
					b++;
					
				}
				ss.push(arr[a]);
				
			}
			
			else
			{ss.push(arr[a]);}
			
			
			a++;
		}
		
		
		for(int i : ans)
		{System.out.print(i+" ");}
		int c = n-1;
		
		
		
		
		
	}
}