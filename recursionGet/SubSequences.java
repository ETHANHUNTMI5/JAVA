package recursionGet;

import java.util.ArrayList;

public class SubSequences {

	public static void main(String[] args) {
		
		System.out.println(getss("abcdZONefghi"));
		
		
	}

	public static ArrayList<String> getss(String s)
	{
		if(s.length()==0)
		{	ArrayList<String> base= new ArrayList<>();
		base.add("");
		return base;}
		
		
		char cc = s.charAt(0);
		String s2 = s.substring(1);
	
		ArrayList<String>  result= new ArrayList<>();
		ArrayList<String>  pre = getss(s2);
		
		for(int i=0;i<pre.size();i++)
		{
			result.add(pre.get(i));
			result.add(cc +pre.get(i));
		}
		
		return result;
	}
}
