package functions_Array;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int []array= null;
		array = new int [n];
		
		for(int a=0;a<array.length;a++)
		{array[a]=scn.nextInt();}
		
				
		Selection(array);
	 
		
		
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
    public static void display(int [] arr)
    {for(int a=0;a<arr.length;a++)
    	{System.out.println(arr[a]);}
     
    
    
    }
    
    
}
