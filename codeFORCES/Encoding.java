package codeFORCES;

import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		String ans="";

		if(n%2==0)
		{
			
			int count=1;
			while(s.length()!=0)
			{
           char cc = s.charAt(0);
				
				if(count%2!=0)
				{
					ans = cc+ans;
					s= s.substring(1);
				}
				else
				{
					ans = ans+cc;
					s= s.substring(1);
				}
				count++;}
			System.out.println(ans);
		
		}
		
		else
		{
			int count=1;
			while(s.length()!=0)
			{
           char cc = s.charAt(0);
				
				if(count%2!=0)
				{
					ans = ans+cc;
					s= s.substring(1);
				}
				else
				{
					ans = cc+ans;
					s= s.substring(1);
				}
				count++;}
			System.out.println(ans);
		}
		
		
	}
}