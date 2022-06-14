package recursionGet;

import java.util.ArrayList;

import java.util.Collections;

public class GetPermutation {

	public static void main(String[] args) {
		
		System.out.println(getPe("abc"));
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
		System.out.println(pre);
		for(int i=0;i<pre.size();i++)
		{
			String s = pre.get(i);
						
			for(int a =0;a<=s.length();a++)
			{
				myresult.add(s.substring(0,a)+ch+s.substring(a));
			
				
			}
			
		}
		System.out.println(myresult);
		
		return myresult;
	}

}
