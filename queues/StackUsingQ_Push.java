package queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQ_Push {

	public static void main(String[] args) {
		Queue<Integer > A = new LinkedList<Integer>();
		Queue<Integer > B = new LinkedList<Integer>();

		Queue<Integer> Primary = A;
		Queue<Integer> Secondary = B;
		
		
		A.add(17);
		A.add(8);
		A.add(14);
		A.add(9);
	
	
	pop(A, Secondary, Primary, B);
	
		
	}
	public static void pop(Queue<Integer> A ,Queue<Integer> Secondary, Queue<Integer> Primary  ,Queue<Integer> B  )
	{
		while(A.size()>1)
		{
		  int num = A.poll();
			
		  B.add(num);
		}
		
		A.poll();
		
		Primary=B;
		Secondary=A;
		display(Primary);		
		
		
	}
	
	public static void display(Queue<Integer> Primary)
	{
		while(!Primary.isEmpty())
		{
			System.out.print(Primary.poll()+" ");
			
		}
		
	}

}
