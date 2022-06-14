package hashMap.Generics;



public class LinkedListGen <T>{

	
	private class Node      //inner class
	{
		T data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	

	
   //O(n)
	public void Display()
	{
		
		Node temp = this.head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" , ");
			temp=temp.next;
			
		
		}
		
 
		
		

	System.out.println();}
	
	//O(1)
	public void addLast(T item)
	{
		//create a node
		Node nn = new Node();
		nn.data=item;
		
		//attach
		
		if(this.size>=1)
		{
			this.tail.next=nn;
		}
		
		// update
		
		if(this.size==0)
		{this.head=nn;
		this.tail=nn;
		this.size++;
		
			}
		
		else
		{
			this.tail=nn;
			this.size++;
		}
		
	}
	
	//O(1)
	public void addFirst(T item)
	{
		//create
		
		Node nn = new Node();
		nn.data=item;
		
		// attach
		
		if(this.size>=1)
		{
			nn.next=head;
			
		}
		
		// update summary objects
		
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}

		else
		{
			this.head=nn;
			this.size++;
			
		}
		
	}

	// O(1)
	public T getFirst() throws Exception
	{
		if(this.size==0)
		{throw new Exception("LL is empty");}
		
		return this.head.data;
		
	}
	
	//O(1)
	public T getLast() throws Exception
	{
		if(this.size==0)
		{throw new Exception("LL is empty");}
		
		return this.tail.data;
		
	}
	
	//O(n)
	public T getAt(int idx) throws Exception
	{
		if(this.size==0)
		{throw new Exception("ll is empty");}
		
		if(idx<0 || idx >= this.size)
		{
			throw new Exception("INVALID INDEX");}
			
		Node temp=this.head;
		
		for(int i =1;i<=idx;i++)
		{
			temp=temp.next;
			
		}
		
	return temp.data;}
	
	
	//O(n)
	private Node getNodeAt(int idx) throws Exception
	{
		if(this.size==0)
		{throw new Exception("ll is empty");}
		
		if(idx<0 || idx >= this.size)
		{
			throw new Exception("INVALID INDEX");}
			
		Node temp=this.head;
		
		for(int i =1;i<=idx;i++)
		{
			temp=temp.next;
			
		}
		
	return temp;}
	
	//O(n) due to use of getNodeAt()
	public void addAt(int idx,T item) throws Exception
	{
		if(idx<0 || idx>size)
		{throw new Exception("Invalid index");}
		
		if(idx==0)
		{
			addFirst(item);
		}
		else if(idx == this.size)
		{
			addLast(item);
		}

		else {
		
		//create	
		Node nn = new Node();
		nn.data=item;
		
		Node nnM1 = getNodeAt(idx-1);
	    Node nnP1 = nnM1.next;
		
	    // attach
		nnM1.next=nn;               //M1--minus 1 && P1--plus 1
		nn.next=nnP1;
		
		// object variables
		this.size++;
		}
	}
	
	//O(1)
	public T RemoveFirst() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Already empty");
		}
		
		if(this.size==1)
		{
			T data = this.head.data;
			head=null;
			tail=null;
			size=0;
			return data;
			
		}
		
		else {
	  T data= this.head.data;
		head = head.next;
		
		this.size--;
		
		return data;}
	}
	
	//O(n) due to use of getNodeAt()
	public T RemoveLast() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Already empty");
		}
		
		else if(this.size==1)
		{
			T data = tail.data;
			head =null;
			tail=null;
			size=0;
	
			return data;
		}
		
		
		T data = this.tail.data;
		
		Node tailnew = getNodeAt(this.size-2);
		
		
		tailnew.next=null;
		tail=tailnew;
		this.size--;
		
	return data;	
	}
	
	//O(n) due to use of getNodeAt()
	public T RemoveAt(int idx) throws Exception

	{
		if(idx<0 || idx>=this.size)
		{
			throw new Exception("INVALID INDEX");
		}
		
		if(this.size==0)
		{
			throw new Exception("ALREADY EMPTY");
		}
		if(idx==0)
		{
			return RemoveFirst();
		}
		
		else if(idx==this.size-1)
		{
			
			return RemoveLast();
		}
	
		else {
	 	// get the nodes and integer
		Node remM1=getNodeAt(idx-1);  
		Node rem=remM1.next;
		Node remP1=rem.next;
		T rv = rem.data;
		
		//delete the node
	
		remM1.next=remP1;
		rem.next=null;
		
		//object variables
	   this.size--;	
	   
	   
	   return rv;
		}
	}

	// to get index of data
   public int find(T data)
   {
	   
	   int ans = -1;
	   
	   Node temp = this.head;
	   int a=0;
	   while(temp!=null)
	   {
		   if(temp.data.equals(data))
			   //as .equals compare only the data, while == compares address.
	   {
		   ans=a;
		   break;
	   }
		   temp=temp.next;
		   a=a++;
	   }

   return ans;}
	
	

}
