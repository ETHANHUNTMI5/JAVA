package sheet;

import java.util.Stack;



public class MinReversals {

	public static void main(String[] args) {
		
		String s = "{{{{}}";
		int n = s.length();
		
		if(n%2!=0)
		{
			System.out.println(-1);
			return;
		}
		
		
		else
		{int cb=0;
		  Stack<Character> ss = new Stack<>();
		  
		  for(int a=0;a<n;a++)
		  {
			  char cc = s.charAt(a);
			  
			  if(cc=='{')
			  {
				  ss.push(cc);
			  }
			  else
			  {
				  if(ss.isEmpty())
				  {
					  cb++;
				  }
				  else
				  {
					  ss.pop();
				  }
				  
			  }
		  }
		  

		  int ans = (int)Math.ceil(ss.size()/2)+(int)Math.ceil(cb/2);
		  System.out.println(ans);
		}

	}

}
