package leetCode;

public class JumpGame {

	public static void main(String[] args) {
		
		int [] arr = {2,3,0,1,4};
		
		int n = arr.length;
		int [] dp= new int[n];
		
		dp[n-1]=0;
		
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>=n-i-1)
			{dp[i]=1;
			continue;}
			
			int min = 2*n;
			
			for(int a=1;a<=arr[i];a++)
			{
				if(dp[i+a]+1<min)
				{
					min = dp[a+i]+1;
				}
				
			}
			dp[i]=min;
		}
		
		for(int i :arr)
		{System.out.print(i+" ");}
        
		System.out.println();
		for(int i : dp)
		{System.out.print(i+" ");}
		
		System.out.println(dp[0]);
	}

}
