package hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Kar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ans="";
        ArrayList<String> ll = new ArrayList<String>();
        for(int a=0;a<s.length();a++)
        {
        char cc = s.charAt(a);
        
        if(cc>='A' && cc<='Z')
        {ans=ans+cc;
        if(a==s.length()-1 && ans.length()!=0)
    	{ll.add(ans);}}
        
        else if(cc>='a' && cc<='z')
        {ans=ans+cc;
        if(a==s.length()-1 && ans.length()!=0)
    	{ll.add(ans);}}
        
        else
        {
            if(ans.length()!=0)
            {	ll.add(ans);
            ans="";}
          
            
        }
        
        
        }
        System.out.println(ll.size());
        
        for(String x: ll)
        {System.out.println(x);}
      
        short x = Short.MIN_VALUE;
        System.out.println(x);
    }
}

