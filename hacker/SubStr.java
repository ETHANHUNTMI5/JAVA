package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int n = scn.nextInt();
		
		ArrayList<String> ll = new ArrayList<String>();
		
	
		
		for(int a=0;a<=s.length()-n;a++)
		{ll.add(s.substring(a,a+n));}
		Collections.sort(ll);
		System.out.println(ll.get(0));
	    System.out.println(ll.get(ll.size()-1));
	    
	}

}
