package abc;

import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows=scn.nextInt();
		int cols= scn.nextInt();
		
		
		scn.nextLine();
		char [][] arr = new char[rows][cols];
		
		for(int a=0;a<rows;a++)
		{
			String s = scn.nextLine();
			
			for(int b=0;b<s.length();b++)
			{
				arr[a][b]=s.charAt(b);
			}
			
		}
		
		
		int [][] dp = new int[rows][cols];
		
		for(int a=0;a<rows;a++)
		{
			for(int b=0;b<cols;b++)
			{
			 
				if((a+b)%2==0)
				{
					dp[a][b]=Math.max(dp[a][b+1]+arr[a][b+1],dp[a+1][b]+arr[a][b+1]);
				}
				
				else
				{
					dp[a][b]=Math.min(dp[a][b+1]-arr[a][b+1],dp[a+1][b]-arr[a][b+1]);
				}
		}
		}
		
	System.out.println(dp[0][0]);		
		
		
		
		
		
//		for(int a=0;a<rows;a++)
//		{
//			
//			for(int b=0;b<cols;b++)
//			{System.out.print(arr[a][b]+" ");}
//		
//	System.out.println();}
//	
}
	
}

