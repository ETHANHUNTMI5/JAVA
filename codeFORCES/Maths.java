package codeFORCES;

import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        if(s.length()==1)
        {System.out.println(s);}
        
        else
        {
        	int c1=0,c2=0,c3=0;
        	for(int a=0;a<s.length();a++)
        	{
        		if(s.charAt(a)=='1')
        		{c1++;}
        		else if(s.charAt(a)=='2')
        		{c2++;}
        		
        		else if(s.charAt(a)=='3')
        		{c3++;}
        		else
        		{}
        	}
        	String ans="";
        	
        		for(int a=0;a<c1;a++)
        	{
        		ans=ans+1+"+";
        	}
        	for(int a=0;a<c2;a++)
        	{ans=ans+2+"+";}
        	for(int a=0;a<c3;a++)
        	{ans=ans+3+"+";}
        	
        	System.out.println(ans.substring(0,s.length()));
        	
        }
		
	}

}
