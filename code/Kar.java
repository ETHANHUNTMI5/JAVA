package code;

import java.util.Scanner;

public class Kar {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=0;w<t;w++)
		{
			int n = scn.nextInt();
			
			
			long sum=0;
			
			
			
			for(int b=1;b<=2*n;b++)
			{
				sum= sum+GCD(n+b*b, n+(b+1)*(b+1));
			}
			
			
			
			 System.out.println(sum);
		}
		
		
	}

	public static long GCD(long a,long b)
	{
		 
		      if (b == 0)
		        return a;
		      
		      return GCD(b, a % b);
	
	}		
		
	
}
