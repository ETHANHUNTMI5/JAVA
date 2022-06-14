package dp;

import java.util.Arrays;

public class BinomialCoeff {
	
	public static int [][] dp = null;
	public static void main(String[] args) {
		
		int n = 15;
		int k = 3;
		dp = new int[n+1][k+1];
		
		for(int [] a : dp)
		{Arrays.fill(a, -1);}
		System.out.println(BC(n,k));
		System.out.println(BCtable(n,k));
	}
	
	public static int BC(int n , int k)
	{
		if(dp[n][k]!=-1)return dp[n][k];
		if(k==0 || k==n)
		{return 1;}
		
		if(k>n)return 0;
		
		int ans = BC(n-1,k)+BC(n-1,k-1);
		return dp[n][k]=ans;
	}
	
	public static int BCtable(int n ,int k)
	{
		if(k==0)return 1;
			
		int [][] arr = new int[n+1][k+1];
		
		for(int a=0;a<=n;a++)
		{arr[a][0]=1;}
		
		for(int a=1;a<=n;a++)
		{
			for(int b =1;b<=k;b++)
			{
				arr[a][b] = arr[a-1][b]+arr[a-1][b-1];
			}
		}
	
	return arr[n][k];}

}
