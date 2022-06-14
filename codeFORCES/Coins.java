package codeFORCES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		
	HashMap<Character, Integer> gre = new HashMap<Character, Integer>();
	HashMap<Character, Integer> les = new HashMap<Character, Integer>();
		
		for(int a=1;a<=3;a++)
		{
			String s = scn.nextLine();
			if(s.charAt(1)=='>')
			{
				if(gre.containsKey(s.charAt(0)))
				{
					gre.put(s.charAt(0),gre.get(s.charAt(0))+1);
				}
				
				else
				{gre.put(s.charAt(0),1);}

				if(les.containsKey(s.charAt(2)))
				{
					les.put(s.charAt(2),les.get(s.charAt(2))+1);
				}
				
				else
				{les.put(s.charAt(2),1);
				}
				}

                 				
			else
			{
				if(gre.containsKey(s.charAt(2)))
				{
					gre.put(s.charAt(2),gre.get(s.charAt(2))+1);
				}
				
				else
				{gre.put(s.charAt(2),1);}

				if(les.containsKey(s.charAt(0)))
				{
					les.put(s.charAt(0),les.get(s.charAt(0))+1);
				}
				
				else
				{les.put(s.charAt(0),1);}
	}
		
		}
			String ans="";
		if(les.size()!=2 || gre.size()!=2)
		{System.out.println("Impossible");}
		
		else
		{
			ArrayList<Map.Entry<Character, Integer>> ll = new ArrayList<Map.Entry<Character, Integer>>(les.entrySet());
			char mid=' ';
			for(Map.Entry<Character, Integer> key : ll)
			{
				if(key.getValue()==2)
				{ans = ans+key.getKey();}
				else
					mid = key.getKey();
			}
			
			ans= ans+mid;
			ArrayList<Map.Entry<Character, Integer>> gg = new ArrayList<Map.Entry<Character, Integer>>(gre.entrySet());

			for(Map.Entry<Character, Integer> key : gg)
			{
				if(key.getValue()==2)
				{ans = ans+key.getKey();}
			}
			
			System.out.println(ans);
		
		}
		
	
	}
}
