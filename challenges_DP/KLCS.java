package challenges_DP;

import java.util.Scanner;

public class KLCS {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int m = scn.nextInt();
	int tk = scn.nextInt();
	
	int [] arr1 = new int[n];
	int [] arr2 = new int[m];
	
	for(int a=0;a<n;a++)
	{arr1[a]= scn.nextInt();}
	
	for(int a=0;a<m;a++)
	{arr2[a]= scn.nextInt();}
	
	System.out.println(KLCSBU(arr1, arr2, tk));
	}

	public static int KLCSBU(int [] arr1 , int[] arr2,int tk)
	{
		int [][][] strg = new int [tk+1][arr1.length+1][arr2.length+1];
		
		for(int k=0;k<=tk;k++)
		{
			for(int row=arr1.length-1;row>=0;row--)
			{
				for(int col=arr2.length-1;col>=0;col--)
				{
					
					if(arr1[row]==arr2[col])
					{
						strg[k][row][col]= 1 + strg[k][row+1][col+1];
					}
					else
					{
						int m = strg[k][row+1][col];
						int n = strg[k][row][col+1];
						int o = 0;
					
						if(k>=1)
						{o=strg[k-1][row+1][col+1]+1;}
						
					strg[k][row][col]=Math.max(m, Math.max(n, o));
					}
					
					
					
				}
				
			}
			
		}
		return strg[tk][0][0];
		
		
		
		
	}
}