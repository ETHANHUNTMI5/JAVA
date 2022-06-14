package challenges_Array;

import java.util.Scanner;

public class MatrixSearch {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int [][] arr = new int[n][m];
        takeinput(arr,n,m);
        int a =scn.nextInt();
        search(n,m,a,arr);
	}

	public static void takeinput(int [][] arr,int n,int m)
	{ 
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<m;col++)
			{arr[row][col]=	scn.nextInt();
			 
				
			}
			System.out.println();
		}
		
		
	}
	
	public static void search(int n,int m,int a,int [][]arr)
	{int ans =0;
	
		for(int row=0;row<n;row++)
	{
		for(int col=0;col<m;col++)
		{
	       if(arr[row][col]==a)
	       {ans =1;}
		}
		 
	}
		
		System.out.println(ans);
	}
	
}
