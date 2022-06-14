package dp;

public class Min_num_ofIncrs {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		int n = arr.length;
		int [] dp = new int[n];
		
		for(int a=0;a<n;a++)
		{
			int val=0;
			for(int b=0;b<a;b++)
			{
				if(arr[b]>arr[a])
				{val = Math.max(val,dp[b]);}
			}
			
			dp[a] = val+1;
		}
		int max=1;
		for(int i : dp)
		{max = Math.max(i, max);}
		
		System.out.println(max);
	}

}
