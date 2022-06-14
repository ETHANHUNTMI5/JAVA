package codeFORCES;

import java.util.Scanner;

public class Nlcs {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1==l2)
		{
			if(s1.equals(s2))
			{System.out.println("-1");}
			else
			{System.out.println(l1);}
		}
		else
		{
			System.out.println(Math.max(l1, l2));
		}
	}
}