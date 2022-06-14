package codeFORCES;

import java.util.Scanner;

public class DIE {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		int g= Math.max(x, y);
		switch (g) {
		case 1:
		{System.out.println("1/1");
			break;}
		case 2:
		{System.out.println("5/6");
			break;}
		case 3:
		{System.out.println("2/3");
			break;}
		case 4:
		{System.out.println("1/2");
			break;}
		case 5:
		{System.out.println("1/3");
			break;}
		case 6:
		{System.out.println("1/6");
			break;}
			

			 
		}
	}

}
