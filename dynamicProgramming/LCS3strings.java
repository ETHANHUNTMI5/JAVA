package dynamicProgramming;

import java.util.Arrays;

public class LCS3strings {

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "geeksfor";
		String s3 = "geeksforgeeks";
		System.out.println(LCR(s1, s2, s3, 0, 0, 0));
		int [][][] strg = new int[s1.length()+1][s2.length()+1][s3.length()+1];
		for(int [][] arr : strg)
		{
			for(int [] a:arr)
			{Arrays.fill(a, -1);}
		}
		
		System.out.println(LCTD(s1, s2, s3, 0, 0, 0, strg));
		System.out.println(LCBU(s1, s2, s3));

	}
	
	public static int LCR(String s1,String s2 ,String s3,int v1 , int v2, int v3)
	{
		if(v1==s1.length() || v2==s2.length() || v3==s3.length())
		{return 0;}
		
		char c1 = s1.charAt(v1);
		char c2 = s2.charAt(v2);
		char c3 = s3.charAt(v3);
		
		int ans=0;
		if(c1==c2 && c2==c3)
		{
			ans = LCR(s1, s2, s3, v1+1, v2+1, v3+1)+1;
		}
		else
		{
			int val1 = LCR(s1, s2, s3, v1+1, v2, v3);
			int val2 = LCR(s1, s2, s3, v1, v2+1, v3);
			int val3 = LCR(s1, s2, s3, v1, v2, v3+1);
			
			ans = Math.max(val1, Math.max(val2,val3));
		}
		return ans;
	}
	public static int LCTD(String s1,String s2 ,String s3,int v1 , int v2, int v3,int[][][] strg)
	{
		if(v1==s1.length() || v2==s2.length() || v3==s3.length())
		{return 0;}
		
		char c1 = s1.charAt(v1);
		char c2 = s2.charAt(v2);
		char c3 = s3.charAt(v3);
		
		if(strg[v1][v2][v3]!=-1)return strg[v1][v2][v3];
		int ans=0;
		if(c1==c2 && c2==c3)
		{
			ans = LCR(s1, s2, s3, v1+1, v2+1, v3+1)+1;
		}
		else
		{
			int val1 = LCTD(s1, s2, s3, v1+1, v2, v3,strg);
			int val2 = LCTD(s1, s2, s3, v1, v2+1, v3,strg);
			int val3 = LCTD(s1, s2, s3, v1, v2, v3+1,strg);
			
			ans = Math.max(val1, Math.max(val2,val3));
		}
		return strg[v1][v2][v3]=ans;
	}
	
	public static int LCBU(String s1, String s2 , String s3)
	{
		int n = s1.length();
		int m = s2.length();
		int l = s3.length();
		
		int [][][] dp = new int[n+1][m+1][l+1];
		
		for(int v1=s1.length()-1;v1>=0;v1--)
		{
			for(int v2=s2.length()-1;v2>=0;v2--)
			{
				for(int v3=s3.length()-1;v3>=0;v3--)
				{
					char c1 = s1.charAt(v1);
					char c2 = s2.charAt(v2);
					char c3 = s3.charAt(v3);
					
					
					int ans=0;
					if(c1==c2 && c2==c3)
					{
						ans = dp[v1+1][v2+1][v3+1]+1;
					}
					else
					{
						int val1 = dp[v1+1][v2][v3];
						int val2 = dp[v1][v2+1][v3];
						int val3 = dp[v1][v2][v3+1];
						
						ans = Math.max(val1, Math.max(val2,val3));
					}
					
					dp[v1][v2][v3]=ans;
				}
			}
		}
	return dp[0][0][0];}
}
