package challenges_Array;

import java.util.Scanner;

public class SortInLinearTime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
				
		int [] arr = new int [n];
		
		for(int a=0;a<arr.length;a++)
		{arr[a]= scn.nextInt();}
		
		int l=0,m=0,h=n-1;
		
		while(m<=h)
		{
			if(arr[m]==0)
			{swap(arr,l,m);
			l++;
			m++;}
			else if (arr[m]==1)
			{m++;}
			else
			{swap(arr,m,h);
			h--;
			}
			}
	
		display(arr);
	}

	public static void swap(int [] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;}
		
	public static void display(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			System.out.println(arr[a]);
		}
		
		
		
	}
		
	
}
