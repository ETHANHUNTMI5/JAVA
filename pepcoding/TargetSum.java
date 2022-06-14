package pepcoding;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		int [][] dp= new int[n+1][tar+1];
		
		
		for(int row=n-1;row>=0;row--)
		{
			for(int col=1;col<=tar;col++)
			{
			
				if(arr[row]<=tar)
				dp[row][arr[row]]=1;
				
				if(dp[row+1][col]==1)
				{
					dp[row][col]=1;
				}
				
				if(col-arr[row]>=0)
				{
					if(dp[row+1][col-arr[row]]==1)
				{
					dp[row][col]=1;
				}
				}
				}
			
		}
		
		
		
		for(int i =0;i<=n;i++)
		{
			for(int j=0;j<=tar;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
		
		System.out.println();}
		
		
		if(dp[0][tar]==1)
		{System.out.println("true");}
		else
		{System.out.println("false");}
		
		
	}

}
