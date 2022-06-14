package sheet;

import java.util.Arrays;
import java.util.Scanner;

public class Knight_Tour {

	public static void main(String[] args) {
		
		int n = 8;
		
		int [][] arr = new int[n][n];
		
		for(int a=0;a<n;a++)
		{
			Arrays.fill(arr[a],-1);
		}
		
		arr[0][0]=0;
		if(kar(arr, n, 0, 0, 1))
		{
			display(arr, n);
		}
		

	}
	
	public static int [][] dirs = {{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
	public static boolean kar(int [][] arr, int n,int row, int col,int i)
	{
		
		if (i == n*n)
            return true;
		
		
		for(int a=0;a<8;a++)
		{
			int new_row = row+dirs[a][0];
			int new_col = col+arr[a][0];
			
			if (isSafe(new_row, new_col, arr,n)) {
                arr[new_row][new_col] = i;
                if (kar(arr,n,new_row, new_col, i + 1))
                    return true;
                else
                    arr[new_row][new_col]
                        = -1;
            }
			
			
			
			
		}
		
		
	return false;}
	public static void display(int [][]arr,int n)
	{
		for(int a=0;a<n;a++)
		{
			for(int b=0;b<n;b++)
			{
				System.out.print(arr[a][b]+"  ");
			}
			System.out.println();
		}
	}
	
	public static int cnt(int [][]arr,int n)
	{
		int val=0;
		for(int a=0;a<n;a++)
		{
			for(int b=0;b<n;b++)
			{
				if(arr[a][b]!=-1)val++;
			}
			
		}
	return val;}
	static boolean isSafe(int x, int y, int sol[][],int N)
    {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == -1);
    }
}
