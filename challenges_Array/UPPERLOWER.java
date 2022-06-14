package challenges_Array;

import java.util.Scanner;

public class UPPERLOWER {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int [] arr = new int [n];
		takeinput(arr);
		
		int t = scn.nextInt();
	
	   for (int a=1;a<=t;a++)
	   {int p=scn.nextInt();
		   System.out.println(lower(arr,p)+" "+upper(arr,p));
	   }
	}

	public static void takeinput(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();
			}
		}
	
	public static int upper(int [] arr, int item)
	{
		int lo=0,hi=arr.length-1;
		int ans=-1;
		while(lo<=hi)
		{int mid=(lo+hi)/2;
		
		if(arr[mid]==item)
		{lo = mid+1;
		ans=mid;}
		
		else if(arr[mid]>item)
		{hi = mid-1;}
		
		else
		{lo=mid+1;}
		}
		return ans;
	}
	public static int lower(int [] arr, int item)
	{
		int lo=0,hi=arr.length-1;
		int ans=-1;
		while(lo<=hi)
		{int mid=(lo+hi)/2;
		
		if(arr[mid]==item)
		{hi = mid-1;
		ans=mid;}
		
		else if(arr[mid]>item)
		{hi = mid-1;}
		
		else
		{lo=mid+1;}
		}
		return ans;
	}
}
