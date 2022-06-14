package sheet;

import java.util.ArrayList;
import java.util.Scanner;

public class Wine {
	static class Pair
	{
		long val;
		long idx;
		Pair(long val,long idx)
		{
			this.val=val;
			this.idx=idx;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true)
		{
		
		int n = scn.nextInt();
		if(n==0)break;
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		ArrayList<Pair> buy = new ArrayList<>();
		ArrayList<Pair> sell = new ArrayList<>();
		
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]>0)
			{buy.add(new Pair(arr[a],a));}
			
			else if(arr[a]<0)
			{sell.add(new Pair(Math.abs(arr[a]),a));}
		}
		long ans =0;
		
		int i = 0;
		int j=0;
		while(i<buy.size() && j<sell.size())
		{
			Pair p1 = buy.get(i);
			Pair p2 = sell.get(j);
			
			if(p1.val<p2.val)
			{
				p2.val = p2.val-p1.val;
				i++;
				ans+=Math.abs(p1.idx-p2.idx)*p1.val;
			
			}
			else if(p1.val>p2.val)
			{
				p1.val = p1.val-p2.val;
				j++;
				ans+=Math.abs(p1.idx-p2.idx)*p2.val;
			}
			else
			{
				ans+=Math.abs(p1.idx-p2.idx)*p1.val;
				i++;
				j++;
			}
					
		}
		System.out.println(ans);
		}

	}

}
