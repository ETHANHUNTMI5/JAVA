package pepcoding;

import java.util.Arrays;
import java.util.Stack;

public class MergeOverLapping {

	public static class Pair implements Comparable<Pair>
	{
		int st;
		int et;
		
		public Pair(int st , int et) {
		this.st=st;
		this.et=et;
		}

		
		public int compareTo(Pair o) {
		if(this.st!=o.st)
		{
			return this.st-o.st;
		}
		
		else
			return this.et-o.et;
		}
		
	}
	
	public static void main(String[] args) {
		
		int [][] arr = {{1,4},
						{1,8},
						{8,10},
						{11,22},
						{15,23},
						{21,30}};
				
		int n = arr.length; 
		Pair [] pairs = new Pair[n];
		
		for(int a=0;a<n;a++)
		{
			pairs[a] = new Pair(arr[a][0], arr[a][1]);
		
		}
		
		Arrays.sort(pairs);
		
		
		Stack<Pair> stack = new Stack<Pair>();
		stack.push(pairs[0]);
		Pair gp = stack.peek();
		for(int a =1;a<n;a++)
		{
			if(!stack.isEmpty() && stack.peek().et>=pairs[a].st)
			{
				gp =stack.pop();
			
			
			int st = gp.st;
			int et = Math.max(gp.et, pairs[a].et);
			
			Pair pp = new Pair(st, et);
			stack.push(pp);	}
			else
			{
				stack.push(pairs[a]);
			}
		
		}
		Stack<Pair> ans = new Stack<Pair>();

	while(!stack.isEmpty())
	{
		Pair p = stack.pop();
		ans.push(p);
		
		
	}
	
	while(!ans.isEmpty())
	{
		Pair p = ans.pop();
		System.out.println(p.st+" "+p.et+"  ");
		
	}
		
	}
	
	 

}
