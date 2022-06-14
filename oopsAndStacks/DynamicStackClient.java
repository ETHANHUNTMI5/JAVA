package oopsAndStacks;

import oopsAndStacks.StackUsingArray.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new DynamicStack(5);

		for(int i=1;i<=5;i++)
		{
			stack.push(10*i);
			stack.display();
			
		}
		
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		
		System.out.println(stack.top());
		
		while(!stack.isEmpty())
		{
			stack.display();
			stack.pop();
		}
		
		//      stack.pop();  Error
	}
// time complexity of all except display is O(1). display---O(n)
}
