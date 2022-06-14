package linkedListChallenges;

import java.util.Scanner;

public class MergeSortedLL {
 public static Scanner scn = new Scanner(System.in);
	
		
		
		private class Node      //inner class
		{
			int data;
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
				System.out.print(temp.data+" ");
				temp=temp.next;
				
			
			}
			
	 
			
			

		System.out.println();}
		
		//O(1)
		public void addLast(int item)
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
		public void addFirst(int item)
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
		public int getFirst() throws Exception
		{
			if(this.size==0)
			{throw new Exception("LL is empty");}
			
			return this.head.data;
			
		}
		
		//O(1)
		public int getLast() throws Exception
		{
			if(this.size==0)
			{throw new Exception("LL is empty");}
			
			return this.tail.data;
			
		}
		
		//O(n)
		public int getAt(int idx) throws Exception
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
		public void addAt(int idx,int item) throws Exception
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
		public int RemoveFirst() throws Exception
		{
			if(this.size==0)
			{
				throw new Exception("Already empty");
			}
			
			if(this.size==1)
			{
				int data = this.head.data;
				head=null;
				tail=null;
				size=0;
				return data;
				
			}
			
			else {
			int data= this.head.data;
			head = head.next;
			
			this.size--;
			
			return data;}
		}
		
		//O(n) due to use of getNodeAt()
		public int RemoveLast() throws Exception
		{
			if(this.size==0)
			{
				throw new Exception("Already empty");
			}
			
			else if(this.size==1)
			{
				int data = tail.data;
				head =null;
				tail=null;
				size=0;
		
				return data;
			}
			
			
			int data = this.tail.data;
			
			Node tailnew = getNodeAt(this.size-2);
			
			
			tailnew.next=null;
			tail=tailnew;
			this.size--;
			
		return data;	
		}
		
		//O(n) due to use of getNodeAt()
		public int RemoveAt(int idx) throws Exception

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
			int rv = rem.data;
			
			//delete the node
		
			remM1.next=remP1;
			rem.next=null;
			
			//object variables
		   this.size--;	
		   
		   
		   return rv;
			}
		}

	   
		public void ReverseData() throws Exception
		{
			int left = 0;
			int right=this.size-1;
			
			
			while(left<right)
			{
				Node ln = getNodeAt(left);
				Node rn = getNodeAt(right);
				
				int temp = ln.data;
				ln.data=rn.data;
				rn.data=temp;
				
				
				
				left++;
				right--;
				
			}
			
			
		}
		public void ReversePointer() 
		{
			Node prev = this.head;
			Node curr = prev.next;
			
			while(curr!=null)
			{
				Node ahead=curr.next;
				
				curr.next=prev;
				
				prev=curr;
				curr=ahead;
				
			}
			
			//updating head and tail
			Node t = this.head;
			this.head=this.tail;
			this.tail=t;
			

			//next of new tail
			this.tail.next=null;
			
			
		}
		
		public int mid ()
		{
			Node slow = this.head;
			Node fast = this.head;
			
			
			// even and odd
			
			while(fast.next!=null &&fast.next.next!=null  )
			{
				slow = slow.next;
				fast= fast.next.next;
				
			}		
			
			return slow.data;
		}
		
		public static void main(String[] args) throws Exception {
             int t = scn.nextInt();
		    
		    while(t > 0){
		    	 MergeSortedLL answer = new MergeSortedLL();
			    MergeSortedLL list1 = new MergeSortedLL();
			    int n1 = scn.nextInt();
			 
			    for (int j = 0; j < n1; j++) {
				    int item = scn.nextInt();
				    list1.addLast(item);
			}

                MergeSortedLL list2 = new MergeSortedLL();
			    int n2 = scn.nextInt();
			 
			    for (int j = 0; j < n2; j++) {
				    int item = scn.nextInt();
				    list2.addLast(item);
			}
			
			   Merge(list1, list2, answer);
			   
			   
            t--;
            
			
		    }
		
		   
		    
		
		}
		
		
		public static void Merge(MergeSortedLL first,MergeSortedLL second,MergeSortedLL answer) throws Exception
		{
			   while(first.size!=0 && second.size!=0)
			   {
			          if(first.getFirst()<=second.getFirst())
			   	   {
			              int num1 = first.RemoveFirst();
			   		   answer.addLast(num1);

			   	   }

			   	   else
			   	   {
			   		   int num2 = second.RemoveFirst();
			   		   answer.addLast(num2);
			   	   }
			   }	

			                if(first.size==0)
			   			 {
			                while(second.size!=0)
			              { int num2 = second.RemoveFirst();
			   			answer.addLast(num2);


			   			  } }
			   			 else
			   			 {
			               while(first.size!=0)
			              { int num1 = first.RemoveFirst();
			   			answer.addLast(num1);
			              }}

		
			                answer.Display();}
}