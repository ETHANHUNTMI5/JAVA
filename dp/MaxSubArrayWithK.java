package dp;

public class MaxSubArrayWithK {

	public static void main(String[] args) {
		int k = 2;
		int [] arr = {1,1,1,1,1,1};
		
		int n = arr.length;
		
		int [] dp = new int[n];
		dp[0] = arr[0];
		int max = dp[0];
		
		for(int a=1;a<n;a++)
		{
			max = Math.max(max+arr[a], arr[a]);
			dp[a] = max;
		}
		
		for(int i :dp)
		{System.out.print(i+" ");}
		
		int sum=0;

		for(int i=0;i<k;i++)
		{sum+=arr[i];}
		int result=sum;
		
		for(int i=k;i<n;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			
			result = Math.max(sum, result);
			
			result = Math.max(result, sum+dp[i-k]);
		}
		System.out.println();
		System.out.println(result);
	}
}