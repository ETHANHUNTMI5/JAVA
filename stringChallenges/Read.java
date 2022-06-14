package stringChallenges;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    String s1= scn.nextLine();
	    CAPITAL(s1);
	    
	}

	public static void CAPITAL(String s1)
	{int b=0;
		for(int a=0;a<s1.length();a++)
		{
			if(s1.charAt(a)>=65 && s1.charAt(a)<=90 )
			{
			
		System.out.println(s1.substring(b,a));
		b=a;}
			
		}
		System.out.println(s1.substring(b,s1.length()));
			}
	
}