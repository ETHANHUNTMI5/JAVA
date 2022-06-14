package code;

import java.util.Scanner;

public class LastProblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		int[][] dp = new int[1001][1001];
		
		for(int a=1;a<=1000;a++)
		{
			dp[a][1]=a*(a+1)/2;
			
			for(int b=2;b<=1000;b++)
		{
			dp[a][b]=dp[a][b-1]+b-1+a-1;
			
		}
		
		}
		for(int w=1;w<=t;w++)
		{
			int x1=scn.nextInt();
			int y1=scn.nextInt();
			int x2=scn.nextInt();
			int y2=scn.nextInt();
			
		
			
			int ans=0;
			for(int x=x1;x<=x2;x++)
			{
				ans= ans+dp[x][y1];
			}
			for(int y=y1+1;y<=y2;y++)
			{
				ans= ans + dp[x2][y];
			}
			System.out.println(ans);
		}
		
	}

}
