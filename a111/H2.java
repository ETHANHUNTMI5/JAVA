package a111;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class H2 {
	public static int ans = Integer.MAX_VALUE;
	public static  int ix=0;
	public static int iy=0;
	public static int fx=0;
	public static int fy=0;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int ax= scn.nextInt();
		int ay = scn.nextInt();
		
		int bx = scn.nextInt();
		int by = scn.nextInt();
		
		ix=  ax-1;
		iy = ay-1;
		fx = bx-1;
		fy = by-1;
		char [][] arr = new char[n][n];
		scn.nextLine();
		for(int a=0;a<n;a++)
		{
			String s = scn.nextLine();
			for(int b=0;b<s.length();b++)
			{
				arr[a][b] = s.charAt(b);
				
			}
		}
		
		
		if(ans!=Integer.MAX_VALUE)
		System.out.println(ans);
		else
		{System.out.println("-1");}
	}
	
	public static void kar(char[][]arr,boolean[][] vis, int moves, int row, int col, int n,int pd,int d)
	{
		
		if(row<0 || row>=n || col<0 || col>=n || vis[row][col] || arr[row][col]=='#')
		{return;}
		
		if(row==fx && col==fy)
		{ans = Math.min(ans,moves);
		
		return;}
		
		vis[row][col]=true;
		
		
		kar(arr, vis, pd==d?moves:moves+1, row+1, col+1, n, 1,d);
		kar(arr, vis, pd==d?moves:moves+1, row+1, col-1, n, 2,d);
		kar(arr, vis, pd==d?moves:moves+1, row-1, col-1, n, 3,d);
		kar(arr, vis, pd==d?moves:moves+1, row-1, col+1, n, 4,d);
		
		
		vis[row][col]=false;
	}
}