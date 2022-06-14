package queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQ_Pop {

	public static void main(String[] args) {
	
     	
		Queue<Integer> Primary =new LinkedList<Integer>();
		Queue<Integer> Secondary = new LinkedList<Integer>();
		pushEle(Primary, Secondary, 10);
		pushEle(Primary, Secondary, 20);
		pushEle(Primary, Secondary, 30);
		pushEle(Primary, Secondary, 40);
		
		
		display(Primary);
			}

	public static void pushEle(Queue<Integer> Primary,Queue<Integer> Secondary,int n)
	{
		 Secondary.add(n);
		
		while(!Primary.isEmpty())
		{
			int num = Primary.poll();
			Secondary.add(num);
		}
		
		while(!Secondary.isEmpty())
		{
			Primary.add(Secondary.poll());
			
		}


		
	}
	
	public static void display(Queue<Integer> Primary)
	{
		while(!Primary.isEmpty())
		{
			System.out.print(Primary.poll()+" ");
			
		}
		
	}

	
}
