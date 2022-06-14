package sheet;

public class DLL_to_BST {
	Node root;
//	 class LinkedList{
		 
		 class Node
			{
				int data;
				Node left;
				Node right;
				Node(int data)
				{
					this.data= data;
					left = right=null;
				}
			}
		 
		Node head ;
		Node temp;
		
		DLL_to_BST()
		{
			head =null;
			temp = head;
		}
	
	void add(int n)
	{
	    if(head==null)
	    {
	    	Node nn = new Node(n);
	    	head =nn;
	    	head.left=head;
	    	head.right=head;
	    	temp=head;
	    	
	    }
	    
	    else
	    {
	    	Node nn = new Node(n);
	    	temp.right = nn;
	    	nn.left = temp;
	    	temp =nn;
	    	temp.right =head;
	    	head.left =temp;
	    	
	    	
	    }
	}
	 int countNodes(Node head)
	    {
	        int count = 0;
	        Node temp = head;
	        int val = temp.data;
	        while (temp != null)
	        {
	            temp = temp.right;
	            count++;
	            if(temp.data==val)
	            {break;}
	        }
	        
	        return count;
	    }
	 Node getMid(Node head)
	 {
		 Node slow = head;
		 Node fast = head;
		 
		 
		 head.left=null;
		 while(fast!=null &&fast.right!=null)
		 {
			 slow = slow.right;
			 fast = fast.right.right;
		 }
		 
	 return slow;}
	 
	 
	 Node kar(Node mid)
	 {
		if(mid==null)
		{return null;}
		 
		 Node lp = kar(mid.left);
		 Node rp = kar(mid.right);
		 
		 if(lp!=null)
		 {lp.right=mid;}
		 
		 
		 mid.right = rp;
		 return mid;
		 
		 
		 
	 }
	 
	 void kar2(Node mid)
	 {
		 Node temp1 = mid;
		 Node temp2 = mid;
		 while(temp1!=null)
		 {
			 temp1.right=null;
			 temp1=temp1.left;
			 
			 
		 }
		 
		 while(temp2!=null)
		 {
			 temp2.left=null;
			 temp2=temp2.right;
	
			 
		 }
		 
	 }
	 
	 void Print(Node head)
	 {
		 
	 }
	
//	}
	public static void main(String[] args) {
		
		DLL_to_BST ll = new DLL_to_BST();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(8);

		
		Node temp = ll.head;
		
		int val = temp.data;
		temp= temp.right;
		System.out.print(val+" ");
		
		while(temp.data!=val)
		{
			System.out.print(temp.data+" ");
			
			if(temp.right.data==val)
			{temp.right=null;
			break;}
			
			temp = temp.right;
			
		}
		
		
		Node mid = ll.getMid(ll.head);
		
		ll.kar2(mid);
		ll.kar(mid);
		System.out.println();
		System.out.println("*********");
		
        System.out.println("***********");
		System.out.println(mid.data);
	
	}
}
