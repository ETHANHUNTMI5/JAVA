package pepcoding;

import java.util.Scanner;

public class CoinChangePermu {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		int[] dp = new int [tar+1];
		
	
		dp[0]=1;
		for(int a=1;a<=tar;a++)
		{
			for(int b=0;b<n;b++)
			{
				if(a-arr[b]>=0)
				{
					dp[a]+=dp[a-arr[b]];
				}
				
			}
			
		}
		
		System.out.println(dp[tar]);
	
	}
}
