package pepcoding;

import java.util.Scanner;

public class MaxSumNonAdj {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int [] inc = new int[n];
		int [] exc = new int[n];
		
		inc[0]=arr[0];
		
		for(int a=1;a<n;a++)
		{
			inc[a]=exc[a-1]+arr[a];
			exc[a]= Math.max(inc[a-1], exc[a-1]);
			
		}
		
//		for(int i :inc)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		for(int j : exc)
//		{
//			System.out.print(j+" ");
//		}
	
		int ans = Math.max(inc[n-1], exc[n-1]);
	
		System.out.println(ans);
	}

}
