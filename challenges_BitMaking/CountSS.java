package challenges_BitMaking;

import java.util.ArrayList;
import java.util.Collections;

public class CountSS {

	public static void main(String[] args) {
		
	ArrayList< String> ans =ss("abcdefgf");
	Collections.sort(ans);
		
	ArrayList< String> ans2 = new ArrayList<String>();
	
	String x = ans.get(0);
	ans2.add(x);
	for(int a=1;a<ans.size();a++)
	{
		if(!ans.get(a).equals(x))
		{
			ans2.add(ans.get(a));
			x= ans.get(a);
		}
		
	}
	System.out.println(ans2.size());
		
	}

	public static ArrayList<String> ss(String s)
	{
		
		if(s.length()==0)
		{
			ArrayList<String> bc = new ArrayList<String>();
			bc.add("");
			return bc;
		}
		String ros =s.substring(1);
		char cc = s.charAt(0);
		
		ArrayList<String> mr = new ArrayList<String>();
		
		ArrayList<String> rr = ss(ros);
		
		for(int a=0;a<rr.size();a++)
		{
			mr.add(rr.get(a));
			mr.add(rr.get(a)+cc);
		}
		
	return mr;}
	
}
