package pepcoding;

import java.util.Stack;

public class InfixEval {

	public static void main(String[] args) {
		
		String s = "2 + 6 * 4 / 8 - 3";
		
		Stack<Integer> opnds = new Stack<Integer>();
		Stack<Character> opts = new Stack<Character>();
		
		
		for(int a=0;a<s.length();a++)
		{
			char cc = s.charAt(a);
			
			
			if(cc=='(')
			{
				opts.push(cc);
			}
			else if(cc==')')
			{
				while(opts.peek()!='(')
				{

					char op = opts.pop();
					int v2 = opnds.pop();
					int v1 = opnds.pop();
					
					int val = Oper(v1, v2, op);
					opnds.push(val);
				}
				opts.pop();
				
			}
			else if(Character.isDigit(cc))
			{
				opnds.push(cc-'0');
			}
			else if(cc=='+' || cc=='-' || cc=='*' || cc=='/')
			{
				while(!opts.isEmpty() && precedence(opts.peek())>=precedence(cc) && opts.peek()!='(')
					{
						char op = opts.pop();
						int v2 = opnds.pop();
						int v1 = opnds.pop();
						
						int val = Oper(v1, v2, op);
						opnds.push(val);
						
					}
					opts.push(cc);
				
				
			}
			
		
		}
		
		while(opts.size()!=0)
		{
			char op = opts.pop();
			int v2 = opnds.pop();
			int v1 = opnds.pop();
			
			int val = Oper(v1, v2, op);
			opnds.push(val);}
		
		System.out.println(opnds.peek());
		
	}
	
	public static int precedence(char op)
	{
		if(op=='+')
		{
			return 1;
		}
		else if(op=='-')
		{
			return 1;
		}
		
		else if(op=='*')
		{
			return 2;
			
		}
		else
		{
			
			return 2;
		}
		
	}
	public static int Oper(int v1,int v2,char op)
	{
		if(op=='+')
		{
			return v1+v2;
		}
		else if(op=='-')
		{
			return v1-v2;
		}
		
		else if(op=='*')
		{
			return v1*v2;
			
		}
		else
		{
			return v1/v2;
		}
		
		
	}

}
