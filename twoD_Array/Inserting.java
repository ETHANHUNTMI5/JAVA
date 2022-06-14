package twoD_Array;

import java.util.Scanner;

public class Inserting {

	public static void main(String[] args) {
		
		int arr[][] = takeInput();
		display(arr);
	}
     private static int[][] takeInput(){
    Scanner scn = new Scanner(System.in);
    System.out.println("THE NO. OF ROWS");
    int rows = scn.nextInt();
    
    int [][]arr=new int [rows][];
    	 for(int row=0;row<rows;row++)
    	 {System.out.println("THE NO. OF COLS IN ROW "+row);
    	 int cols=scn.nextInt();
    	    arr[row]=new int[cols];
    		 
    	    for(int col=0;col<cols;col++)
    	    {System.out.println("VALUE AT ROW "+ row +" and COL " + col);
    	    arr[row][col]=scn.nextInt();
    	       	    }
	 
    	 }
    	 
    	    	 
     return arr;}
     
     public static void display(int [][] arr)
     {for(int row=0;row<arr.length;row++)
     {for(int col=0;col<arr[row].length;col++)
         {
    	 System.out.print(arr[row][col]+" ");
    	 
         }
	 System.out.println();
	   
     }
    	 
     }
     }

