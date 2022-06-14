package sheet;

import java.util.Arrays;

public class Wiggle_SORT {

	public static void main(String[] args) {
		
		int [] arr = {3, 5, 2, 1, 6, 4};
		
		
		int n = arr.length;
		for(int a=0;a<n-1;a++)
		{
			
			if(a%2==0)
			{
			if(arr[a]>arr[a+1])
			{
				int temp = arr[a];
				arr[a]=arr[a+1];
				arr[a+1]=temp;
			}
			}
			
			else
			{
				if(arr[a]<arr[a+1])
				{
					int temp = arr[a];
					arr[a]=arr[a+1];
					arr[a+1]=temp;	
				}
				
			}
		}
		
		
		for(int t : arr)
		{System.out.print(t+" ");}
	}

}
