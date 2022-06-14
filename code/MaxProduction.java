package code;

import java.util.Scanner;

public class MaxProduction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int d = scn.nextInt();
			int x = scn.nextInt();
			int y = scn.nextInt();
			int z = scn.nextInt();
			
			
			System.out.println(Math.max(x*7, y*d + (7-d)*z ));
		
		}
		
	}

}
