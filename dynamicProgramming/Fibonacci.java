package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		int n =20;
		System.out.println(fib(n));
		System.out.println(fibTop(n, new int[n+1]));
		System.out.println(fibBU(n));
		System.out.println(fibBUSspace(n));

	}
	
	public static int fib(int n)
	{
		if(n==0 || n==1)return n;
			
		int fnm1 = fib(n-1);
		int fnm2 = fib(n-2);
		
		return fnm1+fnm2;
	}
	
	public static int fibTop(int n,int [] dp)
	{
		if(n==0 || n==1)return n;
			
		if(dp[n]!=0)return dp[n];
		int fnm1 = fibTop(n-1,dp);
		int fnm2 = fibTop(n-2,dp);
		
		return dp[n]=fnm1+fnm2;
	}
	
	public static int fibBU(int n)
	{
		int [] dp = new int[n+1];
		dp[0]=0;
		dp[1] = 1;
		
		for(int a=2;a<=n;a++)
		{
			dp[a]=dp[a-1]+dp[a-2];
		}
	return dp[n];}
	
	public static int fibBUSspace(int n)
	{
		if(n==0 || n==1)return n;
		int x = 0;
		int y = 1;
		int sum = x+y;
		for(int a=2;a<=n;a++)
		{
			sum = x+y;
			x=y;
			y=sum;
		}
	return sum;}

}
