package cb;

import java.util.ArrayList;
import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s ="is2 sentence4 This1 a3";
        
        ArrayList<String> ll = new ArrayList<String>();
        
        int st=0;
        for(int a=0;a<s.length();a++)
        {
        	
        	char cc = s.charAt(a);
        	
        	if(cc==' ')
        	{
        		ll.add(s.substring(st,a));
        		
        		st=a+1;
        	}
        
        }
        ll.add(s.substring(st,s.length()));
        
        
        int count=0;
        while(count!=ll.size())
        {
        	for(int a=1;a<=ll.size();a++)
        	{
        		String s2 = ll.get(a-1);
        		
        		int k = count+1;
        		String s3 =k+"";
        	
      
        		if(s2.substring(s2.length()-1).equals(s3))
        		{
        			
        			System.out.print(s2.substring(0,s2.length()-1)+" ");
        		}
        	}
        	
        
        count++;}
        

	}

}
