package dynamicProgramming;

public class LongestPalinSubSeq {

	public static void main(String[] args) {
		// longest palin subseq i.e --> not necessarily continuous

		String s = "abcecga";
		int n = s.length();
		System.out.println(LPR(s, 0, n-1));
		System.out.println(LPTD(s, 0, n-1, new int[n][n]));
		System.out.println(LPBU(s));
	}

	public static int LPR(String s , int si, int ei)
	{
		if(si>ei)return 0;
		if(si==ei)return 1;
		int ans=0;
		if(s.charAt(si)==s.charAt(ei))
		{
			ans = LPR(s, si+1, ei-1)+2;
		}
		else
		{
			int val1 = LPR(s, si+1, ei);
			int val2 = LPR(s, si, ei-1);
			ans = Math.max(val1, val2);
		}
	return ans;}
	
	public static int LPTD(String s , int si, int ei,int [][] strg)
	{
		if(si>ei)return 0;
		if(si==ei)return 1;
		
		if(strg[si][ei]!=0)return strg[si][ei];
		
		int ans=0;
		if(s.charAt(si)==s.charAt(ei))
		{
			ans = LPTD(s, si+1, ei-1,strg)+2;
		}
		else
		{
			int val1 = LPTD(s, si+1, ei,strg);
			int val2 = LPTD(s, si, ei-1,strg);
			ans = Math.max(val1, val2);
		}
	return strg[si][ei]=ans;}
	
	public static int LPBU(String s)
	{
		int n = s.length();
		int [][] dp = new int[n][n];
		
		for(int gap=0;gap<n;gap++)
		{
			for(int row=0,col=gap;col<n;row++,col++)
			{
				if(gap==0)
				{dp[row][row]=1;}
				else
				{
					int ans=0;
					if(s.charAt(row)==s.charAt(col))
					{
						ans = dp[row+1][col-1]+2;
					}
					else
					{
						int val1 = dp[row+1][col];
						int val2 = dp[row][col-1];
						ans = Math.max(val1, val2);
					}
					dp[row][col]=ans;
				}
			}
		}
		
	return dp[0][n-1];}
}
