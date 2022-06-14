package pepcoding;

import java.util.Scanner;

public class Maze {

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
		
		dp[n-1][m-1]=arr[n-1][m-1];
		
		for(int col=m-2;col>=0;col--)
		{
			dp[n-1][col]=arr[n-1][col]+dp[n-1][col+1];
			
		}
		
		for(int row=n-2;row>=0;row--)
		{
			
			dp[row][m-1]=arr[row][m-1]+dp[row+1][m-1];
		}
		
		
		for(int i =n-2;i>=0;i--)
		{
			for(int j=m-2;j>=0;j--)
			{
				
				dp[i][j]= Math.min(dp[i+1][j], dp[i][j+1])+arr[i][j];
			}
			
			
		}
		
		
		System.out.println(dp[0][0]);
		
	}

}
