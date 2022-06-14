package queues;

public class CircularArrayQueueClient {

	public static void main(String[] args) {

      CircularArrayQueue queue = new CircularArrayQueue(7);
      
         for(int a=1;a<7;a++)
         {
        	 queue.enqueue(10*a);
        	 queue.kar();
         }
      
      
      
//         queue.dequeue();
//         queue.dequeue();
//          queue.enqueue(70);
	
	     
         while(!queue.isEmpty())
         {
        	 System.out.println(queue.getFront());
        	 queue.dequeue();
         }
	}
	

}
