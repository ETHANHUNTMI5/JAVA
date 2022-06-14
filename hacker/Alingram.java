package hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Alingram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		
		HashMap<Character, Integer> map1= new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2= new HashMap<Character, Integer>();
		for(int a=0;a<s1.length();a++)
		{
			char cc = s1.charAt(a);
			
			if(cc>='A' && cc<='Z')
			{
				int y=cc;
				y=y+32;
				cc=(char)y;
			}
			
			if(map1.containsKey(cc))
			{map1.put(cc,map1.get(cc)+1);}
			else
			{
				map1.put(cc,1);
			}
		}
		
		for(int a=0;a<s2.length();a++)
		{
			char cc = s2.charAt(a);
			
			if(cc>='A' && cc<='Z')
			{
				int y=cc;
				y=y+32;
				cc=(char)y;
			}
			
			if(map2.containsKey(cc))
			{map2.put(cc,map2.get(cc)+1);}
			else
			{
				map2.put(cc,1);
			}
		}
		
	
		Set<Map.Entry<Character, Integer>> keys = map1.entrySet();
		Set<Map.Entry<Character, Integer>> keys2 = map2.entrySet();
	
		if(keys.equals(keys2))
		{System.out.println("Anagrams");}
		
		else
		{System.out.println("Not Anagrams");}
		
		
	}

}
