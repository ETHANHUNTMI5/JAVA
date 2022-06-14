package functions_Array;

import java.util.Scanner;

public class BUBBLE {

	public static void main(String[] args) {
      
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int []array= null;
				array = new int[n];
		
				for(int a=0;a<n;a++)
				{array[a]=scn.nextInt();}
				
				
				
		bubble(array);
		display(array);
		
	   }
	
    public static void bubble(int [] arr)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{
    		for(int j=0;j<arr.length-1-a;j++)
    		{if(arr[j]>arr[j+1])
    		{int temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;}
    				
    		}
    	}
    	
    	
    }
    public static void display(int [] arr)
    {for(int a=0;a<arr.length;a++)
    	{System.out.println(arr[a]);}
    }
    
}
