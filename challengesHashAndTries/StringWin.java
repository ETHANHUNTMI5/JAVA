package challengesHashAndTries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringWin {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s1 =scn.nextLine();
		String s2 = scn.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int si=0,end=0;
		for(int a=0;a<s2.length();a++)
		{
		char ch= s2.charAt(a);
		
		if(map.containsKey(ch))
		{
			map.put(ch,map.get(ch)+1);
		}
		else
		{map.put(ch,1);}
		
		}
		System.out.println(map);
		int count=0;
		
		for(int a=0;a<s1.length();a++)
		{
			char ch2 = s1.charAt(a);
			
		if(count==s2.length())
		{end=a-1;
		break;}
			
			if(map.containsKey(ch2) && map.get(ch2)>0)
			{
				
					count++;
					
					map.put(ch2,map.get(ch2)-1);
					if(count==1)
						si=a;}
			
		}
		
		System.out.println(s1.substring(si,end+1));
		
	}

}
