package recursionPrint;

public class CountNQueen {

	public static void main(String[] args) {

		boolean[][] board = new boolean[4][4];
        System.out.println(Count(board, 0));
		
	}
	public static int Count(boolean [][] board , int row)
	{
		if(row== board.length)
		{
			return 1;
		}
		int count=0 ;
		for(int col=0;col<board[row].length;col++)
		{
			if(IsItSafe(board,row,col))
			{board[row][col]=true;
		
		count=count+Count(board, row+1);
			board[row][col]=false;
			
			}
			
		}
		return count;
	}

	public static boolean IsItSafe(boolean [][] board , int row,int col)
	{
        for(int a =row;a>=0;a--)
        {
        	if(board[a][col])
        	{return false;}
        	
        }
		
        for(int i=row, j =col;i>=0 && j>=0;i--,j--)
        {
        	if(board[i][j])
        	{return false;}
        	
        	
        }
		
        for(int i=row, j =col;i>=0 && j<board[row].length;i--,j++)
        {
        	if(board[i][j])
        	{return false;}
        	
        	
        }
		
        return true;
}
	
}
