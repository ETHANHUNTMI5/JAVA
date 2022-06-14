package aatCoder;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		if(n>=1 && n<=125)
		{System.out.println(4);}
		else if(n>125 && n<=211)
		{System.out.println(6);}
		else
		{System.out.println(8);}
	}

}
