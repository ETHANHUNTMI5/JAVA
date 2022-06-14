package oopsAndStacks.StackUsingArray;

public class NextGreaterClient {

	public static void main(String[] args) throws Exception {
		
	  StackUsingArrays stack = new StackUsingArrays();
	 
	    int [] arr = {2,1,3,8,6,7,5};
	    
	    
	    for(int a=0;a<arr.length;a++)
	    {
	    	while(!stack.isEmpty() && arr[a]>stack.top())
	    	{
	    		int rv = stack.pop();
	    		System.out.println(rv + " -> " + arr[a]);
	    		
	    	}
	    	
	    	stack.push(arr[a]);
	    	
	    }
	    
	    while(!stack.isEmpty())
	    {
	    	int rv = stack.pop();
	    	
	    	System.out.println(rv + " -> -1" );
	    }
	    
	  
	 
		

		
	}

}
