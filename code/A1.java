package code;

import java.util.HashMap;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
      
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int a=1;a<=t;a++)
        {
        	int count=0;
        	int n= scn.nextInt();
        	scn.nextLine();
        	String s = scn.nextLine();
        	
        	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        	
        	for(int b=0;b<s.length();b++)
        	{
        		char cc = s.charAt(b);
        		
        		if(map.containsKey(cc))
        		{
        			if(s.charAt(b)==s.charAt(b-1))
        			{
        				map.put(cc,map.get(cc)+1);
        			}
        			else
        			{
        				System.out.println("NO");
        				count++;
        				break;
        			}
        		}
        		else
        		{
        			map.put(cc,1);
        		}
        		
        }
        	if(count==0)
        	System.out.println("YES");
        }
	}

}
