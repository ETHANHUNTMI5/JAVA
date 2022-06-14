package abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    
		int [] arr= {1,1,2};
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	   
			
		 for(int a=0;a<arr.length;a++)
	        {
	            if(map.containsKey(arr[a]))
	            {continue;}
	            
	            else
	            {map.put(arr[a],1);}
	        }
	        
	     ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
	        
	      int s=0;
	      
	      Collections.sort(keys);
	      while(s!=keys.size())
	      {
	    	  arr[s]=keys.get(s);
	    	  
	     s++; }
	      
	      
	      
	System.out.println(map.size());
	
	for(int i:arr)
	{System.out.print(i+" ");}
	
	}

}
