package queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeat {

	public static void main(String[] args) {

		   Scanner scn = new Scanner(System.in);
           char ch= scn.next().charAt(0);
           
           Queue<Character> q= new LinkedList<Character>();
           HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            
           
           while(ch!='.')
           {
        	   q.add(ch);
        	   
        	   if(map.containsKey(ch))
        	   {
        		   int ov = map.get(ch);
        		   ov=ov+1;
        		   map.put(ch, ov);
        	   }
        	   
        	   else
        	   {
        		   map.put(ch, 1);
        		   
        	   }
        	
           
           
           while(!q.isEmpty())
           {
        	   char fc = q.peek();
        	   
        	   if(map.get(fc)==1)
        	   {System.out.println(fc);
        	   break;}
        	   
        	   else
        	   {
        		   q.poll();
        	   }
           }
           
           if(q.isEmpty())
           {System.out.println("-1");}
           
           
           ch = scn.next().charAt(0);
           }
	}

}
