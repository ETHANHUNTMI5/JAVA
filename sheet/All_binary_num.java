package sheet;

import java.util.Queue;
import java.util.Stack;


public class All_binary_num {

	public static void main(String[] args) {
		
		Queue<String> q = new java.util.LinkedList<String>();
		
		q.add("1");
		
		int n  =10;
		
		while(n!=0)
		{
			String s1 = q.poll();
			
			System.out.println(s1);
			
			q.add(s1+"0");
			q.add(s1+"1");
			
			n--;
		}
	}

}
