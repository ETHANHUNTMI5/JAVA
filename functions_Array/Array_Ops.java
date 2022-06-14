package functions_Array;

import java.util.Scanner;

public class Array_Ops {

	 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int []array = takeinput();
	   display(array);	
	}

	public static int[] takeinput()
	{System.out.println("SIZE?");
	int n = scn.nextInt();
	
	int [] arr   = new int[n];
	
	for(int a=0;a<n;a++)
	{System.out.println("VALUE?");
	arr[a] = scn.nextInt();
	}
			
	return arr;}
	
	public static void display(int[] arr)
	{for(int a=0;a<arr.length;a++)
	{System.out.println(arr[a]);
	}
	
		
		
	}
}
