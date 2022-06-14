package recursionChallenges;

import java.util.Scanner;

public class SubSequences {
	
public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int n = scn.nextInt();
		scn.nextLine();
		for(int a =1;a<=n;a++)
		{
			String s = scn.nextLine();
			GetSS(s,"");
		}
	
	}

	public static void GetSS(String ques,String ans)
	{
		if(ques.length()==0)
		{System.out.println(ans);
		return;}
		
		char ch = ques.charAt(0);
		String s2 = ques.substring(1);
		
		GetSS(s2 ,ans);
		GetSS(s2, ans+ch);
		
		
		
	}
	
}
