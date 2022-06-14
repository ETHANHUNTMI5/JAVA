package recursionChallenges;

import java.util.Scanner;

public class SubsetSumEasy {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			int [] arr = new int[n];
			takeinput(arr);
			int k=sum(arr, 0, 0, 0);
			System.out.println(k);
			if(k>0)
			{System.out.println("Yes");}
			else
			{System.out.println("No");}
		}
		
	}
	
	public static int sum(int[] arr,int ans,int vi,int tar)
	{
		if(vi==arr.length)
		{
			if(ans==tar)
			{return 1;}
			else
			{return 0;
			}}
		int count=0;
		
		count=count+sum(arr, ans, vi+1,tar);
		count=count+sum(arr, ans+arr[vi], vi+1,tar);
		
		return count;
	}
	
	
	
	
	
	
	public static void takeinput(int [] arr)
	{
		for(int a =0;a<arr.length;a++)
		{arr[a]=scn.nextInt();}
		
		
	}

}
