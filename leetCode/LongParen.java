package leetCode;

import java.util.ArrayList;
import java.util.Stack;

public class LongParen {

	public static void main(String[] args) {
		String s ="())()()";
		
		Stack<Character> stack = new Stack<Character>();
		ArrayList<Integer> ll = new ArrayList<Integer>();
		int count=0;
		for(int a=0;a<s.length();a++)
		{
			char cc = s.charAt(a);
			if(cc=='(')
			{
				stack.add(cc);
			}
			else
			{
				if(!stack.isEmpty())
				{
					stack.pop();
					count++;
					if(stack.isEmpty())
					{ll.add(count);
					count=0;
					continue;}
					
					ll.add(count);
				}
			}
			
		}
		System.out.println(ll);
		System.out.println(count*2);

	}

}
