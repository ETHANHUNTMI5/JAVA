package pepcoding;

import java.util.Scanner;

public class PainHouse2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int [][] arr = new int [k][n];
		
		for(int col = 0; col< n;col++)
		{
			for(int row = 0 ; row< k ;row++)
			{
				arr[row][col] = scn.nextInt();
				
			}
			
		}
		
			int [][] colors = new int[k][n];
		
		for(int a=0;a<k;a++)
		{
			colors[a][0] = arr[a][0];
		}
		
		for(int col =1;col<n;col++)
		{
			for(int row=0;row<k;row++)
			{
				int get = min(colors, row, col);
				colors[row][col]= get+arr[row][col];
				
			}
		}
		
		
		
		int ans = min(colors, -1, n);
		System.out.println(ans);
		
	}
	public static int min(int[][] colors , int row , int col)
	{
		
		int tmin = Integer.MAX_VALUE;
		for(int a=0;a<colors.length;a++)
		{
			if(a==row)
			{continue;}
			
			if(colors[a][col-1]<tmin)
			{
				tmin= colors[a][col-1];
			}
			
		}
		
		return tmin;
		
	}

}
