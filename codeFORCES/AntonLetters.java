package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class AntonLetters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(int a=1;a<s.length();a=a+3)
		{
			char cc = s.charAt(a);
			
			if(cc=='}')
			{break;}
			
			if(map.containsKey(cc))
			{map.put(cc,map.get(cc)+1);}
			else
			{
				map.put(cc,1);
			}
			
			
		}

		System.out.println(map.size());
		
	}

}
