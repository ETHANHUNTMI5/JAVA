package oopsAndStacks.StackUsingArray;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {

		StackUsingArrays stack = new StackUsingArrays(5);

		for(int i=1;i<=5;i++)
		{
			stack.push(10*i);
			stack.display();
		}
		//stack.push(90); Error
		
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
