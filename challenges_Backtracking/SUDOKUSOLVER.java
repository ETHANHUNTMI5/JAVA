package challenges_Backtracking;

import java.util.Scanner;


public class SUDOKUSOLVER {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[][] board = new int[n][n];
	
		take(board);
				
		
			Sudoku(board, 0, 0, n);

	   display(board);
	}

	public static void take(int[][] arr) {
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				arr[a][b] = scn.nextInt();

			}

		}

	}
	
	public static void Sudoku(int [][] board,int row,int col,int n)
	{
		if(row==n)
		{ 
			display(board);
			return;}

		
		
		if(col==n)
		{
			Sudoku(board, row+1, 0, n);
			return;
		}
		
		if(board[row][col]!=0)
		{
			Sudoku(board, row, col+1, n);
			return;
		}
		
		
		
		for(int a=1;a<=9;a++)		
		{	if(IsItSafe(board, row, col, a, n));
			{
				board[row][col]=a;
				Sudoku(board, row, col+1, n);
				board[row][col]=0;
			}
			
		}
		
		
		
		
		
		
		
	}
	
	public static boolean IsItSafe(int [][] board,int row,int col,int num,int n)
	{
		for(int a=0;a<n;a++)
		{
			if(board[row][a]==num || board[a][col]==num)
			{return false;}
	 	}
	    
		int sqrootn=(int)Math.sqrt((int)n);
		
		int rownew  = (row/sqrootn); 
		int rowstart = rownew*sqrootn;
		
		
		int colnew  = (col/sqrootn); 
		int colstart = colnew*sqrootn;
		
		for(int a= rowstart;a<=rowstart+2;a++)
		{
			for(int b= colstart;b<=colstart+2;b++)
			{
				if(board[a][b]==num)
				{return false;}
				
			}
			
		}
		
		
		
	return true;}
	
	
	public static void display(int [][] arr)
	{
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
                  System.out.print(arr[a][b]);

			}
          System.out.println();
		}


		
		
	}
	
}