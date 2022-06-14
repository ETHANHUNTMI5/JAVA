package aatCoder;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		char cc = s.charAt(s.length()-1);
		String sa = s.substring(0,s.length()-2);
		
		int n = cc-48;
		
		if(n>=0 && n<=2)
		{System.out.println(sa+"-");}
		else if(n>=3 && n<=6)
		{System.out.println(sa+"");}
		else
		{System.out.println(sa+"+");}
	}

}
