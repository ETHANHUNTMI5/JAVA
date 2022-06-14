package pepcoding;

import java.util.Scanner;

public class PaintFence {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		if(n==1)
		{
		    System.out.println(k);
		    return;
		}
		int [][] arr = new int[3][n+1];
		
		arr[0][2]=k;
		arr[1][2]=k*(k-1);
		arr[2][2]=arr[0][2]+arr[1][2];
		
		for(int a=3;a<=n;a++)
		{
			arr[0][a]=arr[1][a-1];
			arr[1][a]=arr[2][a-1]*(k-1);
			arr[2][a]=arr[0][a]+arr[1][a];
			
			
		}
		System.out.println(arr[2][n]);
		
	}

}
