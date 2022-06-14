package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A4 {
public static int  min=10000000;
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		int sum=0;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			sum+=arr[a];
		}
		BU(arr, sum);
		
}
		public static void BU(int []arr,int sum)
	{
		boolean[][] dp = new boolean[arr.length+1][sum+1];
		
		for(int row=1;row<=arr.length;row++)
		{
			for(int col=1;col<=sum;col++)
			{
				if(dp[row-1][col]==true)
				{
					dp[row][col]=true;
				}
				
				if(arr[row-1]==col)
				{dp[row][col]=true;}			
			
				if(col-arr[row-1]>=0)
				{
					if(dp[row-1][col-arr[row-1]]==true)
			    {
			    	dp[row][col]=true;
			    }
				}
				
			}
			
		}
		
		
		for(int i=sum/2;i<=sum;i++)
		{
			if(dp[arr.length][i])
			{
				System.out.println(Math.max(i, sum-i));
				break;
			}
		}
	}
}