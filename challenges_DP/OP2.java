package challenges_DP;

import java.util.Scanner;

public class OP2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		System.out.println(Op(arr));
	}
	public static int Op(int [] arr)
	{
		int n =arr.length;
		int [][] dp = new int[n][n];
		
		for(int slide=0;slide<=n-1;slide++)
		{
			for(int si= 0,ei=slide;ei<=n-1;si++,ei++)
			{
				
					
					if(slide==0)
					{
					
						{dp[si][ei]=arr[si];}
					}
					else if(slide==1)
					{
						dp[si][ei]= Math.max(arr[si],arr[ei] );
					}
					
					else
					{
						int val1 = arr[si]+Math.min(dp[si+2][ei], dp[si+1][ei-1]);
						int val2 = arr[ei]+ Math.min(dp[si][ei-2], dp[si+1][ei-1]);
						dp[si][ei]= Math.max(val1, val2);
					}
				
				
				
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{System.out.print(dp[i][j]+" ");}
			System.out.println();
		}
		return dp[0][n-1];
		
	}

}
