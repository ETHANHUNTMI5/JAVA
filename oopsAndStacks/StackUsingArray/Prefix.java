package oopsAndStacks.StackUsingArray;

import java.util.HashMap;
import java.util.Stack;

public class Prefix {

	public static void main(String[] args) {
		String s2 = "K+L-M*N+(O^P)*W/U/V*T+Q";
		//reverse the statement
		StringBuilder sb = new StringBuilder(s2);
		
		String s="";
		
		s=sb.reverse().toString();
		
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		String ans="";
		map.put('(', 0);
		map.put(')', 0);
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
				
					
				if(val2==valc && (val2==2 || val2==3 || val2==0))
				{
					
					break;
				}
					
				if(valc==1)
				{
					a++;break;
				}
				char get= stack.pop();
				if(map.get(get)!=0)
				ans=ans+get;
				
				if(!stack.isEmpty())
				{p=stack.peek();
				
				val2=map.get(p);}
					}
				
				stack.push(cc);
								}
			
			
			if(stack.size()>0 && stack.peek()=='(')
			{
				stack.pop();
				char c= stack.pop();
				
				while(c!=')')
				{
					ans+=c;
				if(stack.size()>0)
					c=stack.pop();
				else
				{break;}
				}
				
				
			}
			
			
		a++;
		
				
	System.out.println(stack);	}
		
		while(!stack.isEmpty())
		{
			ans=ans+ stack.pop();
		}
		
		
		
		sb = new StringBuilder(ans);
        
		ans = sb.reverse().toString();
		System.out.println(ans);
	}
	
// if precedence is same and associativity is right to left pop until you get something with lower precedence
// if precedence is same and associativity is left to right simply add it on the stack
 	
// associativity-- ('+' and '-' --> left to right )
// associativity-- ('*' and '/' --> left to right )
// associativity-- ('^' --> right to left )	

}
