package dynamicProgramming;

public class CatalanNum {

	public static void main(String[] args) {
		// formula 2nCn/(n+1);
		
		int n =5;
		System.out.println(CR(n));
		System.out.println(CTD(n, new int[n+1]));
		System.out.println(CBU(n));

	}
	public static int CR(int n)
	{
		if(n==0)return 1;
		
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			int f1 = CR(i-1);
			int f2 = CR(n-i);
			ans+=f1*f2;
		}
	return ans;}
	
	public static int CTD(int n,int [] dp)
	{
		if(n==0)return 1;
		
		if(dp[n]!=0)return dp[n];
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			int f1 = CTD(i-1,dp);
			int f2 = CTD(n-i,dp);
			ans+=f1*f2;
		}
	return dp[n]=ans;}
	
	public static int CBU(int n)
	{
		int [] dp = new int[n+1];
		dp[0]=dp[1]=1;
		
		
		for(int a=2;a<=n;a++)
		{
		int ans=0;
		for(int i=1;i<=a;i++)
		{
			int f1 = dp[i-1];
			int f2 = dp[a-i];
			ans+=f1*f2;
		}
		dp[a]=ans;}
		
		
	return dp[n];}
}
