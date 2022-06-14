package pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrack {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		boolean b = false;
		for(int a=0;a<s.length();a++)
		{
			char cc = s.charAt(a);
			int t=0;
			
			if(cc==')')
			{
				while(stack.peek()!='(')
				{
					stack.pop();
					t++;
				}
				
				stack.pop();
				if(t==0)
				{
					System.out.println("True");
					b=true;
					break;
				}
				
			}
			
			else {
			stack.push(cc);
			}
			
					}

		if(!b)
		{
			System.out.println("False");
		}
		
	}

}
