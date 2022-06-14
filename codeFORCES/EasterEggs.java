package codeFORCES;

import java.util.Scanner;

public class EasterEggs {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		char [] arr = {'R','O','Y','G','B','I','V'};
		
		
		int rem = n%7;
		int mul = n/7;
		
		if(rem>4)
		{
			
			for(int a=0;a<n;a++)
			{System.out.print(arr[a%7]);}
			
		}
		
		else
		{
			for(int a=0;a<7*mul;a++)
			{
				System.out.print(arr[a%7]);
			}
			
			for(int a=3;a<3+rem;a++)
			{
				System.out.print(arr[a]);
			}
			
		}
		
	}

}
