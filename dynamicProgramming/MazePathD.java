package dynamicProgramming;

import java.util.Arrays;

public class MazePathD {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(Maze(0, 0, n, n));
		System.out.println(MazeTop(0,0,n,n,new int[n+1][n+1]));
		System.out.println(MazeBU(n));
		System.out.println(MazeBUSE(n));

	}
	public static int Maze(int cr , int cc , int er , int ec)
	{
		if(cr>er || cc>ec)return 0;
		if(cr==er && cc == ec)return 1;
		int h = Maze(cr+1, cc, er, ec);
		int v = Maze(cr, cc+1, er, ec);
		int d = Maze(cr+1, cc+1, er, ec);
		
		return h+v+d;
	}
	
	public static int MazeTop(int cr , int cc , int er , int ec, int [][] strg)
	{
		if(cr>er || cc>ec)return 0;
		if(cr==er && cc == ec)return 1;
		
		if(strg[cr][cc]!=0) return strg[cr][cc];
		int h = MazeTop(cr+1, cc, er, ec,strg);
		int v = MazeTop(cr, cc+1, er, ec,strg);
		int d = MazeTop(cr+1, cc+1, er, ec,strg);
		
		return strg[cr][cc]=h+v+d;
	}
	
	public static int MazeBU(int n)
	{
		int[][] dp = new int[n+1][n+1];
		
		for(int a=0;a<=n;a++)
		{
			dp[a][n]=1;
			dp[n][a]=1;
			
		}
		
		for(int a=n-1;a>=0;a--)
		{
			for(int b = n-1;b>=0;b--)
			{
				dp[a][b] = dp[a+1][b]+dp[a][b+1]+dp[a+1][b+1];
			}
		}
		
	return dp[0][0];}
	
	public static int MazeBUSE(int n)
	{
		int [] dp = new int[n+1];
		Arrays.fill(dp, 1);
		
		for(int x=1;x<=n;x++)
		{
		int prev = dp[n];
		for(int a=n-1;a>=0;a--)
		{
			int temp = dp[a];
			dp[a]+=prev+dp[a+1];
			prev = temp;
		}
		
		
		}
	
	return dp[0];}

}
