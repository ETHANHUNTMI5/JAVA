package sheet;

import java.util.Scanner;

public class RelativelyPrime {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long l = scn.nextLong();
		long r = scn.nextLong();
		
		for(long a=0;a<(r-l+1)/2;a++)
		{
			long m = l+2*a;
			long n = m+1;
			System.out.println(m+" "+n);
		}
		
	}

}
