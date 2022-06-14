package dynamicProgramming;

public class Wine {

	public static void main(String[] args) {
		
		int [] arr = {2,3,5,1,4};
		int n = arr.length;
		System.out.println(Win(0, n-1, 1, arr));
		System.out.println(WinTD(0, n-1, 1, arr, new int[n][n]));
		System.out.println(WinBU(arr));
	}
	public static int Win(int lo, int hi , int year, int []arr)
	{
		if(lo>hi)return 0;
		int left = arr[lo]*year + Win(lo+1, hi, year+1, arr);
		int right = arr[hi]*year+ Win(lo, hi-1, year+1, arr);
		
		return Math.max(left, right);
	}

	public static int WinTD(int lo, int hi , int year, int []arr , int [][]strg)
	{
		if(lo==hi)return year*arr[lo];
		
		if(strg[lo][hi]!=0)return strg[lo][hi];
				
		int left = arr[lo]*year + WinTD(lo+1, hi, year+1, arr,strg);
		int right = arr[hi]*year+ WinTD(lo, hi-1, year+1, arr,strg);
		
		return strg[lo][hi]=Math.max(left, right);
	}
	
	public static int WinBU(int [] arr)
	{
		int n = arr.length;
		int [][] dp = new int[n][n];
		
		int [] pre = new int[n];
		pre[0]=arr[0];
		for(int a=1;a<n;a++)
		{pre[a]=pre[a-1]+arr[a];}
		for(int t=n-1;t>=0;t--)
		{
			for(int row=0,col=n-1-(t);col<n;col++,row++)
			{
			if(t==n-1)
			{
				dp[row][col]=arr[row]*(t+1);
			}
			
			else
			{
				int val1 = dp[row][col-1]+arr[col]*(t+1);
				int val2 = dp[row+1][col]+arr[row]*(t+1);
				
				dp[row][col] = Math.max(val1, val2);
			}
			
			
			}
		}
		
//		for(int a=0;a<n;a++)
//		{
//			for(int b=0;b<n;b++)
//			{System.out.print(dp[a][b]+" ");}
//			System.out.println();
//		}
	return dp[0][n-1];}
}
