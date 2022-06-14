package basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int a=0,b=1,d=0;
		
		for(int c=0;c<=n;c++)
		{System.out.print(a + " ");
		d=a+b;
		a=b;
		b=d;
		}
	}

}
