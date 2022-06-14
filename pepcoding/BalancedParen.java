package pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParen {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		
		Stack<Character> stack = new Stack<Character>();
		boolean b =true;;
		
	z:	for(int a=0;a<s.length();a++)
		{
			char cc= s.charAt(a);
			
			if(cc=='(' ||  cc=='[' || cc=='{')
			{
				stack.push(cc);
			}
			
			if(cc==')' ||  cc==']' || cc=='}')
			{
				if(stack.isEmpty())
				{
					b=false;
					
					break z;
				}
				
				
				if(cc==')')
				{
					if(stack.peek()!='(')
					{
						b=false;
						break z;
					}
					else
					{
						stack.pop();
					}
					
					
				}
				
				else if(cc==']')
				{
					
					if(stack.peek()!='[')
					{
						b=false;
						break z;
					}
					else
					{
						stack.pop();
					}
				}
				
				else
				{
					if(stack.peek()!='{')
					{
						b=false;
						break z;
					}
					else
					{
						stack.pop();
					}
					
				}
				
				
				
				
				
				
			}
			
			
		}
		
		
		if(b && stack.isEmpty())
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
		
	}

}
