package codeFORCES;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long n = scn.nextLong();
		long m = scn.nextLong();
		long a= scn.nextLong();
		
		long ans =0;
		long l=0;
		long b=0;
		
		if(n%a==0)
		{l=n/a;}
		else
		{l= n/a+1;}
		
		if(m%a==0)
		{b=m/a;}
		else
		{b= m/a+1;}

		ans =l*b;
		System.out.println(ans);
	}

}
