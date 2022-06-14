package dynamicProgramming;

public class BoardPath {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(Board(0, n));
		System.out.println(BoardTop(0, n, new int[n+1]));
		System.out.println(BoardBU(n));
		System.out.println(BoardBUSE(n));
	}
	
	public static int Board(int s, int n)
	{
		if(s==n)return 1;
		
		if(s>n)return 0;
		
		int val=0;
		for(int a=1;a<=6;a++)
		{
			val+=Board(s+a,n);
		}
	return val;}
	
	public static int BoardTop(int s, int n, int [] dp)
	{
		if(s==n)return 1;
		
		if(s>n)return 0;
		
		if(dp[s]!=0)return dp[s];
		
		int val=0;
		for(int a=1;a<=6;a++)
		{
			val+=BoardTop(s+a,n,dp);
		}
	return dp[s]=val;}
	
	public static int BoardBU(int n)
	{
		int [] dp = new int[n+1];
		dp[n]=1;
		
		for(int a=n-1;a>=0;a--)
		{
			int sum=0;
			for(int i=1;i<=6;i++)
			{
				if(a+i>n)break;
				
				sum+=dp[a+i];
			}
			dp[a] = sum;
		}
	return dp[0];}
	
	public static int BoardBUSE(int n)
	{
		int [] dp = new int[6];
		dp[0]=1;
		
		for(int a=1;a<=n;a++)
		{
			int sum=dp[0]+dp[1]+dp[2]+dp[3]+dp[4]+dp[5];
			dp[5] = dp[4];
			dp[4] = dp[3];
			dp[3] = dp[2];
			dp[2] = dp[1];
			dp[1] = dp[0];
			dp[0]=sum;
			
		}
	return dp[0];}

}
