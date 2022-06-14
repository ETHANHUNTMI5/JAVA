package abc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        ArrayList<Long> ll = new ArrayList<Long>();
         
        for(long w=1;w<=t;w++)
        {
        	long n = scn.nextLong();
        	long l = scn.nextLong();
        	long r = scn.nextLong();
        	
            
        	long [] arr = new long[(int) n];
        	
        	for(long a=0;a<n;a++)
        	{
        		ll.add(scn.nextLong());
        	}
        	Collections.sort(ll);
        	
        	for(long a=0;a<n;a++)
        	{
            arr[(int) a]= ll.get((int) a);
        		
        	}
        	
        	long ans=0;
        	for(long p=l;p<=r;p++)
        	{
        		ans+=kar(arr, p);
        	}
        
        	System.out.println(ans);
        }
        
	}
	public static long kar(long [] arr, long x)
	  {
		  
		  HashMap<Long, Long> map = new HashMap<Long, Long>();
		  long ans=0;
		  for(long a=0;a<arr.length;a++)
		  {
			  
			  long t = x-arr[(int) a];
			  if(map.containsKey(t))
			  {
				 	ans = ans+ map.get(t);			  
			  }
			  
			  if(map.containsKey(arr[(int) a]))
			  map.put(arr[(int) a], map.get(arr[(int) a])+1);
			  
			  map.put(arr[(int) a],(long) 1);
		
			  
		  }
		  
		  System.out.println(map);
		  
		  
	 return ans; }
	  
	}
	 