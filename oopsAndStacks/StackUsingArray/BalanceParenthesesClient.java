package oopsAndStacks.StackUsingArray;

public class BalanceParenthesesClient {

	public static void main(String[] args) throws Exception{
     
		BalancedParentheses stack = new BalancedParentheses();
		
		String str = "{[]+[]+[]+([{}])}";
		
		System.out.println(Tell(str, stack));
		
		

	}
	
	public static boolean Tell(String str,BalancedParentheses stack) throws Exception
	{
		for(int a=0;a<str.length();a++)
		{
		if(str.charAt(a)=='(' || str.charAt(a)=='{' || str.charAt(a)=='[' )  //1
			{
				stack.push(str.charAt(a));
			}
			
	
		
		else if(str.charAt(a)==')' || str.charAt(a)=='}' || str.charAt(a)==']' )  //2
			{
				if(stack.isEmpty())
				{
					return false;}
			
				
				if(str.charAt(a)==')')
			{
				if(stack.top()=='(')
				{	stack.pop();}
				
				else
				{	return false;
				}
			}
			
			
			else if(str.charAt(a)==']')
			{
				if(stack.top()=='[')
				{	stack.pop();}
				
				else
				{
					return false;
				}
			}
			
			
			else if(str.charAt(a)=='}')
			{
				if(stack.top()=='{')
				{	stack.pop();}
				
				else
				{
					return false;
				}
			
			}
			
			
			
			}
			
			else           //3
			{}
		}
		
		
		
		if(stack.isEmpty())
		{return true;}
	 
		
		else
		{
			return false;}
		
	}

}
