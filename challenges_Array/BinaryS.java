package challenges_Array;

import java.util.Scanner;

public class BinaryS {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int n = scn.nextInt();
		int [] arr = new int [n];
		takeinput(arr);
		int num=scn.nextInt();
		System.out.println(Binary(arr,num));
	}
	public static void takeinput(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();
			}}
		  public static int Binary(int [] arr,int item)
		    {
		    	int lo=0,hi=arr.length-1;
		   
		    	while(lo<=hi)
		    	{
		    	 	int mid= (lo+hi)/2;

		    		if(arr[mid]<item)
		    		{lo=mid+1;}
		    		else if(arr[mid]>item)
		    		{hi=mid-1;}
		    		else
		    		{return mid;}
		    		
		    		
		    		
		    	}
		    	return -1;
		    }
		}

	
	

