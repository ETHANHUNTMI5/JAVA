package String;

import java.util.Scanner;

public class StringQ {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    String s1= scn.nextLine();
	    stringprint(s1);
	}

	public static void stringprint(String str)
	{
		for(int si=0;si<=str.length()-1;si++)
		{for(int ei =si+1;ei<=str.length();ei++)
		{
			System.out.println(str.substring(si,ei));
			
		}
			
		}
			
		
	}
}
