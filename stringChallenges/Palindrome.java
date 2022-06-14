package stringChallenges;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scn = new 	Scanner(System.in);
		String s1= scn.nextLine();
		StringBuilder sb = new StringBuilder(s1) ;
		Palin(sb);
		
	}
	
	public static void Palin(StringBuilder s1)
	{boolean b =false;
		StringBuilder sb = new StringBuilder() ;
		if(s1.length()==0 || s1.length()==1 )
		{System.out.println("true");}
		
		else {
			
			for(int a=0;a<s1.length();a++)
			{
				sb.insert(a,s1.charAt(s1.length()-1-a));
				
			}
			if(sb.toString().equals(s1.toString()))
			{System.out.println("true");}
				else	
			{System.out.println("false");}
			
			
		}
		
		
		
	}

}
