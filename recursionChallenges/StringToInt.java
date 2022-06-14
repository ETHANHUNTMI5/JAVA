package recursionChallenges;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
	 
		System.out.println(S2I(s));
	}
	public static int S2I(String s)
	{
		if(s.length()==0)
		{return 0;}
		
		char ch = s.charAt(0);
		String ros=s.substring(1);
		int n =(int)ch-48;
		int m = (int)Math.pow(10, s.length()-1);
		int ans=n*m;
		ans = ans+S2I(ros);
	
	return ans;}

}
