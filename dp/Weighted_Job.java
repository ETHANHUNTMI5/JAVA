package dp;

import java.util.ArrayList;
import java.util.Collections;

public class Weighted_Job {

	public static class Pair
	{
		int s;
		int e;
		int wt;
		
		Pair(int s,int e, int wt)
		{
			this.s=s;
			this.e=e;
			this.wt=wt;
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Pair> ll = new ArrayList<>();
		
		ll.add(new Pair(3,10,20));
		ll.add(new Pair(1,2,50));
		ll.add(new Pair(6,19,100));
		ll.add(new Pair(2,100,200));

		Collections.sort(ll,(a,b)->{if(a.s!=b.s)return a.s-b.s;
		return a.e-b.e;});
		
		int n = ll.size();
		
		int [] dp = new int[n];
		
		
		for(int a=0;a<n;a++)
		{
			int max=0;
			for(int b=a-1;b>=0;b--)
			{
				if(ll.get(b).e<=ll.get(a).s)
				{
					max = Math.max(max, ll.get(b).wt);
				}
			}
			
			dp[a]=max+ll.get(a).wt;
		}
		
		for(int i : dp)
		{System.out.print(i+" ");}
	}

}
