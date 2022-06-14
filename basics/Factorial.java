package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int fact=1;
		for(int b=1;b<=n;b++)
		{fact=fact*b;}
		System.out.println(fact);
	}

}
