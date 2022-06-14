package stringChallenges;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		
		StringBuilder sb = new StringBuilder(s1);
		ans(sb);
	}

	public static void ans(StringBuilder sb)
	{
		
		for(int a=1;a<sb.length();a++)
		{
	
			char ch2 = sb.charAt(a);
			char ch1 = sb.charAt(a-1);
			int k =ch2-ch1;
		
			System.out.print(sb.charAt(a-1) +"" +k);
		}
		System.out.println(sb.charAt(sb.length()-1));
		
	}
	
}
