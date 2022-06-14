package basics;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int dividend= scn.nextInt();
		int a= dividend;
		int divisor= scn.nextInt();
	   int b = divisor;
		int r=0;
		
		while(dividend%divisor!=0)
		{r=dividend%divisor;
		dividend=divisor;
		divisor=r;
	     }
		
		
		System.out.println(divisor);
	
		System.out.println(gcd(a, b));
			
		
		
		
	}
	// Euclidean algorithm
	//T(n)= log(max(a,b))
	public static int gcd(int a , int b)
	{
	 if (b == 0)
	 {   return a;}
	    
	 return gcd(b, a % b);
	}
}
