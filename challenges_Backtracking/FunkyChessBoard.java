package challenges_Backtracking;

import java.util.Scanner;

public class FunkyChessBoard {
	public static int check =0;
public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int [][] arr = new int [n][n];
		boolean [][] board = new boolean[n][n];
      
	
        
        take(arr);
     
        
	  funky(arr, board, 0, 0, n);
    	 
	  display(board);

	  
	          int t=0;
		  for(int a=0;a<arr.length;a++)
		  {
			  for(int b=0;b<arr[0].length;b++)
			  {
				  if(arr[a][b]==1)
				  {t++;}
			  }
			  
		  }
         System.out.println(t);
		  System.out.println(check);
		 
		System.out.println(t-check);
      
	}
	
	
	
public static void take(int [][] arr)
{
  for(int a=0;a<arr.length;a++)
  {
	  for(int b=0;b<arr[0].length;b++)
	  {arr[a][b]=scn.nextInt();}
	  
  }
	  
}

public static void funky(int[][] arr,boolean [][] board,int row,int col,int n)
{
	if(row<0 || row>=n || col<0 || col>=n ||  board[row][col]==true || arr[row][col]==0)
	{return;}
	
	 
	      if(board[row][col]==false && arr[row][col]==1)
			{board[row][col]=true;
			check++;
			}
			
		   int [] rows= {-2,-1,+1,+2,+2,+1,-1,-2}; 
		   int [] cols= {+1,+2,+2,+1,-1,-2,-2,-1};

	  
		  	for(int a=0;a<rows.length;a++)
		   	{
		    		funky(arr, board, row+rows[a], col+cols[a], n);
		    		
	    	}
		    	
		    	
			}
	      











	public static void display(boolean [][] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			for(int b=0;b<arr[a].length;b++)
			{System.out.print(arr[a][b]+" ");}
			System.out.println();
		}
		
		}





}
