package dp;

public class LCS_TRPILETS {

	public static void main(String[] args) {
		
		String s1 = "geeksf";
		String s2 = "geeksfor";
		String s3 = "geeksforgeeks";
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		
		int [][][] dp = new int[l1+1][l2+1][l3+1];
		
		for(int a=l1-1;a>=0;a--)
		{
			for(int b=l2-1;b>=0;b--)
			{
				for(int c=l3-1;c>=0;c--)
				{
					char c1 = s1.charAt(a);
					char c2 = s2.charAt(b);
					char c3 = s3.charAt(c);
					
					if(c1==c2 && c2==c3)
					{
						dp[a][b][c] = dp[a+1][b+1][c+1]+1;
					}
					else
					{
						dp[a][b][c] = Math.max(dp[a+1][b][c], Math.max(dp[a][b+1][c], dp[a][b][c+1]));
					}
				}
			}
		}
		
		System.out.println(dp[0][0][0]);

	}

}
