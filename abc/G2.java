package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		ArrayList<String> ll = new ArrayList<String>();
		
		if(s.length()<3)
		{System.out.println(0);}
		
		
		for(long a=0;a<=s.length()-3;a++)
		{
			ll.add(s.substring((int)a,(int)a+3));
		}
		
		long ans=0;
		
		for(long i=0;i<ll.size();i++)
		{long var=0;
			HashMap<Character, Long> map = new HashMap<Character, Long>();
			for(long a=0;a<=2;a++)
			{
				char cc = ll.get((int) i).charAt((int) a);
				
				if(map.containsKey(cc))
				{break;}
				
				else
				{
					map.put(cc,(long) 1);
					var++;
				}
			}
			
			if(var==3)
			{ans++;}
			
		}
	
	System.out.println(ans);
	}
	

}
