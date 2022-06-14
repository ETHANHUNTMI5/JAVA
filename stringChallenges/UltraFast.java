package stringChallenges;

import java.util.Scanner;

public class UltraFast {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int n = scn.nextInt();
		scn.nextLine();
		for(int a=1;a<=n;a++)
		{
			String s1 = scn.nextLine();
			StringBuilder sb1 = new StringBuilder(s1);
			String s2 = scn.nextLine();	
			StringBuilder sb2 = new StringBuilder(s2);
		
			maths(sb1,sb2);
		}
     	
		
		
	}
	
	public static void maths(StringBuilder sb1,StringBuilder sb2)
	{ 
		StringBuilder ans= new StringBuilder();
		
		for(int a=0;a<sb1.length();a++)
		{
			if(sb1.charAt(a)==sb2.charAt(a))
			{ans.append('0');}
			
			else
			{ans.append('1');}
		}
		System.out.println(ans);
	}

}
