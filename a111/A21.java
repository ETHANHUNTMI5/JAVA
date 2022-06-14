package a111;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			int [] arr1 = new int[n];
			int [] arr2 = new int[n];
			
			for(int a=0;a<n;a++)
			{arr1[a]=scn.nextInt();}
			for(int a=0;a<n;a++)
			{arr2[a]=scn.nextInt();}
			
			for(int a=0;a<n;a++)
			{if(arr2[a]>arr1[a])
			{
				int temp = arr1[a];
				arr1[a] = arr2[a];
				arr2[a]=temp;
			}
			  
			}
			int max1=Integer.MIN_VALUE;
			int max2=Integer.MIN_VALUE;
			for(int a=0;a<n;a++)
			{
				if(arr1[a]>max1)
				{max1=arr1[a];}
				if(arr2[a]>max2)
				{max2=arr2[a];}
			}
			System.out.println(max1*max2);  
			
		}

	}

}
