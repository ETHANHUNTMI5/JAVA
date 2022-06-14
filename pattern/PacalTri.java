package pattern;

import java.util.Scanner;

public class PacalTri {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int row=0;row<=n-1;row++)
		{for(int col=0;col<=row;col++)
		{ int ans=ncr(row,col);
			System.out.print(ans +"	");
		}
			
		System.out.println();}
	}
	
	public static int factorial(int a)
	{
		int fact=1;
		for(int b=1;b<=a && a!=0;b++)
		{fact=fact*b;
		
		if (a==0)
			{fact=1;}}
		
	return fact;}
	
	public static int ncr(int row,int col)
	{ int ans = factorial(row)/(factorial(col)*factorial(row-col));
		
		
	return ans;}
	

}
