package challenges_Backtracking;

import java.util.Scanner;

public class Count_NQueen {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	boolean [][] chess = new boolean[n][n];
	 
	 System.out.println(Count(chess,0,0));
	 
	}

	public static int Count(boolean[][] box,int row , int col)
	{
	
		 if(row==box.length)
		 {return 1;}
		
		int count =0;
	 		
		for(int a=0;a<box[row].length;a++)
		{
			if(TELL(box, row, a))
			{
				box[row][a]=true;
				count = count+Count(box, row+1, col);
				box[row][a]=false;
			}
			
			
			
		}
	
	
	return count;}
	
	
	
	
		
		public static boolean TELL(boolean[][] box ,int row , int col)
		{
         
			for(int a=0;a<=row;a++)
			{
				if(box[a][col]==true)
				{return false;}
				
			}
			 
			for(int a=row,b=col;a>=0 && b>=0;a--,b--)
			{
				if(box[a][b]==true)
				{return false;}
				
				
			}
	
			
			for(int a=row,b=col;a>=0 && b<=box[row].length-1;a--,b++)
			{
				if(box[a][b]==true)
				{return false;}
				
				
			}
	
	

			
		return true;}
	}
	
	

