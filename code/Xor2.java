package code;

import java.util.Scanner;

public class Xor2 {

	public static long CONST=(long)(1000000007);
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
		
		long n = scn.nextLong();
		
		System.out.println(power(2, n-1, CONST));
		
		
		
	}
	}
	
	public static long power(long x, long y, long p)
	  {
	    long res = 1; 
	    x = x % p; 
	 
	    if (x == 0)
	      return 0;
	    while (y > 0)
	    {
	 
	      
	      if ((y & 1) != 0)
	        res = (res * x) % p;
	 
	      y = y >> 1; 
	      x = (x * x) % p;
	    }
	    return res;
	  }
	
}
	
	