package hacker;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		boolean b =Pa(s, 0, s.length()-1);
		if(b)
		{System.out.println("Yes");}
		else
		{System.out.println("No");}
		

	}

	public static boolean Pa(String s,int si,int ei)
	{
		if(s.length()==0 || s.length()==1 || si>=ei)
		{return true;}
		
		
		if(s.charAt(si)!=s.charAt(ei))
		{
			return false;
			
		}
		
		return Pa(s, si+1, ei-1);
		
		
	}
}
