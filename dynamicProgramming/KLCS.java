package dynamicProgramming;

import java.util.Arrays;

public class KLCS {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "agcfd";
		int k=1;
		System.out.println(KLR(s1, s2, 0, 0, k));
		int [][][] strg = new int[k+1][s1.length()+1][s2.length()+1];
		for(int [][] arr : strg)
		{
			for(int [] a:arr)
			{Arrays.fill(a, -1);}
		}
		System.out.println(KLTD(s1, s2, 0, 0, k, strg));
		System.out.println(KLBU(s1, s2, k));
		
		
	}
	public static int KLR(String s1, String s2 , int v1 ,int v2, int k)
	{
		if(v1==s1.length() || v2==s2.length())
		{
			return 0;
		}
		
		
		int ans=0;
		if(s1.charAt(v1)==s2.charAt(v2))
		{ans = KLR(s1, s2, v1+1, v2+1, k)+1;}
		else
		{
			int val1=0;
			if(k>=1)
			val1 = KLR(s1, s2, v1+1, v2+1, k-1)+1;
			int val2 = KLR(s1, s2, v1, v2+1, k);
			int val3 = KLR(s1, s2, v1+1, v2, k);
			int max = Math.max(val1, Math.max(val2,val3));
			ans = max;
		}
		
		return ans;
	}

	public static int KLTD(String s1, String s2 , int v1 ,int v2, int k,int[][][] strg)
	{
		if(v1==s1.length() || v2==s2.length())
		{
			return 0;
		}
		
		if(strg[k][v1][v2]!=-1)return strg[k][v1][v2];
		int ans=0;
		if(s1.charAt(v1)==s2.charAt(v2))
		{ans = KLTD(s1, s2, v1+1, v2+1, k,strg)+1;}
		else
		{
			int val1=0;
			if(k>=1)
			val1 = KLTD(s1, s2, v1+1, v2+1, k-1,strg)+1;
			int val2 = KLTD(s1, s2, v1, v2+1, k,strg);
			int val3 = KLTD(s1, s2, v1+1, v2, k,strg);
			int max = Math.max(val1, Math.max(val2,val3));
			ans = max;
		}
		
		return strg[k][v1][v2]=ans;
	}
	
	public static int KLBU(String s1,String s2,int K)
	{
		int n = s1.length();
		int m = s2.length();
		int[][][] dp = new int[K+1][n+1][m+1];
		
		for(int k=0;k<=K;k++)
		{
			for(int row=n-1;row>=0;row--)
			{
				for(int col=m-1;col>=0;col--)
				{
				
					int ans=0;
					if(s1.charAt(row)==s2.charAt(col))
					{ans = dp[k][row+1][col+1]+1;}
					else
					{
						int val1=0;
						if(k>=1)
						val1 = dp[k-1][row+1][col+1]+1;
						int val2 = dp[k][row][col+1];
						int val3 = dp[k][row+1][col];
						int max = Math.max(val1, Math.max(val2,val3));
						ans = max;
					}
					dp[k][row][col]=ans;
				}
				
			}

		}
	return dp[K][0][0];}

}
