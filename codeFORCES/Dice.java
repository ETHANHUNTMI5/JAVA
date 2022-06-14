package codeFORCES;

import java.util.Arrays;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];

		 for(int a=0;a<n;a++)
		 {arr[a]= scn.nextInt();}
		 
		 Arrays.sort(arr);
		 
		 for(int i :arr)
		 {System.out.print(i+" ");}
		 
	}

}
