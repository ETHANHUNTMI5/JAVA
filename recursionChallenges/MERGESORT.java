package recursionChallenges;

import java.util.Scanner;

public class MERGESORT {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int [] arr = new int [n];
		 take(arr);
	
		 int [] ans  =MergeSortyo(arr, 0, n-1);
		 display(ans);
	}

	public static void take(int[] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();}
		
		
	}
	
	public static int[] Merge2(int[] arr1 ,int[] arr2)
	{
		int i=0,j=0,k=0;
		int [] ans = new int [arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				ans[k]=arr1[i];
				i++;
				k++;
			}
			
			else
			{ans[k]=arr2[j];
			j++;
			k++;
			
			}
			
			
			
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{ans[k]=arr2[j];
			j++;
			k++;
			}
			
		}
		
		if(j==arr2.length)
		{
			while(i<arr1.length)
			{ans[k]=arr1[i];
			i++;
			k++;
			
			
			}	
		}
		
		
		
	return ans;}
	
	public static int[] MergeSortyo(int [] arr,int lo,int hi)
	{
		if(lo==hi)
		{int[] br = new int[1];
		br[0]=arr[lo];
		return br;}
		
		int mid = (lo+hi)/2;
		
		int [] fh = MergeSortyo(arr, lo,mid);
		int [] sh = MergeSortyo(arr, mid+1,hi);
		
	int[] merge	=Merge2(fh, sh);
		
	
	return merge;}
	
	public static void display(int[] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
			
		}
		
	}
	
	
}
