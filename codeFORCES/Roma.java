package codeFORCES;

import java.util.Scanner;

public class Roma {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		long min=100000000;
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			
		}
		
		for(int a=0;a<n&& k>0 ;a++)
		{
			if(arr[a]<0)
			{arr[a]= arr[a]*-1;
			k--;}
			
			
		}
		
		
		long sum=0;
		for(int a=0;a<n;a++)
		{
			if(arr[a]<min)
			{min=arr[a];}
			sum+=arr[a];
			
		}
		if(k!=0 && k%2!=0)
		{
			sum= sum-2*min;
			
		}
			
		System.out.println(sum);
		
	}

}
