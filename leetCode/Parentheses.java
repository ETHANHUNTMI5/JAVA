package leetCode;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		
		String s = "(]";
		Stack<Character>ss = new Stack<Character>();
		System.out.println(ans(ss, s));
	}

	public static boolean ans(Stack<Character> stack,String str)
	{
		for(int a=0;a<str.length();a++)
		{
			if(str.charAt(a)=='(' || str.charAt(a)=='[' ||str.charAt(a)=='{')
			{
				stack.push(str.charAt(a));
			}
			
			else if(str.charAt(a)==')' || str.charAt(a)==']' ||str.charAt(a)=='}')
			{
				if(stack.isEmpty())
				{return false;}
				
				if(str.charAt(a)==')')
				{
					if(stack.peek()=='(')
					{
						stack.pop();		
					}
				 
					else
					{return false;}
				}
				
				else if(str.charAt(a)==']')
				{
					if(stack.peek()=='[')
					{
						stack.pop();		
					}
				 
					else
					{return false;}
				}
				
				else if(str.charAt(a)=='}')
				{
					if(stack.peek()=='{')
					{
						stack.pop();		
					}
				 
					else
					{return false;}
				}
			}
		}
				
				if(stack.isEmpty())
				{return true;}
				else
				{return false;}
				
	}
}
