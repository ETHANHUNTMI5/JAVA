package pepcoding;

import java.util.Scanner;

public class Stock3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int fee = scn.nextInt();
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		int [] b = new int[n];
		int [] s = new int[n];
		
		b[0]=-arr[0];
		s[0]=0;
	
	for(int a=1;a<n;a++)
	{
		b[a]= Math.max(b[a-1], s[a-1]-arr[a]);
		s[a]= Math.max(s[a-1], arr[a]+b[a-1]-fee);
		
	}
	for(int i : b)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	
	for(int i : s)
	{
		System.out.print(i+" ");
	}
		
	}

}
