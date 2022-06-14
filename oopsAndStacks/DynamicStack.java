 package oopsAndStacks;

import oopsAndStacks.StackUsingArray.StackUsingArrays;

public class DynamicStack extends StackUsingArrays {
	
	public DynamicStack() throws Exception {
	
		this(Default_Capacity);
	}
 
	public DynamicStack(int capacity) throws Exception
	{
		super(capacity);
		
	}

	 @Override
     public void push(int n) throws Exception
     {
		 if(this.size()==this.data.length)
		 {
			 int [] arr = new int[2*this.data.length];
			 
			 for(int a=0;a<this.data.length;a++)
			 {
				 arr[a]=this.data[a];
				 
				
			 }
			 this.data=arr;
			 
		 }
			 super.push(n);
			 
		 
		 
		 
		 
     }
	 
}

