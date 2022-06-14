package challenges_DP;

import java.util.Scanner;

public class Mixtures {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =  new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		System.out.println(MixRec(arr, 0, 3));
		
		System.out.println(MixTD(arr, 0, 3, new int [4][4]));
		
		System.out.println(MixBU(arr));
	}

	public static int MixRec(int [] arr,int si,int ei)
	{
		
		if(si==ei)
		{return 0;}
		
		int min = Integer.MAX_VALUE;
		for(int k=si;k<=ei-1;k++)
		{
			int fp = MixRec(arr, si, k);
			int sp = MixRec(arr, k+1, ei);
			int sw = Sum(arr, si, k)*Sum(arr, k+1, ei);
			
			int ans = fp+sp+sw;
			if(ans<min)
			{min= ans;}
		}
		
	return min;	
	}
	public static int Sum(int [] arr,int i,int j)
	{
		int sum=0;
		for(int k=i;k<=j;k++)
		{sum+=arr[k];}
		
		
		return sum%100;
	}
	public static int MixTD(int [] arr,int si,int ei,int[][] strg)
	{
		
		if(si==ei)
		{return 0;}
		
		if(strg[si][ei]!=0)
		{return strg[si][ei];}
		
		int min = Integer.MAX_VALUE;
		for(int k=si;k<=ei-1;k++)
		{
			int fp = MixTD(arr, si, k,strg);
			int sp = MixTD(arr, k+1, ei,strg);
			int sw = Sum(arr, si, k)*Sum(arr, k+1, ei);
			
			int ans = fp+sp+sw;
			if(ans<min)
			{min= ans;}
		}
		
		strg[si][ei]=min;
	return min;	
	}
	public static int MixBU(int [] arr)
	{
		int n = arr.length;
		int [][] strg = new int[n][n];
		
		for(int slide=1;slide<=n-1;slide++)
		{
			for(int si = 0;si<=n-1-slide;si++)
			{
				int ei=si+slide;
				
				if(si==ei)
				{strg[si][ei]=0;}
				
				else
				{
					int min = Integer.MAX_VALUE;
					for(int k=si;k<=ei-1;k++)
					{
						int fp = strg[si][k];
						int sp = strg[k+1][ei];
						int sw = Sum(arr, si, k)*Sum(arr, k+1, ei);
						
						int ans = fp+sp+sw;
						if(ans<min)
						{min= ans;}
					}
					
					strg[si][ei]=min;
					
					
				}
				
			}
			
		}
		
		return strg[0][n-1];
	}
	
}
