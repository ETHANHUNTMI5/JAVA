package pepcoding;

import java.util.Scanner;

public class Tiling {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		
		
		int [] arr = new int[n+1];
		
		arr[1]=1;
		arr[2]=2;
		
		for(int a=3;a<=n;a++)
		{
			arr[a]= arr[a-1]+arr[a-2];
			
		}
	
		System.out.println(arr[n]);
	}

}
