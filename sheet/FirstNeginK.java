package sheet;

import java.util.LinkedList;

public class FirstNeginK {

	public static void main(String[] args) {
		
		int [] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
	    int n = arr.length;
	    int [] ans = new int[n-k+1];
	    
	    LinkedList<Integer> q = new LinkedList<Integer>();
	    
	    for(int a=0;a<n;a++)
	    {
	    	if(arr[a]<0)
	    	q.addLast(a);
	    }
	    System.out.println(q);
	    
	    for(int a=0;a<n-k+1;a++)
	    {
	    	if(q.isEmpty())
	    	{break;}
	    	if(a>q.peek())
	    	{q.removeFirst();}
	    	
	    	if(q.isEmpty())
	    	{break;}
	    	if(a+k>q.peek())
	    	{
	    		ans[a]=arr[q.peek()]; 
	    	}
	    }
	    for(int i:ans)
	    {
	    	System.out.print(i+" ");
	    }
}
}