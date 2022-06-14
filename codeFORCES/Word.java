package codeFORCES;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		int n = s1.length();
		
		char cc;
		int up=0;
		int lp=0;
		for(int a=0;a<n;a++)
		{
			cc= s1.charAt(a);
			
			if(cc>=65 && cc<=90 )
			{
				up++;
			}
			else
			{lp++;}
			
		}
	
		int k=0;
		if(lp>=up)
		{
			
			for(int a=0;a<n;a++)
			{
				cc= s1.charAt(a);
				if(cc>=65 && cc<=90)
				{
				  k = cc;
				  k=k+32;
				  cc=(char)k;
				  s1= s1.substring(0,a)+cc+s1.substring(a+1);
					
				}
				
			}
			
		}
		else
		{

			for(int a=0;a<n;a++)
			{
				cc= s1.charAt(a);
				if(cc>=97 && cc<=122)
				{
				  k = cc;
				  k=k-32;
				  cc=(char)k;
				  s1= s1.substring(0,a)+cc+s1.substring(a+1);
					
				}
				
			}
		
		}
		System.out.println(s1);
	}

}
