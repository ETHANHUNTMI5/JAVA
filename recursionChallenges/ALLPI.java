package recursionChallenges;

import java.util.Scanner;

public class ALLPI {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scn.nextInt();
		scn.nextLine();
		for(int a =1;a<=t;a++)
		{
		String s = scn.nextLine();
        remove(s, 0, "");
		}
		}

	public static void remove(String str,int vi, String ans)
	{
		if(vi==str.length()-1)
		{ans=ans+str.charAt(vi);
			System.out.println(ans);
		return;}
		
		
		if(str.substring(vi,vi+2).equals("pi"))
		{ans=ans+"3.14";
		vi++;
		
			}
	else
	{ans=ans+str.charAt(vi);}
		
    
		remove(str, vi+1, ans);
		 
	
	
	}
	
}
