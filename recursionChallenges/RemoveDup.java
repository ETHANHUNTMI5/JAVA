package recursionChallenges;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		remove(s, "");
	}
	public static void remove(String q,String ans)
	{
		char ch1=' ';
		char ch2=' ';
		
		if(q.length()==0)
		{System.out.println(ans);
		return;}
		
		
		if(ans.length()==0)
		{ch1 = q.charAt(0);
		 }
		
		else
		{
			ch1 = q.charAt(0);
			ch2= ans.charAt(ans.length()-1);
		}
		String ros=q.substring(1);
		
		if(ch2!=ch1)
		{ans=ans+ch1;}
		
		remove(ros, ans);
		
	}

}
