package challenges_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class IsBalanced {

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

	public IsBalanced() {
	

	}

	public Node takeInput(Scanner scn, Node parent, boolean LeftOrRight) {
		if (parent == null) {
			
		}

		else {
            if(LeftOrRight)
            {}
            else
            {}
			
			
		}

		int nodedata = scn.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean b = true;
		
		b = scn.nextBoolean();

		if (b) {
		   node.left=takeInput(scn, node, true);
			
		} else {
			node.left = null;

		}

		b = true;
		
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
    
    
    public int height()
    {
    	int ans=this.height(this.root);
        return ans;
    }
    
    private int height(Node node)
    {
    	if(node ==null)
    	{return -1;}
    	
    	int lheight=height(node.left);
    	int rheigth= height(node.right);
    	int ans =0;
    	
    	ans = Math.max(lheight, rheigth)+1;
    	return ans;
    	
    	
    }

    public void preOrder()
    {
    	this.preOrder(this.root);
    }
    
    private void preOrder(Node node)
    {
    	if(node == null)
    	{return;}
    	
    	System.out.print(node.data+" ");
    	preOrder(node.left);
    	preOrder(node.right);
    
   }

    
   	public static void main(String[] args) {
   		
   		Scanner scn = new Scanner(System.in);
   		IsBalanced tree = new IsBalanced();
   		Node root=tree.takeInput(scn, null, true);
   		System.out.println(tree.isBal(root));
   		
	}


	public boolean isBal(Node node)
	{
		if(node == null)
		{return true;}
		
		
		boolean lb = isBal(node.left);
		boolean rb = isBal(node.right);
	
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		int s = lh-rh;
		
		
		
		if(lb && rb&& s<=1 && s>=-1)
		{return true;}
		
		else
		{return false;}
		
		
			
	}
	
}