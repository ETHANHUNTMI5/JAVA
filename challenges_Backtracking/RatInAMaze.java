package challenges_Backtracking;

import java.util.Scanner;

public class RatInAMaze {
    public static int check=0;
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int n = scn.nextInt();
		int m = scn.nextInt();
      scn.nextLine();
		
		
		char[][] maze = new char[n][m];


		for(int i = 0 ;i<n ; i++)
		{
			String str = scn.nextLine();
			for(int j = 0; j<m ; j++)
			{
				maze[i][j]=str.charAt(j);
				}
		
		}
		
		
		
		
		RATS(0, 0, n-1, m-1, maze, new boolean[n][m], new int [n][m]);
		
		if(check==0)
		{System.out.println(-1);}
		
	}
	public static void RATS(int row,int col,int rows,int cols,char[][] maze,boolean [][] visited,int [][] ans )
	{
		if(row==rows && col == cols && check==0)
		{ans[row][col]=1;
		display(ans);
		check++;
		return;
		
		
		}
		 
		
		
		if(row>rows || col>cols || visited[row][col] || maze[row][col]=='X')
		{return;}
		
		if(check==0)
		{ans[row][col]=1;
		visited[row][col]=true;
		//R
		RATS(row, col+1, rows, cols, maze, visited,ans);
        
		//D
        RATS(row+1, col, rows, cols, maze, visited,ans);		
        
        
        visited[row][col]=false;
        ans[row][col]=0;
		}
		}
	
	
	public static void display(int [][] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			for(int b=0;b<arr[a].length;b++)
			{System.out.print(arr[a][b]+" ");}
			System.out.println();
		}
		
		}
	
	
}