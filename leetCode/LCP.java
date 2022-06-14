package leetCode;

import java.util.ArrayList;

public class LCP {

	public static void main(String[] args) {

		String [] arr = {"flower","flow","floght"};
		
		ArrayList<String> ll = new ArrayList<String>();

		for(String s:arr)
		{ll.add(s);}
		
		int min=10000;
		String mins=" ";
		for(String s : ll)
		{
			if(s.length()<min)
			{min = s.length();
			mins = s;}
		}
		
		
		int a=0;
		
		for(a=0;a<min;a++)
		{int count=0;
		
			char cc =mins.charAt(a);
			
			for(String p : ll)
			{
				if(p.charAt(a)==cc)
				{count++;}
			}
			
			if(count!=ll.size())
			{	
				break;
			}			
		
		}
		
		System.out.println(ll.get(0).substring(0,a));
		
		}
		
		
		
	}
