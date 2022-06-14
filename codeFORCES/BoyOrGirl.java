package codeFORCES;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int n = s.length();
		
		char ch;
		int ans=0;
		
		for(int a=0;a<n;a++)
		{
			ch = s.charAt(a);
			if(map.containsKey(ch))
			{map.put(ch,map.get(ch)+1);}
			else
			{
				map.put(ch, 1);
			}
			

		}
			
		
		
	
		if(map.size()%2==0)
		{System.out.println("CHAT WITH HER!");}
		else
		{System.out.println("IGNORE HIM!");}
		
	}

}
