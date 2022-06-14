package pepcoding;

import java.util.Scanner;

public class ZeroOneKnap {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] pri = new int[n];
		int [] wt = new int[n];
		for(int a=0;a<n;a++)
		{
			pri[a]= scn.nextInt();
		}
		for(int a=0;a<n;a++)
		{
			wt[a]= scn.nextInt();
		}
		
		int cap=scn.nextInt();
		
		
		int [][] dp = new int[n+1][cap+1];
		
		for(int row=n-1;row>=0;row--)
		{
			for(int col=1;col<=cap;col++)
			{
				int e = dp[row+1][col];
				int i=0;
				
				if(col-wt[row]>=0)
				{
					i= dp[row+1][col-wt[row]]+pri[row];
				}
				
				dp[row][col] = Math.max(i, e);
				
				
			}
		}
		
		
		System.out.println(dp[0][cap]);
		
	}
	}
