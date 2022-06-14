package challengesStacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

import oopsAndStacks.StackUsingArray.BalancedParentheses;

public class BalanacedParentheses {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		Stack<Character> stack= new Stack<>();
		
		boolean b = Tell(str, stack);
		if(b==true)
		{System.out.println("Yes");}

		else
		{System.out.println("No");}
	}
		
		public static boolean Tell(String str, Stack<Character> stack) throws Exception
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
					if(stack.peek()=='(')
					{	stack.pop();}
					
					else
					{	return false;
					}
				}
				
				
				else if(str.charAt(a)==']')
				{
					if(stack.peek()=='[')
					{	stack.pop();}
					
					else
					{
						return false;
					}
				}
				
				
				else if(str.charAt(a)=='}')
				{
					if(stack.peek()=='{')
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
	
	