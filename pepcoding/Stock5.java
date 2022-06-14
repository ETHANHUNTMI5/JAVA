package pepcoding;

import java.util.Arrays;
import java.util.Scanner;

public class Stock5 {

	public static void main(String[] args) {
   
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}

		int min= arr[0];
		
		int [] l = new int[n];
		
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]>=min)
			{
				l[a]= arr[a]-min;
			}
			
			else
			{
				min = arr[a];
			}
		}
		
		
		for(int a=1;a<n;a++)
		{
			if(l[a-1]>l[a])
			{
				l[a]=l[a-1];
			}
		}
		
		
	 
		int max = arr[n-1];
		
		int [] r = new int[n];
		
		for(int a=n-2;a>=0;a--)
		{
			if(arr[a]<=max)
			{
				r[a]= max-arr[a];
			}
			
			else
			{
				max = arr[a];
			}
		}
		
		for(int a=n-2;a>=0;a--)
		{
			if(r[a+1]>r[a])
			{
				r[a]=r[a+1];
			}
		}
		
		
				int ans = -1;
		
		for(int a=0;a<n;a++)
		{
			if(l[a]+r[a]>=ans)
			{
				ans= l[a]+r[a];
			}
			
			
		}
		System.out.println(ans);
		
	}
}