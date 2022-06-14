package dp;

public class LCSubString {

	public static void main(String[] args) {
		String s1 = "zxabcdezy";
		String s2 = "GeeksQuiz";
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		
		int [][] dp = new int[n1+1][n2+1];
		
		
		for(int i=n1-1;i>=0;i--)
		{
			for(int j=n2-1;j>=0;j--)
			{
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(j);
				
				if(c1!=c2)
				{
					dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
				}
				else
				{
					dp[i][j] = Math.max(1+dp[i+1][j+1], Math.max(dp[i][j+1], dp[i+1][j]));
				}
			}
		}
		
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n2;j++)
			{
			System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(dp[0][0]);
	}

}
