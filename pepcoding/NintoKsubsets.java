package pepcoding;

import java.util.Scanner;

public class NintoKsubsets {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int [][] arr = new int[k+1][n+1];
		
		for(int col=1;col<=n;col++)
		{
			arr[1][col]=1;
		}
		
		for(int row =2;row<=k;row++)
			{for(int col=1;col<=n;col++)
		{
			if(row>col)
			{
				arr[row][col]=0;
				continue;
			}
			
			else if(row==col)
			{
				arr[row][col]=1;
				continue;
			}
			
			else
		    {arr[row][col]= row*arr[row][col-1]+arr[row-1][col-1];}	
			
		}
		
	}
		
		System.out.print(arr[k][n]);
	}
	
	

}
