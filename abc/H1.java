package abc;

import java.util.HashMap;
import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(char c ='a'; c<='m';c++)
		{
			map1.put(c,1);
		}
	//	System.out.println(map1);
		for(char c ='N'; c<='Z';c++)
		{
			map2.put(c,1);
		}
	//	System.out.println(map2);
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		
		
		for(int w=1;w<=t;w++)
		{
			
			int n = scn.nextInt();
			
			String [] arr = new String[n];
			boolean bt=true;
			int count=0;
			
			for(int a=0;a<n;a++)
			{arr[a]= scn.next();}
			
			
			for(int a=0;a<n;a++)
			{
				
				String s = arr[a];
			    int one =0;
			    int two=0;
			    
			    for(int b=0;b<s.length();b++)
			    {
			    	char cc= s.charAt(b);
			    	
			    	if(map1.containsKey(cc))
			    	{
			    		if(two>=1)
			    		{
			    			bt=false;
			    			break;
			    		}
			    		
			    		one++;
			    	}
			    	
			    	else if(map2.containsKey(cc))
			    	{
			    		if(one>=1)
			    		{
			    			bt=false;
			    			break;
			    		}
			    		
			    		two++;
			    	}
			    	
			    	else
			    	{
			    		bt=false;
			    		break;
			    	}
			    	
			    	
			    }
			 
			   if(bt==false)
			   {
				   System.out.println("NO");
				   break ;
			   }
			   
			   
				 
			
			count++;
			}
			
			if(count==n)
			{System.out.println("YES");}
			
		}
		
	}

}
