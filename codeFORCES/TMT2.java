package codeFORCES;

import java.util.Scanner;

public class TMT2 {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
	     int t =scn.nextInt();
	     
	     for(int b=0;b<t;b++)
	     {
		 int n  = scn.nextInt();
		 scn.nextLine();
		 String s = scn.nextLine();
		 boolean bs = TM(s, n);
		 if(bs)
		 {System.out.println("Yes");}
		 else
		 {System.out.println("No");}
	     }
	}
	public static Boolean TM(String s,int n)
	{
		int nm=0;int nt=0;
		
		for(int a=0;a<n;a++)
		{
			if(nt<0)
			{return false;}
			if(s.charAt(a)=='M')
			{nm++;
			nt--;}
			
			else
			{nt++;}
		}
		
		if(nm!=n/3)
		{return false;}
		
		if(nm!=nt)
		{return false;}
		
		
		else
		{
			nt=0;nm=0;
			for(int a=n-1;a>=0;a--)
			{
				if(nt<0)
				{return false;}
				if(s.charAt(a)=='M')
				{nm++;
				nt--;}
				
				else
				{nt++;}
			}
			if(nm!=nt)
			{return false;}
			
		
			return true;
		}
		
		
	}
	
}