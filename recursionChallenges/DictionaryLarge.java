package recursionChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryLarge {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine(); 
		
	 ArrayList<String > obtain = getPe(str);
	 Collections.sort(obtain,Collections.reverseOrder());
	 
	 ArrayList<String > ans= new ArrayList<>() ;
	 for(int a = 0;a<=obtain.size()-1;a++)
	 {
 		if(obtain.get(a).equals(str))
         {break;}
     ans.add(obtain.get(a));		 
	 }
	
	 Collections.sort(ans);
	 
	 for(String s2 : ans)
	 {System.out.println(s2);}
	 
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
