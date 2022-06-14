package oopsAndStacks.StackUsingArray;

import java.util.HashMap;
import java.util.Stack;

public class PreAndPost {

	public static void main(String[] args) {
		
		String s = "(a*b/c-d)^e-f+g/f";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		String ans="";
		map.put('(', 4);
		map.put(')', 4);
		map.put('^', 1);
		map.put('/', 2);
		map.put('*', 2);
		map.put('+', 3);
		map.put('-', 3);
		
		int a=0;
		Stack<Character> stack = new Stack<Character>();
		
		while(a!=s.length())
		{
			char cc = s.charAt(a);

			
			if(!map.containsKey(cc))
			{ans= ans+cc;
			a++;	
			continue;
				}
			
			
			
			if(stack.isEmpty())
			{stack.push(cc);}
			
			else
			{
				char p = stack.peek();
				int valc=map.get(cc);
				int val2= map.get(p);

				while( !stack.isEmpty() && val2<=valc)
				{
				
			    if(valc==4)
			    {break;}
					
			   
				if(val2==valc && (val2==1 || val2==0))
				{
					
					break;
				}
					
				char get= stack.pop();
				if(map.get(get)!=4)
				ans=ans+get;
				
				if(!stack.isEmpty())
				{p=stack.peek();
				
				val2=map.get(p);}
					}
				
				stack.push(cc);
								}
			
			
			if(stack.size()>0 && stack.peek()==')')
			{
				stack.pop();
				char c= stack.pop();
				System.out.println(c);
				while(c!='(')
				{
					ans+=c;
				if(stack.size()>0)
					c=stack.pop();
				else
				{break;}
				}
				
				
			}
			
			
		a++;
		
				
		System.out.println(stack);}
		
		while(!stack.isEmpty())
		{
			char p = stack.pop();
			
			if(map.get(p)!=4)
			{
				ans+=p;
			}
		}
		
		
		
		System.out.println(ans);
	}
	
// if precedence is same and associativity is left to right pop until you get something with lower precedence
// if precedence is same and associativity is right to left simply add it on the stack
 	
// associativity-- ('+' and '-' --> left to right )
// associativity-- ('*' and '/' --> left to right )
// associativity-- ('^' --> right to left )	

}
