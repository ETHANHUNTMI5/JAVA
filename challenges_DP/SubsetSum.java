package challenges_DP;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		boolean b = SS(arr, sum, n);
		if(b)
		{System.out.println("Yes");}
		else
		{System.out.println("No");}

	}
	public static Boolean SS(int [] arr,int sum,int n)
	{
		int [][] strg = new int[n][sum+1];
		
		strg[n-1][arr[n-1]]=1;
		
		for(int ro=0;ro<n;ro++)
		{strg[ro][0]=1;}
		
		for(int row=n-2;row>=0;row--)
		{
			
			for(int col=1;col<=sum;col++)
			{
				if(col-arr[row]>=0)
				{
                	if(strg[row+1][col]==1 || strg[row+1][col-arr[row]]==1)
					{strg[row][col]=1;}
					
				}
				
				else
				{
					
					strg[row][col]=strg[row+1][col];
					
				}
				
				
			}
			
		}
		
			if(strg[0][sum]==1)
	{return true;}
	else
	{return false;}
	}

}
