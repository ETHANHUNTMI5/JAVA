package sheet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveKdigits {

	public static void main(String[] args) {
		
		String s = "10";
		int k =2;
		char [] arr = s.toCharArray();
		Stack<Character> ss = new Stack<>();
		
		
		ss.push(s.charAt(0));
		int b=0;
		for(int a=1;a<s.length();a++)
		{
		//	System.out.println(ss+" "+b+" "+a);
			
           if(!ss.isEmpty() && arr[a]<=ss.peek())
           {
        	   while(!ss.isEmpty() && b<k && arr[a]<=ss.peek())
        	   {
        		   ss.pop();
        		   b++;
        	   }
        	
        	   ss.push(arr[a]);
           }
           
           else
           {
        	   ss.push(arr[a]);
        	   
           }
           

		}

  while(b!=k && !ss.isEmpty())
   {
     ss.pop();
     b++;
   }
   	
       if(ss.isEmpty())
		{System.out.println(0);
		return;}
		
       
      
      ArrayList<Character> ans = new ArrayList<Character>();
    		int l =0;   
    		int i=0;
     while(!ss.isEmpty())
     {
    	 if(ss.peek()!='0')
    	 {i=l;}
    	 ans.add(ss.pop());
    	 
    l++;}
   // System.out.println(ans+" "+i);
		
     
     String fans="";
     
     for(int a=i;a>=0;a--)
     {
    	 fans +=ans.get(a);
     }
     System.out.println(fans);
    
     
	}

}
