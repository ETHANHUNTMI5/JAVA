package hacker;

import java.util.Scanner;

public class TwoStr {

	public static void main(String[] args) {
          
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		System.out.println(s1.length()+s2.length());
		
		int x = s1.compareTo(s2);
		if(x>0)
		{System.out.println("YES");}
		else
		{System.out.println("No");}
		
		char cc1 = s1.charAt(0);
	    cc1= (char) (cc1-32);
	    
	    char cc2 = s2.charAt(0);
	    cc2= (char) (cc2-32);
	    
	    System.out.println(cc1 + s1.substring(1)+" "+cc2+s2.substring(1));
	}

}
