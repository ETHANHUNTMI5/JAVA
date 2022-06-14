package recursionChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllSubsequences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    scn.nextLine();
	    for(int a=1;a<=t;a++)
	    {

			String s = scn.nextLine();
			
			ArrayList<String> ans = sub(s);
			
			Collections.sort(ans);
			
			for(String s2: ans)
			{System.out.println(s2);}
		
	    	
	    	
	    	
	    }
	    
	    
	}

	public static ArrayList<String> sub(String s)
	{
		if(s.length()==0)
		{ArrayList<String> br = new ArrayList<>();
		br.add("");
		return br;}
		
		String s2 = s.substring(1);
		char ch = s.charAt(0);
		
		ArrayList<String> mr=new ArrayList<>();
		ArrayList<String> rr = sub(s2);
		
		for(int a=0;a<rr.size();a++)
		{
			mr.add(rr.get(a));
			mr.add(ch+rr.get(a));
			
		}
		
	return mr;}
}
