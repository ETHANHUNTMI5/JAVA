package abc;

import java.util.Scanner;

public class H2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int x = scn.nextInt();
			int m = scn.nextInt();
			int d = scn.nextInt();
			
			System.out.println(Math.min(x*m, x+d));
		}
	}

}
