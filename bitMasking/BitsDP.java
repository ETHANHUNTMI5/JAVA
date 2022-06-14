package bitMasking;

public class BitsDP {

	public static void main(String[] args) {
		
	int [][] arr = {{9,2,7,8},{6,4,3,7},{5,8,1,8},{7,6,9,4}};
	
	
	int mask=(1<<4)-1;
	int [][] dp = new int[4][1<<4];
	
	
	for(int i=0;i<dp.length;i++)
	{
		for(int j=0;j<dp[0].length;j++)
		{
			dp[i][j]=-1;
		}
	}
	
	System.out.println(mask2(arr, 0, mask, dp));
	
	
	}
	public static int mask2(int [][] arr,int i, int mask,int[][]dp)
	{
		if(i==dp.length)
		{return 0;}
		
		if(dp[i][mask]!=-1)
		{
		return dp[i][mask];	
		}
		int max = Integer.MAX_VALUE;
		
		for(int j=0;j<=dp.length-1;j++)
		{
			
			
			if((mask&(1<<j))!=0)
			{
				max =Math.min(max, arr[i][j]+mask2(arr, i+1, (mask^(1<<j)), dp));
			}
			
		}

		
	dp[i][mask]=max;
	return max;	
	}
	
}
