package abc;
import java.util.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class A2{

	public static void main(String[] args)
	{
		int n = 9;
		int [] prime = {3, 5, 7, 11, 13};
		
		int l = prime.length;
		
		int [] arr = new int[l];
		int [] dp = new int[n];
		
		dp[0]=1;
		int min_val =Integer.MAX_VALUE;
		for(int a=1;a<n;a++)
		{
			min_val=Integer.MAX_VALUE;
			
			for(int i=0;i<l;i++)
			{
				if(prime[i]*dp[arr[i]]<min_val)
				{min_val = prime[i]*dp[arr[i]];}
			}
			
			for(int i=0;i<l;i++)
			{
				if(prime[i]*dp[arr[i]]==min_val)
				{
					arr[i]=arr[i]+1;
				}
			}
			
		dp[a] = min_val;}
		System.out.println(dp[n-1]);
	}
}
