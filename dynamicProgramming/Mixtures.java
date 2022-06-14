package dynamicProgramming;

import java.util.Arrays;

public class Mixtures {
public static int [] sum = null;
	public static void main(String[] args) {
		
		int [] arr = {40,60,50,20};
		int n = arr.length;
		sum=new int[n];
		sum[0]=arr[0];
		for(int a=1;a<n;a++)
		{sum[a]=(sum[a-1]+arr[a]);
		sum[a]=sum[a];}
		
		for(int a=0;a<n;a++)
		{sum[a]=sum[a]%100;}

		
		System.out.println(MR(0, n-1, arr));
		int [][] strg = new int[n][n];
		for(int [] a:strg)
		{Arrays.fill(a, -1);}
		System.out.println(MTD(0, n-1, arr, strg));
		System.out.println(MBU(arr));
	}

	public static int MR(int si, int ei , int[] arr)
	{
		
		if(si==ei)return 0;
		
		int min = Integer.MAX_VALUE;
		for(int k= si;k<=ei-1;k++)
		{
			int fp = MR(si, k, arr);
			int sp = MR(k+1, ei, arr);
			int s1=0;
			
			if(si!=0)
			{   
				s1 = (sum[k]%100+(100-sum[si-1])%100)%100;
				
			}
			else
			{s1=sum[k];}
			
			int s2=0;
			s2 = (sum[ei]%100+(100-sum[k])%100)%100;
			
			
			int val = s1*s2;
			int total = val+fp+sp;
			
			min = Math.min(min, total);
		}
	return min;}
	public static int MTD(int si, int ei , int[] arr,int [][] strg)
	{
		
		if(si==ei)return 0;
		
		if(strg[si][ei]!=-1)return strg[si][ei];
		int min = Integer.MAX_VALUE;
		for(int k= si;k<=ei-1;k++)
		{
			int fp = MTD(si, k, arr,strg);
			int sp = MTD(k+1, ei, arr,strg);
			int s1=0;
			
			if(si!=0)
			{   
				s1 = (sum[k]%100+(100-sum[si-1])%100)%100;
				
			}
			else
			{s1=sum[k];}
			
			int s2=0;
			s2 = (sum[ei]%100+(100-sum[k])%100)%100;
			
			
			int val = s1*s2;
			int total = val+fp+sp;
			
			min = Math.min(min, total);
		}
	return strg[si][ei]=min;}
	
	public static int MBU(int [] arr)
	{
		int n = arr.length;
		
		int [][] dp = new int[n][n];
		
		for(int gap=1;gap<n;gap++)
		{
			for(int si=0,ei=gap;ei<n;ei++,si++)
			{
				
				int min = Integer.MAX_VALUE;
				for(int k= si;k<=ei-1;k++)
				{
					int fp = dp[si][k];
					int sp = dp[k+1][ei];
					int s1=0;
					
					if(si!=0)
					{   
						s1 = (sum[k]%100+(100-sum[si-1])%100)%100;
						
					}
					else
					{s1=sum[k];}
					
					int s2=0;
					s2 = (sum[ei]%100+(100-sum[k])%100)%100;
					
					
					int val = s1*s2;
					int total = val+fp+sp;
					
					min = Math.min(min, total);
				}
				dp[si][ei]=min;
				
				
			}
		}
	return dp[0][n-1];}
}
