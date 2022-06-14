package recursionPrint;

public class PrintNQueen {

	public static void main(String[] args) {

		boolean[][] board = new boolean[4][4];
		print(board, 0, "");

	}

	public static void print(boolean [][] board,int row, String s)
	{
		if(row==board.length)
		{System.out.println(s);
		return;}
		
		String s2 ="";
		for(int col=0;col<board[row].length;col++)
		{
			if(IsItSafe(board,row,col))
			{
				board[row][col]=true;
				int t =row+1;
				int k =col+1;
				s2=s+t +"-" + k+" ";
				
				print(board, row+1, s2);
				board[row][col]=false;
			}
			
		}
		
		
		
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
