package code;

import java.util.Scanner;

public class Relativity {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			long g = scn.nextLong();
			long c = scn.nextLong();
			
			long ans = (c*c)/(2*g);
			
			System.out.println(ans);
		}
		
	}

}
