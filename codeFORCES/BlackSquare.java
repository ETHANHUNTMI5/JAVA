package codeFORCES;

import java.util.Scanner;

public class BlackSquare {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int [] arr = new int[4];
		for(int a=0;a<4;a++)
		{arr[a]=scn.nextInt();}
		
		scn.nextLine();
		String s  = scn.nextLine();
		int n = s.length();
		int sum=0;
		
		for(int a=0;a<n;a++)
		{
			int x = s.charAt(a)-'0';
			
			sum=sum+arr[x-1];
		}
		
		System.out.println(sum);
	}

}
