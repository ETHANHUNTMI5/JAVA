package recursionChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionarySmall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine(); 
		
	 ArrayList<String > obtain = getPe(str);
	 Collections.sort(obtain);
	 
	 
	 for(String s : obtain)
	 {
		 if(s.equals(str))
		 {break;}
		 
		 System.out.println(s);
	 }
 	
	
	
	}		
		public static  ArrayList<String> getPe(String str)
		{
			if(str.length()==0)
			{ArrayList<String> base	= new ArrayList<>();
			base.add("");
			return base;
			}
			
			char ch = str.charAt(0);
			String s2 = str.substring(1);
			
			ArrayList<String> myresult	= new ArrayList<>();
			ArrayList<String> pre	= getPe(s2);
			
			for(int i=0;i<pre.size();i++)
			{
				String s = pre.get(i);
							
				for(int a =0;a<=s.length();a++)
				{
					myresult.add(s.substring(0,a)+ch+s.substring(a));
				
					
				}
				
			}
			
			return myresult;
		}

	}
