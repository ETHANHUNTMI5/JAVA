package challenges_Array;

import java.util.Scanner;

public class MaxArraySum1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		for (int a = 1; a <= t; a++) {
			int n = scn.nextInt();

			long[] arr = new long[n];

			for (int b = 0; b < n; b++) {
				arr[b] = scn.nextLong();
			}
			
			long ans = Max(arr);
			System.out.println(ans);
			
		}
		
	
	}

	public static long Max(long [] arr) {
	
		long maxAns=Long.MIN_VALUE,help=0;
	
		for(int a=0;a<arr.length;a++)
		{
			help=help+arr[a];
			
			if(help<0)
			{help=0;}
			
			if(maxAns<help)
			{maxAns=help;}
			
			
			
		}
		return maxAns;
	}
	
}