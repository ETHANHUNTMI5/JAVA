package backtracking;

public class BlockedMaze {

	public static void main(String[] args) {
		String[][] maze = { { "o","x","o","o" }, { "o", "o", "o", "o" }, { "o", "x", "o", "o" }, { "o", "o", "x", "o" } };

		MAZE(maze, 0, 0, 3, 3, "", new boolean[4][4]);
	}

	public static void MAZE(String[][] maze, int row, int col, int rows, int cols, String ans, boolean[][] visited) {

		
		if(row==rows && col==cols)
		{System.out.println(ans);
		return;}
		
		if(row==-1 || row>rows || col==-1 || col>cols || visited[row][col] || maze[row][col]=="x")
		{return;}
		
		visited[row][col]=true;
		
		// T
		MAZE(maze, row - 1, col, rows, cols, ans + "T", visited);

		// D
		MAZE(maze, row + 1, col, rows, cols, ans + "D", visited);

		// L
		MAZE(maze, row, col-1, rows, cols, ans + "L", visited);

		// R
		MAZE(maze, row, col+1, rows, cols, ans + "R", visited);

		
		visited[row][col]=false;
	}
}
