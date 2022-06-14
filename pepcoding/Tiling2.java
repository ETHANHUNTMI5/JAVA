package pepcoding;

import java.util.Scanner;

public class Tiling2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		if(m>n)
		{
			System.out.println(1);
			return;
		}
		
		int [] arr = new int[n+1];
		
		
		for(int a=0;a<=n;a++)
		{
			
			if(a<m)
			{
				arr[a]=1;
			}
			
			else
			{
				
				arr[a]= arr[a-1]+arr[a-m];
				
			}
			
		}
		
		System.out.println(arr[n]);
		
		
	}

}
