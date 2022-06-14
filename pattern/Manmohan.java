package pattern;

import java.util.Scanner;

public class Manmohan {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		System.out.println("1");
		
		for(int row=1;row<=n-1;row++)
		{
			for(int c=1;c<=1;c++)
		{System.out.print(row);}
				
			for(int c=1;c<=row-1;c++)
			{System.out.print("0");}
			
			for(int c=1;c<=1;c++)
			{System.out.print(row);}
				
					
		
		System.out.println();	
		}
	
	}
}
