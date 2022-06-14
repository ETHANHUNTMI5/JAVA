package leetCode;

import java.util.Arrays;

public class UniquePath2 {

	public static void main(String[] args) {
		
		int [][] arr = {{0,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
		
		int [][] dp = new int[arr.length][arr[0].length];
		
		for(int a=0;a<arr.length;a++)
		{	Arrays.fill(dp[a],-1);
	}
		System.out.println(kar(arr, 0, 0,dp));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
		System.out.println();}
		
	}
	public static int kar(int [][] arr,int cr,int cc,int[][]dp)
	{
	  if(cr>=arr.length || cc>=arr[0].length || arr[cr][cc]==1)
	  {
		  return 0;
	  }
		
	  if(cr==arr.length-1 && cc==arr[0].length-1)
	  {
       return 1;
	  }
	  
	  if(dp[cr][cc]!=-1)
	  {
		  return dp[cr][cc];
	  }
	  int ans=0;
	  
	  int r=kar(arr, cr, cc+1,dp);
	  int d = kar(arr, cr+1,cc,dp);
	  
	 
	  ans = r+d;
	  dp[cr][cc]=ans;
	  return ans;
			  
	}

}
