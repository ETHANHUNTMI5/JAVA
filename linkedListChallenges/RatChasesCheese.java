package linkedListChallenges;

import java.util.Scanner;

public class RatChasesCheese {
	public static int count = 0;
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
		
		int [][] Num=new int [n][m];
		
		Rat(n, m, maze,Num, 0, 0, new boolean [n][m]);
		
		if(count==0)
		{System.out.println("NO PATH FOUND");}
		
		
	}

	
	
public static void Rat(int rows, int cols, char[][] arr, int[][] Num, int row, int col, boolean[][] board) {
if (row==-1 ||col==-1 ||col == cols || row == rows || arr[row][col] == 'X' || count > 1 || board[row][col]==true) {
			return;
		}

if (col == cols - 1 && row == rows - 1 && count ==0) {
Num[row][col]=1;
display(Num, rows, cols);
count++;
return;

		}

		if(count==0)
		{	board[row][col]=true;
		Num[row][col]=1;

		// left
		Rat(rows, cols, arr, Num, row, col - 1, board);

		// right
		Rat(rows, cols, arr, Num, row, col + 1, board);

		// up
		Rat(rows, cols, arr, Num, row-1, col, board);

		// down
		Rat(rows, cols, arr, Num, row + 1, col, board);
 
		board[row][col]=false;
		Num[row][col]=0;
		}
	}
	public static void display(int [][] arr,int rows,int cols)
	{
		for(int a=0;a<rows;a++)
		{
			for(int b=0;b<cols;b++)
			{
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
		
	}

}
