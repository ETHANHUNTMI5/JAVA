package functions_Array;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int []array= null;
				array = new int[n];
		
				for(int a=0;a<n;a++)
				{array[a]=scn.nextInt();}
				
				
	
		Insertion(array);
		display(array);
		
	}

	public static void Insertion(int [] arr)
	{
		for(int a=1;a<=arr.length-1;a++)
		{System.out.println(a);
			int val=arr[a];
		int j=a-1;
		while(j>=0 && arr[j]>arr[j+1])
		{arr[j+1]=arr[j];
			arr[j]=val;
			
		j--;
		
		}
		
		}		
		}
		
	 public static void display(int [] arr)
	    {for(int a=0;a<arr.length;a++)
	    	{System.out.println(arr[a]);}
	    }
	    
	}

		 