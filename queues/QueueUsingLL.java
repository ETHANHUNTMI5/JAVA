package queues;

import java.util.LinkedList;

public class QueueUsingLL {



		 
		 LinkedList<Integer> queue ;
		 
		 QueueUsingLL()
		 {
			 queue = new LinkedList<Integer>();
		 }
	

         public boolean isEmpty()
         {
        	 return queue.isEmpty();
         }
         
         public void enqueue(int n)
         {
        	 queue.addLast(n);
         }
		 

         public void dequeue()
         {
        	 queue.removeFirst();
        	 
         }
         
         public int getFront()
         {
        	 return queue.getFirst();
         }
         
public static void main(String[] args) {
 
	QueueUsingLL queue = new QueueUsingLL();
	
	for(int a=1;a<=6;a++)
	{queue.enqueue(a);
	}
 
	queue.enqueue(9);
	queue.dequeue();
	queue.dequeue();
	
	while(!queue.isEmpty())
	{
		System.out.print(queue.getFront()+" ");
	    queue.dequeue();
	 }

}
}

