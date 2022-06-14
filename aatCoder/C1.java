package aatCoder;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt();
		int b = scn.nextInt();
		
		if(6*a>=b && b>=a)
		{
			System.out.println("Yes");
		}
	  
		else
		{
			System.out.println("No");
		}
	}
	

}
