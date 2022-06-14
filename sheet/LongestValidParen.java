package sheet;

import java.util.Stack;

public class LongestValidParen {

	public static void main(String[] args) {
		
		String s = "()()puji";
		
		int n = s.length();
		
		Stack<Character> ss = new Stack<>();
		int b=0;
		for(int a=0;a<n;a++)
		{
			char cc = s.charAt(a);
			if(cc=='(')
			{ss.push(cc);}
			
			else
			{
			if(ss.isEmpty())
			{b++;}
			else 
			{ss.pop();}
			}
		}
		System.out.println(n-(ss.size()+b));
	}

}
