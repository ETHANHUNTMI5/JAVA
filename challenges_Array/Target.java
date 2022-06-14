package challenges_Array;

import java.util.Scanner;

public class Target {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);

		int tar = scn.nextInt();
		target(arr, tar);
	}

	public static void takeinput(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = scn.nextInt();
		}
	}

	public static void target(int[] arr, int tar) {
		for (int a = 0; a < arr.length; a++) {
			for (int b = a + 1; b < arr.length; b++) {
				if (arr[a] + arr[b] == tar) {
					if (arr[a] < arr[b]) {
						System.out.println(arr[a] + " and " + arr[b]);
					} else {
						System.out.println(arr[b] + " and " + arr[a]);
					}
				}

			}

		}

	}

}
