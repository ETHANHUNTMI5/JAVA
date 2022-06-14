package pepcoding;

import java.util.Scanner;

public class GoldMine {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		   
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int [][] arr = new int[n][m];
				
		for(int a=0;a<n;a++)
		{
			for(int b=0;b<m;b++)
			{
				arr[a][b]= scn.nextInt();
			}
		}
		
		int [][] dp = new int[n][m];
		
		for(int row=n-1;row>=0;row--)
		{
			dp[row][m-1]=arr[row][m-1];
		}
	
		
		for(int col = m-2;col>=0;col--)
		{
			for(int row=n-1;row>=0;row--)
			{
				int x=0;
				int y=0;
				int z=0;
			
				if(row+1<=n-1 && col+1<=m-1)
				{
					x= dp[row+1][col+1];
				}
				
				if(row-1>=0 && col+1<=m-1)
				{
					y = dp[row-1][col+1];
				}
				
				z= dp[row][col+1];
				
				dp[row][col] = Math.max(x, Math.max(y, z))+arr[row][col];
				
			}
			
		}
		
		int max=-1;
		for(int i=0;i<n;i++)
		{
			if(dp[i][0]>max)
			{max=dp[i][0];}
			
		}
		
		System.out.println(max);
		
		
	}

}
