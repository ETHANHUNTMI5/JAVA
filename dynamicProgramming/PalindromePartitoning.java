package dynamicProgramming;

import java.util.Arrays;

public class PalindromePartitoning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the min cuts so that all parts are palindrome
		String s = "cabad";
		int n = s.length();
		System.out.println(PPR(s, 0, n-1));
		int [][] dp = new int[n][n];
		for(int [] a: dp)
		{Arrays.fill(a, -1);}
		System.out.println(PTD(s, 0, n-1, dp));
		System.out.println(PBU(s));

	}
	public static int PPR(String s,int si,int ei)
	{
		if(si==ei)return 0;
		
		if(isPalin(s, si, ei))return 0;
		int min = Integer.MAX_VALUE;
		for(int k=si;k<=ei-1;k++)
		{
			int v1 = PPR(s,0,k);
			int v2 = PPR(s,k+1,ei);
			int val = v1+v2+1;
			min = Math.min(min, val);
		}
	return min;}
	
	
	public static int PTD(String s,int si,int ei,int [][] dp)
	{
		if(si==ei)return 0;
		
		
		if(dp[si][ei]!=-1)return dp[si][ei];
		if(isPalin(s, si, ei))return 0;
		
		int min = Integer.MAX_VALUE;
		for(int k=si;k<=ei-1;k++)
		{
			int v1 = PTD(s,0,k,dp);
			int v2 = PTD(s,k+1,ei,dp);
			int val = v1+v2+1;
			min = Math.min(min, val);
		}
	return dp[si][ei]=min;}
	
	
	
	
	
	public static boolean isPalin(String s , int si, int ei)
	{
		while(si<=ei)
		{
			if(s.charAt(si)!=s.charAt(ei))
			{return false;}
			si++;
			ei--;
		}
	return true;}
	
	
	public static int PBU(String s)
	{
		int n = s.length();
		boolean [][] tell = new boolean[n][n];
		
		for(int gap=0;gap<n;gap++)
		{
			for(int row=0,col=gap;col<n;col++,row++)
			{
				if(gap==0)
				{tell[row][col]=true;}
				
				else if(gap==1)
				{tell[row][col]=s.charAt(row)==s.charAt(col);}
				
				else
				{
					if(s.charAt(row)!=s.charAt(col))tell[row][col]=false;
					else
					{
						tell[row][col]=tell[row+1][col-1];
					}
				}
			}
		}
		
		int [][] dp = new int[n][n];
		for(int gap=1;gap<n;gap++)
		{
			for(int row=0,col=gap;col<n;col++,row++)
			{
				
				
				if(gap==1)
				{if(s.charAt(row)==s.charAt(col))
				{dp[row][col]=0;}
				else
				{dp[row][col]=1;}
				}
				
				else
				{
					if(s.charAt(row)==s.charAt(col))dp[row][col]=dp[row+1][col-1];
					else
					{
						int min = Integer.MAX_VALUE;
						for(int k=row;k<col;k++)
						{int val = dp[row][k]+dp[k+1][col]+1;
						min = Math.min(min, val);}
						dp[row][col]=min;
					}
				}
			}
		}
		
		
	return dp[0][n-1];}
	
	

}
