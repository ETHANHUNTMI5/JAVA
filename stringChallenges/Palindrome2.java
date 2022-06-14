package stringChallenges;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(isPal(s, 0));
        
		 
	}
	public static boolean isPal(String s,int i)
	{
		if(s.length()==0 || s.length()==1 || i>s.length()/2)
		{return true;}
		
		if(s.charAt(i)==s.charAt(s.length()-1-i))
		{
			return isPal(s,i+1);
		}
		
		return false;
	}

}
