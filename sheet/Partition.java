package sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;import oopsAndStacks.Inheritance.C;

public class Partition {

	public static void main(String[] args) {
		
		String s = "eccbbbbdec";
		int n = s.length();
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(int a =0;a<n;a++)
		{
			char cc = s.charAt(a);
			
		
			if(count.containsKey(cc))
			{count.put(cc,count.get(cc)+1);}
			else
			{count.put(cc,1);}
			
		}
	
		HashMap<Character, Integer> help = new HashMap<Character, Integer>();
		int fans=-1;
		for(int a=0;a<n;a++)
		{
			char cc = s.charAt(a);
			
			if(!help.containsKey(cc))
			help.put(cc,count.get(cc)-1);
			
			else
			{help.put(cc,help.get(cc)-1);}
			
			boolean b = bta(help);
			
			if(b)
			{System.out.println(a-fans);
			fans=a;}
			
		}
	
	}
	public static boolean bta(HashMap<Character, Integer> map)
	{
		for(Map.Entry<Character, Integer> keys : map.entrySet())
		{
			if(keys.getValue()!=0)
			{return false;}
		}
	
		return true;
	}

}
