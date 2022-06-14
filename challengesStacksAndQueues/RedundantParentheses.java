package challengesStacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class RedundantParentheses {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 
		 int t = scn.nextInt();
		 scn.nextLine();
		 
		 for(int a =1;a<=t;a++)
		 {
			 String str = scn.nextLine();
			 System.out.println(DuplicateCheck(str));
		 }
		
		
		
		
		
		
		
		
	}
	public static String DuplicateCheck(String str)
	{
	int k=0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int a=0;a<str.length();a++)
		{
			if(str.charAt(a)=='(')
			{stack.push('(');}

			else if(str.charAt(a)==')')
			{
			if(k==a-1)
			{return "duplicate";}
				
				k=a;
				stack.pop();
				
				
			}
			
			else
			{//do nothing}
			
		}
		
		
			
			
		
	}
		return "not duplicate";

}
}
