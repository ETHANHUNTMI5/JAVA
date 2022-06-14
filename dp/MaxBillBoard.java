package dp;

public class MaxBillBoard {

	public static void main(String[] args) {
		int n =4;
		
		int [] x = {6, 9, 12, 14};
		int [] p = {5, 6, 3, 7};
		int t =2;
		int max = x[n-1];
		int [] dp = new int[max+1];
		
		int a=0;
		a=x[0];
		int pre=0;
		for(;a<=max;a++)
		{
			if(x[pre]==a)
			{
				int x1=-1;
				int y1 =-1;
				if(a-t-1>=0)
				{x1 = dp[a-t-1]+p[pre];}
				
				y1 = dp[a-1];
				dp[a] = Math.max(x1, y1);
				pre++;
			}
			
			else
			{dp[a]=dp[a-1];}
			
		}
		
		for(int i : dp)
		{System.out.print(i+" ");}

	}

}
