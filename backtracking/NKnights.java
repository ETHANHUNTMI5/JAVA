package backtracking;

public class NKnights {
  public static int count =0;
	public static void main(String[] args) {

		QueenKill(new boolean[3][3], "", 0,0,0,4);
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
			QueenKill(board, ans+row+"-"+col+" ", row,col+1,qpsf+1,tq);
			board[row][col]=false;
			
		}
		//not place
		QueenKill(board, ans, row, col+1, qpsf, tq);
		
	}

	public static boolean IsItSafe(boolean [][] board ,int row,int col)
	{
		if(row-1>=0 && col-2>=0)
		{if(board[row-1][col-2]==true)
		{return false;}
		}
		
		if(row-2>=0 && col-1>=0)
		{if(board[row-2][col-1]==true)
		{return false;}
		}
		if(row-2>=0 && col+1<board.length)
		{if(board[row-2][col+1]==true)
		{return false;}
		}
		if(row-1>=0 && col+2<board.length)
		{if(board[row-1][col+2]==true)
		{return false;}
		}
		
		
		
	return true;}


}
	
	