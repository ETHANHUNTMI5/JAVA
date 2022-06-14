package pattern;

import java.util.Scanner;

public class DiamondPat {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int a = 1; a <= 2 * n - 1; a++) {
			System.out.print("*");
		}
		System.out.println();
		int row = 1, nst = n - 1, nsp = 1, row1 = 1;

		while (row <= n - 1) {
			for (int a = 1; a <= nst; a++) {
				System.out.print("*");
			}

			for (int a = 1; a <= nsp; a++) {
				System.out.print(" ");
			}

			for (int a = 1; a <= nst; a++) {
				System.out.print("*");
			}

			row++;
			nst--;
			nsp = nsp + 2;
			System.out.println();
		}

		int nst1 = 2, nsp1 = 2*n-5;
		while (row1 <= n - 2) {

			for (int a = 1; a <= nst1; a++) {
				System.out.print("*");
			}

			for (int a = 1; a <= nsp1; a++) {
				System.out.print(" ");
			}

			for (int a = 1; a <= nst1; a++) {
				System.out.print("*");
			}

			nst1++;nsp1=nsp1-2;row1++;
			System.out.println();
		}
		for (int a = 1; a <= 2 * n - 1; a++) {
			System.out.print("*");
		}
		
	}

}
