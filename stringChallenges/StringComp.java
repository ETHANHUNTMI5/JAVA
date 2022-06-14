package stringChallenges;

import java.util.Scanner;

public class StringComp {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		
		StringBuilder sb = new StringBuilder(s1);
		compress(sb);
	}

	public static void compress(StringBuilder sb)
	{
		int c=0,b=0,d=0;
		char ch = sb.charAt(0);
		
		
		for(int a=0;a<sb.length();a++)
		{
			if( ch!=sb.charAt(a))
			{
				c=a-d;
				if(c!=1)
				{System.out.print(ch +"" +c );}
				else
				{System.out.print(ch);}
				ch=sb.charAt(a);
			    b=c;
			    d=a;
			}
			
		}
		int k = sb.length()-d;
		if(k==1)
			System.out.print(ch);
		else
		System.out.print(ch +"" + k);
	   // System.out.println(ch);	
	}
	}

