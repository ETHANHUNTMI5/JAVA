package pepcoding;

import java.util.Scanner;

public class Stock6 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}

		int k = scn.nextInt();
		
		int [][] dp = new int[k+1][n];
		
		
		for(int row=1;row<=k;row++)
		{
			for(int col=1;col<n;col++)
			{
				dp[row][col] = max(arr, dp, row, col);
				
				
			}
			
		}
		
	System.out.println(dp[k][n-1]);	
	}	

public static int max(int [] arr,int [][] dp,int row, int ei )
{
    int ans = dp[row][ei-1];
    
    for(int i =ei-1;i>=0;i--)
    {
    	if(dp[row-1][i]+arr[ei]-arr[i]>ans)
    	{
    		ans = dp[row-1][i]+arr[ei]-arr[i];
    	}
    	
    }
	
	
    return ans;
			
}
	
}
