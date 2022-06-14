package sheet;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long k = scn.nextLong();
		
		System.out.println(pow(n,k));
		System.out.println(pow2(n, k));
		
	}
	public static long pow(long n , long k)
	{
		if(k==0)
		{return 1;}
		
		if(k%2!=0)
		{
			long rest = pow(n,k/2);
			return rest*rest*n;
		}
		else
		{
			long rest = pow(n,k/2);
			return rest*rest;
		}
		
	}
	
	// here we are using the power(k ) and writing it in bits form and slowly right shifting it
	// till it becomes 0 and multiplying each 1 bit with increasing power of n;
	public static long pow2(long n, long k)
	{
		long ans=1;
		
		
		while(k!=0)
		{
			if((k&1)==1)
			{
				ans= ans*n;
			}
			
			
			
			n=n*n;
			k=k>>1;
		}
		
	return ans;	
	}

}
