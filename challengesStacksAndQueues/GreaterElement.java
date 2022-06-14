package challengesStacksAndQueues;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GreaterElement {

	public static void main(String[] args) {

		 Scanner scn = new 	Scanner(System.in);
		 int n = scn.nextInt();
		Stack<Integer> queue=new Stack<Integer>();
		
		
		for(int a=1;a<=n;a++)
		{
			queue.add(scn.nextInt());
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

	      for(int a=0;a<n;a++)
	      {boolean tell =true;
	    	  int t = queue.get(a);
	    	  int b = (a+1)%n;
	    	  
	    	  while(b!=a)
	    	  {
	    		  if(queue.get(b)>t)
	    		  { 
	    			   tell = false;
	    		  
	    			  arr.add(queue.get(b));
	    			  break;
	    		  }
	    		  
	    		  
	    	  b=(b+1)%n;}
	    	  
	    	 if(tell == true)
	    	 {arr.add(-1);}
	      }
	
	      for(int i:arr)
	      {System.out.print(i +" ");}
	}
	
}