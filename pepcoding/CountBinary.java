package pepcoding;

import java.util.Scanner;

public class CountBinary {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		int [] zero = new int[n+1];
		int [] one = new int[n+1];
		
		zero[0]=1;
		one[0]=1;
		
		for(int a=1;a<=n;a++)
		{
			
			zero[a]=one[a-1];
			one[a]= zero[a-1]+one[a-1];
		}
		
		for(int i : zero)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i : one)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(one[n]);
	}

}
