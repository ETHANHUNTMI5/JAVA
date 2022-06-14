package pepcoding;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		int [] dp = new int[tar+1];
		dp[0]=1;
		
		for(int a=0;a<n;a++)
		{
			int ele= arr[a];
			
			for(int b=1;b<=tar;b++)
			{
				if(b-ele>=0)
				{
					dp[b]+=dp[b-ele];
				}
			}
			
		}
		
	System.out.println(dp[tar]);	
	}

}
