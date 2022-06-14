package dynamicProgramming;

public class RodCutting {

	public static void main(String[] args) {
		
		int [] arr = {0,1,5,8,9,10,17,17,20};
		int n = arr.length;
		int l=8;
		System.out.println(RCR(arr, l));
		System.out.println(RCTD(arr, l, new int[l+1]));
		System.out.println(RCBU(arr, l));
		
	}
	public static int RCR(int [] arr,int l)
	{
		int max=arr[l];
		for(int a=1;a<=l/2;a++)
		{
			int lp = RCR(arr, a);
			int rp = RCR(arr, l-a);
			max = Math.max(max, lp+rp);
		}	
		
	return max;}

	public static int RCTD(int [] arr,int l,int [] dp)
	{
		int max=arr[l];
	
		if(dp[l]!=0)return dp[l];
		for(int a=1;a<=l/2;a++)
		{
			int lp = RCTD(arr, a,dp);
			int rp = RCTD(arr, l-a,dp);
			max = Math.max(max, lp+rp);
		}	
		
	return dp[l]=max;}
	
	public static int RCBU(int [] arr , int l)
	{
		int [] dp = new int[l+1];
		dp[1]=arr[1];
		
		for(int len=2;len<=l;len++)
		{
			int max = arr[len];
		for(int a=1;a<=len/2;a++)
		{
			int s1 = dp[a];
			int s2 = dp[len-a];
			max = Math.max(max, s1+s2);
		}
		dp[len]=max;}
		
		
	
	return dp[l];}
}
