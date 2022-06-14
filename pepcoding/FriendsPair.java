package pepcoding;

import java.util.Scanner;

public class FriendsPair {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int [] arr = new int[n+1];
		
		
		if(n==0)
		{
			System.out.println(0);
			return;
		}
	   arr[0]=1;
		arr[1]=1;
	
		
		for(int a=2;a<=n;a++)
		{
			
			arr[a]=arr[a-1]+arr[a-2]*(a-1);
		}
		
		System.out.println(arr[n]);
	}

}
