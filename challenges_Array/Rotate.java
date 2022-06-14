package challenges_Array;

import java.util.Scanner;

public class Rotate {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int [][] arr = new int [n][n];
		takeinput(arr);
		rotate(arr,n);
	}
 
	 public static void takeinput(int [][] arr)
	 {
		 for(int row=0;row<arr.length;row++)
		 {
			 for(int col=0;col<arr.length;col++)
			 {
				 arr[row][col]=scn.nextInt();
			 }
			 
			 
		 }
		 
		 
	 }
	 
	 public static void rotate(int [][] arr,int n) {
		 int [][] array = new int [n][n];
		 
		 for(int row =0;row<n;row++)
		 {
			 for (int col=0;col<n;col++)
			 {
				 array[row][col]=arr[col][n-1-row];
		     }
		 
		 }
		 display(array);		 
		  
	 }
	 public static void display(int [][] arr)
     {for(int row=0;row<arr.length;row++)
     {for(int col=0;col<arr[row].length;col++)
         {
    	 System.out.print(arr[row][col]+" ");
    	 
         }
	 System.out.println();
	   
     }
    	 
     }}
