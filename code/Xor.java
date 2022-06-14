package code;

import java.util.Scanner;

public class Xor {
public static long CONST=(long)(1000000007);
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
		
		long l = scn.nextLong();
		
		long l2 = l%CONST;
		
		long ne=1;
		for(long a=1;a<=l2-1;a++)
		{
		ne = (ne<<1)%CONST;
		}
		
		System.out.println(ne);
		}
		
	}

}
