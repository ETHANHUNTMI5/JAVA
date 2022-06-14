package challengesStacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
		
         int [] arr = new int [n];
 
         for(int a=0;a<n;a++)
         {
        	 arr[a]=scn.nextInt();
        	 
        	 
         }
    
         Stack<Integer> ans = new Stack<Integer>();
   	  
	     ans.push(1);
	  
	     
	    int a=1;
	    int b=0;
	    
	    while(a!=arr.length)
	    {
	    	int capture = arr[a];
	    	int count =1;
	    	b=a;
	    	if(capture>=arr[b-1])
	    	{
	    		while(b>=1)
	    		{
	    		if(capture>=arr[b-1])
	    		{	count++;}
	    		else
	    		{break;}
	    		
	    		b--;
	    		}
	    		
	    		
	    	ans.push(count);}
	    	
	    	else
	    	{
	    		count=1;
	    		ans.push(count);
	    	}
	    	
	    a++;}
     
	    Display(ans, 0, n);
	     
	}
	
	public static void Display(Stack<Integer> ans,int idx,int n)
	{
		if(idx==n)
		{
			System.out.print("END");
			return;
		}
		
		
		System.out.print(ans.get(idx)+" ");
		Display(ans, idx+1,n);
		
	}

}
