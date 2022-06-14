package oopsAndStacks.StackUsingArray;

public class ReverseStackClient {

	public static void main(String[] args) throws Exception{
 
		StackUsingArrays stack = new StackUsingArrays(5);
        StackUsingArrays helper = new StackUsingArrays(5);
        
        for(int i=1;i<=5;i++)
        {
        	stack.push(10*i);
        }
        
        stack.display();
        Reverse(stack, helper, 0);
        
        stack.display();
		helper.display();
		
	}
	public static void Reverse(StackUsingArrays stack,StackUsingArrays helper,int vi) throws Exception
	{
		if(stack.isEmpty())
		{return;}
		
		int item = stack.pop();
		Reverse(stack, helper, vi+1);
	
		helper.push(item);
		
		
		if(vi==0)
		{
			while(!helper.isEmpty())
		{stack.push(helper.pop());
		}
		}
		
	}

}
