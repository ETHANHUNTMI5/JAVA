package stringChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Sanket {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		
		ArrayList<String> list = new ArrayList<String>();
	
		KarrKuch(s, n, 0, 0, list);
ArrayList<Integer > l = new ArrayList<Integer>();
		
int t=1;
		for(String s2 : list)
		{
		   t=1;
			for(int a=0;a<s2.length()-1;a++)
			{if(s2.charAt(a+1)==s2.charAt(a))
			{
				t++;
				}
			else
			{break;}
			}
		l.add(t);}
		
		int max=l.get(0);
		for(int p : l)
		{
			if(p>max)
			{max=p;}
		}
		System.out.println(max);
		for(String sk : list)
		{System.out.println(sk+" ");}
	}
	public static void KarrKuch(String s,int n,int t,int i,ArrayList<String>ll)
{
		if(t==n+1 || i == s.length())
		{
			return;}
		
		
	
		ll.add(s);
	
		KarrKuch(s.substring(0,i)+kar(s, i)+s.substring(i+1), n, t+1,i+1,ll);
		
		
		KarrKuch(s, n, t,i+1,ll);
		
}
	public static char kar(String s, int i)
	{
		if(s.charAt(i)=='a')
		{return 'b';}
		else
		{return 'a';}
		
	}
}
