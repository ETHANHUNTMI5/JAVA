package recursionChallenges;

import java.util.Scanner;

public class AllxATEnd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		ALLX(s, "","");
		
	}

	public static void ALLX(String q,String ans,String ans2)
	{ 
		
		if(q.length()==0)
		{System.out.println(ans+ans2);
	
		return;}
		char ch = q.charAt(0);
		String ros=q.substring(1);
		
		if(ch=='x')
		{
		ans2=ans2+ch;
			ALLX(ros, ans,ans2);
			
		}
		else
		{
			
			ans=ans+ch;
			ALLX(ros, ans,ans2);		
			
		}
			
			
			
		}
		}





