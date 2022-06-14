package aatCoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class H1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<int[]> ll = new ArrayList<int[]>();
		
		int [][] arr = {{1,1,0,0,0,1},{1,1,0,0,0,0}};
		int n = arr.length;
		int m = arr[0].length;
		boolean [][] chk = new boolean[n][m];
		int x,y,w,z;
		for(int row=0;row<arr.length;row++)
		{
			for(int col =0;col<arr[0].length;col++)
			{
				if(arr[row][col]==1)
				{
					if(chk[row][col]==true)
					{continue;}
					
					x=w=row;
					y=z=col;
					w=maxRow(arr, row, col);
					z=maxCol(arr, row, col);
					
					
					
					kar(chk, x, y, w, z);
					col=z+1;
				
					System.out.println(x+" "+y+" "+w+" "+z);
					int [] ff = {x,y,w,z};
					ll.add(ff);
				
				}
				
			}
			
			
		}
		
		int [][] fans = new int[ll.size()][4];
		
		for(int a=0;a<ll.size();a++)
		{
			fans[a][0]=ll.get(a)[0];
			fans[a][1]=ll.get(a)[1];
			fans[a][2]=ll.get(a)[2];
			fans[a][3]=ll.get(a)[3];
			
		}

		
	}
	public static int maxRow(int[][] arr, int row , int col)
	{
    int ans=row;
		for(int cr=row+1;cr<arr.length;cr++)
		{
			if(arr[cr][col]!=1)
			{break;}
			
			if(arr[cr][col]==1)
			{ans++;}
		}
		
		return ans;
	}

	public static int maxCol(int[][] arr, int row , int col)
	{
    int ans=col;
		for(int cc=col+1;cc<arr[0].length;cc++)
		{
			if(arr[row][cc]!=1)
			{break;}
			
			if(arr[row][cc]==1)
			{ans++;}
			
		}
		
		
		return ans;
	}

	public static void kar(boolean[][] chk, int x,int y, int w, int z)
	{
		for(int r=x;r<=w;r++)
		{
			for(int c=y;c<=z;c++)
			{
				chk[r][c]=true;
			}
		}
		
		
		
		
	}
}

