package challenges_Array;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr = new int[n];
		
		int max=arr[0];
		for(int a=0;a<n;a++)
		{
			arr[a]=scn.nextInt();
			if(arr[a]>max)
			{max=arr[a];}
			
			
		}
		
		int k = max;
		int [] count = new int[max+1];

		for(int a=0;a<n;a++)
		{
			count[arr[a]]++	;		
		}
	 
		for(int i =1;i<=k;i++)
		{
			count[i]=count[i]+count[i-1];
		}
	
		int [] b= new int[n];
 		for(int i = n-1;i>=0;i--)
		{
			int t =--count[arr[i]];
			b[t]=arr[i];
		}
	
	for(int l:b)
	{System.out.print(l+" ");}
	}
	

}
