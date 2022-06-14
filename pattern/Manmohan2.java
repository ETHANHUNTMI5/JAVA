package pattern;

import java.util.Scanner;

public class Manmohan2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
	
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{		
			if(row%2!=0) 
			{System.out.print("1");}
			else
			{if(col==1 || col==row) 
			{System.out.print("1");}
			else
			{System.out.print("0");}
				
			}
			
			
		}
			System.out.println();
		}
		
		
	}

}
