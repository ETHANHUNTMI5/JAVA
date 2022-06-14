package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		scn.nextLine();
		
		String s = scn.nextLine();
		if(n<26)
		{System.out.println("NO");}
		
		else
		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int a=0;a<n;a++)
			{
				char cc = s.charAt(a);
				
				if(cc>=97 && cc<=122)
				{cc= (char) (cc-32);
				
			//	s= s.substring(0,a)+cc+s.substring(a+1);
				}
				
				if(!map.containsKey(cc))
				{map.put(cc,1);}
				
				
				
			}
			
		
			if(map.size()==26)
			{System.out.println("YES");}
			else
			{System.out.println("NO");}
				
		}
		
	}

}
