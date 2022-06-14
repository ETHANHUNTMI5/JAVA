package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int c=0;
		for(int a=1;a<=n;a++)
		{if(n%a==0)
		{c++;}	
		}
		if(c==2)
		{System.out.println("Number Is Prime");}
		else
		{System.out.println("Number Is Not Prime");}
	}

}
