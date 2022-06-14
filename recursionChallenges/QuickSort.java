package recursionChallenges;

import java.util.Scanner;

public class QuickSort {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		
		int [] arr = new int [n];
		take(arr);
		Quick(arr, 0, arr.length-1);
		display(arr);
	}
	
	public static void take(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();}
		
	}

	public static void Quick(int[] arr,int lo,int hi)
	{
		if(lo>=hi)
		{return;}
		
		int mid = (lo+hi)/2;
		int left =lo;
		int right=hi;
		int par=arr[mid];
		
		while(left<=right)
		{
			while(arr[left]<par)
			{left++;}
			
			while(arr[right]>par)
			{right--;}
			
			if(left<=right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
			
			
		
		}
		
		
		Quick(arr, lo, right);
		Quick(arr, left, hi);		
		
	}
	
	public static void display(int[] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
			
		}
		
	}
}
