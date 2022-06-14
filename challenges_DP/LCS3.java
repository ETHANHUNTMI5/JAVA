package challenges_DP;

import java.util.Scanner;

public class LCS3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		String s3 = scn.nextLine();
	 
		System.out.println(Lcs3(s1, s2, s3));
	}

	public static int Lcs3(String s1,String s2,String s3)
	{
		int m= s1.length();
		int n= s2.length();
		int o= s3.length();
		
		int [][][] dp = new int[m+1][n+1][o+1];
		
		for(int i =m-1;i>=0;i--)
		{
			for(int j=n-1;j>=0;j--)
			{
				for(int k=o-1;k>=0;k--)
				{
					if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(k))
					{
						dp[i][j][k]=1+dp[i+1][j+1][k+1];
					}
					else
					{
						dp[i][j][k]= Math.max(dp[i+1][j][k], Math.max(dp[i][j+1][k],dp[i][j][k+1] ));
						
					}
					
				}
			}
		}
		return dp[0][0][0];
		
	}
}
