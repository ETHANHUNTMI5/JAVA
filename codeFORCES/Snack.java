package codeFORCES;

import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]<n-a)
			{System.out.println(" ");}
			else
			{
				
			}
		}
	}

}
