package dp;

import java.util.Arrays;

public class OptimalGameRecursive {

	static int [][] dp = new int[1001][1001];
	public static void main(String[] args) {
		
		for(int a=0;a<=1000;a++)
		{Arrays.fill(dp[a],-1);}
		
		int [] arr = {5,3,7,10};
		
		int ans= kar(0,arr.length-1,arr);
		System.out.println(ans);

	}
	public static int kar(int i, int j, int[]arr)
	{
		if(i>j)return 0;
		
		if(dp[i][j]!=-1)return dp[i][j];
		
		int val1 = arr[i]+Math.min(kar(i+2,j,arr), kar(i+1,j-1,arr));
		int val2 = arr[j]+Math.min(kar(i+1,j-1,arr), kar(i,j-2,arr));
		
		return dp[i][j] = Math.max(val1, val2);
	}

}
