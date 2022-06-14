package dp;

public class OptimalGame {

	public static void main(String[] args) {
		
		int [] arr = {5,3,7,10};
		int n = arr.length;
		int [][] dp = new int[n][n];
	        
	        //gap strategy
	        for(int g=0;g<n;g++)
	        {
	            for(int i=0,j=g;j<n;i++,j++)
	            {
	                if(g==0)
	                {
	                    dp[i][j]=arr[i];
	                }
	                else if(g==1)
	                {
	                    dp[i][j] = Math.max(arr[i],arr[j]);
	                }
	                else
	                {
	                    // (i,j)-->available
	                    
	                    //(i+1,j)--> i is picked
	                    int val1 = arr[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
	                    
	                    //(i,j-1)--> j is picked
	                    int val2 = arr[j]+Math.min(dp[i+1][j-1],dp[i][j-2]);
	                    
	                    dp[i][j] = Math.max(val1,val2);
	                }

	            }
	        }
System.out.println(dp[0][n-1]);
	}

}
