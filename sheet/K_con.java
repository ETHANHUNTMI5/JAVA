package sheet;

import java.util.Scanner;

public class K_con {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long t = scn.nextInt();
		
		for(long w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			long k = scn.nextInt();
			
			
			
			
			long [] arr = new long[n];
			long sum=0;
			
			for(int a=0;a<n;a++)
			{
				arr[a]= scn.nextInt();
				sum+=arr[a];
			}
			
			if(k==1)
			{long ans = kadane(arr);
			System.out.println(ans);
			continue;}
			long [] arr2 = new long[2*n];
			
			for(int a=0;a<n;a++)
			{arr2[a]=arr[a];}
			
			for(int a=n;a<2*n;a++)
			{arr2[a]=arr[a-n];}
			
			
			long total = Math.max(sum, 0);
			
			long ans = total*(k-2) + kadane(arr2);
			
						
			
			System.out.println(ans);
			
		}
		
	}
	public static long kadane(long[] arr)
	{
		long cmax=arr[0];
		long omax=arr[0];
		
		for(int a=1;a<arr.length;a++)
		{
			if(cmax>=0)
			{
				cmax=cmax+arr[(int) a];
			}
			
			else
			{
				cmax=arr[a];
			}
			
			if(cmax>omax)
			{
				omax=cmax;
			}
			
		}
		
	return omax;}

}
