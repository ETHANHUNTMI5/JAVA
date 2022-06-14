package backtracking;

public class QueenCombination2DKill {
public static int count=0;
	public static void main(String[] args) {
		
		QueenKill(new boolean[4][4], "", 0,0,0,4);
	}
	
	public static void QueenKill(boolean[][] board ,String ans,int row,int col,int qpsf,int tq)
	{
		
		if(qpsf==tq)
		{count++;
		System.out.println(count+"."+ans);
		return;}
		
	if(col==board[0].length)
	{
	
		col=0;
		row=row+1;
	}
	if(row==board.length)
	{return;}
		
	 //place
		if(IsItSafe(board, row, col))
		{
			board[row][col]=true;
			QueenKill(board, ans+row+"-"+col+" ", row+1,0,qpsf+1,tq);
			board[row][col]=false;
			
		}
		//not place
		QueenKill(board, ans, row, col+1, qpsf, tq);
		
	}

	public static boolean IsItSafe(boolean [][] board ,int row,int col)
	{
		
		for(int i=row,j=col;i>=0;i--)
		{
			if(board[i][j])
			{return false;}
			
		}
		
		for(int i =row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j])
			{return false;}
			
		}
		
		for(int i = row,j=col;i>=0 && j<board[row].length;i--,j++)
		{
			
			if(board[i][j])
			{return false;}
		
		}
		
		
		
	return true;}


}
