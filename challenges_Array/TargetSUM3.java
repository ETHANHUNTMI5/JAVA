package challenges_Array;

import java.util.Scanner;

public class TargetSUM3 {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		
		char ch ='a';
		System.out.println(ch-9);
//		int n = scn.nextInt();
//		
//		int [] arr = new int [n];
//		
//		takeinput(arr);
//		Selection(arr);
//		
//		int tar=scn.nextInt();
//		triplesum(arr,tar);
	}

	public static void takeinput(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();
			}
		}
	
	public static void triplesum(int [] arr,int tar)
	{
		int n = arr.length;
		
		for(int a=0;a<n;a++)
		{int l=a+1,r=n-1;
		
			
			
		while(l<r)
		{
			if(arr[l]+arr[r]==tar-arr[a])
			{System.out.println(arr[a]+", "+ arr[l]+" and "+arr[r]);
			l++;
			r--;}
			
			else if(arr[l]+arr[r]<tar-arr[a])
			{l++;}
			
			else if(arr[l]+arr[r]>tar-arr[a])
			{r--;}
			
		}
			
		}
		
		
	}
	
	public static void Selection(int [] arr)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{	int min=a;
        	
    		for(int j=a+1;j<=arr.length-1;j++)
    		{
    		
    			if(arr[j]<arr[min])
    		{min=j;}
    				
    		}
    		
    		int temp=arr[a];
    		arr[a]=arr[min];
    		arr[min]=temp;}
    		
    		
    	}
}
