package sheet;

import java.util.Stack;

public class CountDuplicateParen {

	public static void main(String[] args) {
	
		String s=  "(((a)+(b)))";
		
		Stack<Character> ss = new Stack<>();
		int count=0;
		int ans =0;
		int n = s.length();
		
		for(int a=0;a<n;a++)
		{
			char cc = s.charAt(a);
			if(cc==')')
			{
				while(ss.peek()!='(')
				{
					count++;
					ss.pop();
				}
				ss.pop();
				if(count==0)
				{ans++;}
				count=0;
			}
			else if(cc=='('||cc=='/'||cc=='*'||cc=='-'||cc=='+')
			{
				ss.push(cc);
			}

		}
		System.out.println(ans);
	}

}
