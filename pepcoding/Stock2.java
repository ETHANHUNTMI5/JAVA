package pepcoding;

import java.util.Scanner;

public class Stock2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int fee= scn.nextInt();
		
		int min = arr[0];
		int [] dp = new int[n];
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]>=min)
			{
				dp[a]= arr[a]-min;
				min=arr[a];
			}
			
			else
			{
				min = arr[a];
				dp[a]=0;
			}
			
		}	
	
	for(int i : dp)
	{
		System.out.print(i+" ");
	}
System.out.println();
	int ans=0;
	for(int a=0;a<n;a++)
	{
		//if(dp[a]>=fee)
		ans=ans+dp[a];
	}
	System.out.println(ans);
	
	}
}