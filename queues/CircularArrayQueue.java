package queues;


public class CircularArrayQueue {

	private int [] arr;
	private int cs;
	private int ms;
	private int front;
	private int rear;
	
	public static final int Default_Capacity=10;
	
	CircularArrayQueue() {
            
		 this(Default_Capacity);
}  
	  
	
		CircularArrayQueue(int capacity)
		{
			this.arr = new int[capacity];
			this.cs=0;
			this.ms=capacity;
			this.front =0;
			this.rear=capacity-1;
			
		}
	
		public boolean isEmpty()
		{
			
			return this.cs==0;
		}

         
		public boolean isFull()
		{
			return this.cs==this.ms;
			
		}
        
		public void enqueue(int data)
		{
			if(!this.isFull())
			{	this.rear=(this.rear+1)%this.arr.length;
			
			this.arr[this.rear]=data;
			this.cs++;
			}
		}
		
		public void dequeue()
		{
			if(!this.isEmpty())
			{this.front=(this.front+1)%this.arr.length;
			
			this.cs--;
			}
		}
		
 		public int getFront()
 		{
 			return this.arr[this.front];
 		}
 		
 		public void kar()
 		{
 			System.out.println(this.cs);
 			System.out.println(this.front+"->"+this.rear);
 			
 		}
}
