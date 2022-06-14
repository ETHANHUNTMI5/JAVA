package dynamicProgramming;

public class MatrixCM {

	public static void main(String[] args) {
		
		int [] arr = {4,2,3,5,1};
		int n = arr.length;
		System.out.println(MCMR(arr, 0,n-1));
		System.out.println(MCMTD(arr, 0, n-1, new int[n][n]));
		System.out.println(MCMBU(arr));
		

	}
	public static int MCMR(int [] arr , int si, int ei)
	{
		
		if(ei==si+1)return 0;
		int val=Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++)
		{
			val = Math.min(val,MCMR(arr,si,k)+MCMR(arr,k,ei)+arr[si]*arr[ei]*arr[k]);
		}
		
	return val;}

	public static int MCMTD(int [] arr , int si, int ei,int [][]dp)
	{
		
		if(ei==si+1)return 0;
		if(dp[si][ei]!=0)return dp[si][ei];
		int val=Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++)
		{
			val = Math.min(val,MCMTD(arr,si,k,dp)+MCMTD(arr,k,ei,dp)+arr[si]*arr[ei]*arr[k]);
		}
		
	return dp[si][ei]=val;}
	
	public static int MCMBU(int [] arr)
	{
		int n = arr.length;
		int [][] dp = new int[n-1][n-1];
		for(int gap =0;gap<dp.length;gap++)
		{
			for(int i=0,j=gap;j<dp.length;i++,j++)
				{
					if(gap==0)
					{dp[i][j]=0;}
					else if(gap==1)
					{dp[i][j]= arr[i]*arr[j]*arr[j+1];}
					
					else
					{
						int min = Integer.MAX_VALUE;
						for(int k=i;k<j;k++)
						{
							int lc = dp[i][k];
							int rc = dp[k+1][j];
							int ac = arr[i]*arr[k+1]*arr[j+1];
							int tc = lc+rc+ac;
							min = Math.min(min,tc);
						}
					dp[i][j] = min;}
					
				}
			}
		return dp[0][dp.length-1];
		
	}

	

}
