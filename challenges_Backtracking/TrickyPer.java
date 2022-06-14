package challenges_Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrickyPer {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		
		ArrayList<String> ans = getPe(s);
		ArrayList<String> ansfinal = new ArrayList<>();
		Collections.sort(ans);
   
		ansfinal.add(ans.get(0));
		for(int a=1;a<ans.size();a++)
		{
			if(ans.get(a).equals(ans.get(a-1)))
			{}

			else
			{ansfinal.add(ans.get(a));}
		
		}
		
		for(String s2:ansfinal)
		{
			System.out.println(s2);
			
		}
		
	}

	public static ArrayList<String> getPe(String str) {
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char ch = str.charAt(0);
		String s2 = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> pre = getPe(s2);

		for (int i = 0; i < pre.size(); i++) {
			String s = pre.get(i);

			for (int a = 0; a <= s.length(); a++) {
				myresult.add(s.substring(0, a) + ch + s.substring(a));

			}

		}

		return myresult;
	}

}
