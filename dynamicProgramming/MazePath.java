package dynamicProgramming;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(Maze(0, 0, n, n));
		System.out.println(MazeTop(0, 0, n, n, new int[n+1][n+1]));
		System.out.println(MazeBU(n));
		System.out.println(MazeBUSE(n));
	}

	public static int Maze(int cr, int cc , int er , int ec)
	{
		if(cr==er && cc==ec)return 1;
		if(cr>er || cc>ec)return 0;
		int h = Maze(cr+1,cc,er,ec);
		int v = Maze(cr,cc+1,er,ec);
		
		return h+v;
	}
	
	public static int MazeTop(int cr, int cc , int er , int ec,int [][] strg)
	{
		
		if(cr==er && cc==ec)return 1;
		if(cr>er || cc>ec)return 0;
		
		if(strg[cr][cc]!=0)
		{return strg[cr][cc];}
		int h = MazeTop(cr+1,cc,er,ec,strg);
		int v = MazeTop(cr,cc+1,er,ec,strg);
		
		return strg[cr][cc]=h+v;
	}
	
	public static int MazeBU(int n)
	{
		
		
		int [][] dp = new int[n+1][n+1];
		
		for(int a=0;a<=n;a++)
		{
			dp[a][n]=1;
			dp[n][a]=1;
		}
		
		
		for(int row=n-1;row>=0;row--)
		{
			for(int col=n-1;col>=0;col--)
			{
				dp[row][col] = dp[row+1][col]+dp[row][col+1];
			}
		}
		
		
		return dp[0][0];}
	
	
	public static int MazeBUSE(int n)
	{
		int [] dp = new int[n+1];
		Arrays.fill(dp, 1);
		
		for(int a=1;a<=n;a++)
		{
			for(int i = n-1;i>=0;i--)
			{
				dp[i]+=dp[i+1];
			}
		}
	return dp[0];}
}
