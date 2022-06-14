package challenges_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class ZIGZAGlevel {

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}

	}

	Node root = null;
	int size = 0;

	public ZIGZAGlevel() {
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(scn, null, true);

	}

	public Node takeInput(Scanner scn, Node parent, boolean LeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the value of the root node");
		}

		else {
            if(LeftOrRight)
            {System.out.println("Enter the value for left child of "+parent.data);}
            else
            {System.out.println("Enter the value for right child of "+parent.data);}
			
			
		}

		int nodedata = scn.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean b = true;
		System.out.println("Does " + node.data + " have a left child ?");
		b = scn.nextBoolean();

		if (b) {
		   node.left=takeInput(scn, node, true);
			
		} else {
			node.left = null;

		}

		b = true;
		System.out.println("Does " + node.data + " have a right child ?");
		b = scn.nextBoolean();

		if (b) {
		   node.right=takeInput(scn, node, false);
			
		} else {
			node.right = null;

		}

		return node;

	}
	
	public void display()
	{
		this.display(this.root);
		
	}

    private void display(Node node)
    {
    	String str ="";
    	
    	if(node.left!=null)
    	{
    		str=str+node.left.data+" <= ";
    	}
    	
    	else
    	{
    		
    		str= str+"END <= ";
    	}
    	
    	str=str+node.data;
    
    	if(node.right!=null)
    	{
    		str=str+" => "+node.right.data;
    	}
    	
    	else
    	{
    		
    		str= str+" => END";
    	}
    	
     System.out.println(str);
     
     if(node.left!=null)
     {this.display(node.left);}
    
     if(node.right!=null)
     {this.display(node.right);}
     
    }
    
    
    private void levelOrder(Node node)
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	LinkedList<Node> queue = new LinkedList<>();
    	int count =0;
    	queue.add(this.root);
    	
    	Node rv=null;
    	while(!queue.isEmpty())
    	{
    		
    	if(count%2!=0)
         {rv = queue.removeFirst();
        	list.add(rv.data);
         }
    	
    	else
    	{rv=queue.removeLast();
    	list.add(rv.data);}
    		
    	
    	
        if(rv.left!=null)
        {queue.addLast(rv.left);}
        if(rv.right!=null)
        {queue.addLast(rv.right);}
    	
    	
    	count++;}
    	
    	
    		
    	
    }
    
    

    public static void main(String[] args) {

    	ZIGZAGlevel tree = new ZIGZAGlevel();
        tree.display();
    	tree.levelOrder(tree.root);
}
}