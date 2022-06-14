package pepcoding;

import java.util.Scanner;

public class Stock1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		
		int min = arr[0];
		int [] dp = new int[n];
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]>=min)
			{
				dp[a]= arr[a]-min;
			}
			
			else
			{
				min = arr[a];
				dp[a]=0;
			}
			
		}
		
		int ans=-1;
		
		for(int a=0;a<n;a++)
		{
			if(dp[a]>ans)
			{
				ans = dp[a];
			}
		}
		System.out.println(ans);
		for(int i : dp)
		{
			System.out.print(i+" ");
		}
	}

}
