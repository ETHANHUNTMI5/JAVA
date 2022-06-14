package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int a=0;a<s.length();a++)
        {
        	char ch = s.charAt(a);
        	
        	if(map.containsKey(ch))
        	{
        		map.put(ch,map.get(ch)+1 );
        		
        	}
        	
        	else
        	{
        		map.put(ch, 1);
        		
        	}
        	
        
        	
        }
        System.out.println(map);
        
        
        Set<Entry<Character, Integer>> entries = map.entrySet();
        
        int max=0;
        char ans = '\0';
        
        for(Entry<Character, Integer> entry:entries)
        {
        	if(max<entry.getValue())
        	{max=entry.getValue();
        	ans = entry.getKey();}
 
        	
        }
		System.out.println(ans + " => " + max);
	}

}
