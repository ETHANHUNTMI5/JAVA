package sheet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FirstKreverseQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		int k =5;
		q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
		q.add(60);q.add(70);q.add(80);q.add(90);q.add(100);
	
		int n = q.size();
		System.out.println(q);
		
		Stack<Integer> help = new Stack<Integer>();
		for(int a=0;a<k;a++)
		{
			help.add(q.poll());
		}
		for(int a=0;a<k;a++)
		{
			q.add(help.pop());
		}
		
		for(int a=1;a<=n-k;a++)
		{
			q.add(q.poll());
		}
		
		System.out.println(q);
	}

}
