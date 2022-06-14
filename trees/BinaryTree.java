package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

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

	public BinaryTree() {
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

    
    public void postOrder()
    {
    	this.postOrder(this.root);
    }
    
    private void postOrder(Node node)
    {
    	if(node == null)
    	{return;}
    	
    	postOrder(node.left);
    	postOrder(node.right);
    	System.out.print(node.data+" ");
    	 
     }

   
    public void InOrder()
    {
    	this.InOrder(this.root);
    }
    
    private void InOrder(Node node)
    {
    	if(node == null)
    	{return;}
    	
    	
    	InOrder(node.left);
    	System.out.print(node.data+" ");
    	InOrder(node.right);
   }

    public void levelOrder()
    {
    	this.levelOrder(this.root);
    }
    
    private void levelOrder(Node node)
    {
    	LinkedList<Node> queue = new LinkedList<>();
    	
    	queue.add(this.root);
    	
    	while(!queue.isEmpty())
    	{
    		Node rv = queue.removeFirst();
    		
    		System.out.print(rv.data+" ");
    		
    		if(rv.left!=null)
    		{
    			queue.addLast(rv.left);
    		}
    		
    		if(rv.right!=null)
    		{
    			queue.addLast(rv.right);
    		}
    		
    		
    	}
    	
    	
    	
    }
    
    public boolean isBST()
    {
    	return this.isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    private boolean isBST(Node node,int min , int max)
    {
    	if(node==null)
    	{
    		return true;
    	}
    
    	if(node.data>max || node.data<min)
    	{return false;}
    	
    	else if(!this.isBST(node.left, min, node.data))
    	{return false;}
    	
    	else if(!this.isBST(node.right, node.data, max))
    	{
    		return false;
    	}
    	
    	return true;
    }
  
    public void Inorder2()
    {
    	this.Inorder2(this.root);
    }
    
    private void Inorder2(Node node)
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Stack<Node> stack = new Stack<Node>();
    	
    	
    	
    	while(true)
    	{
    	   if(node!=null)
    	   {
    		   stack.push(node);
    		   node=node.left;
    		   
    	   }
    		
    	   else
    	   {
    		   if(stack.isEmpty())
    		   {break;}
    		   
    		   Node rv = stack.pop();
    		   list.add(rv.data);
    		   node=rv.right;
    		   
    		   
    		   
    	   }
    		
    	   
    		
    	}
    	
    	for(int i:list)
    	{System.out.print(i+" ");}
    	
    }
    
    public int diameter()
    {
    	return this.diameter(this.root);
    }
    
    private int diameter(Node node)
    {
    	if(node==null)
    	{return 0;}
    	
    	int case1 = this.height(node.left)+this.height(node.right)+2;
    	int case2 = this.diameter(node.left);
    	int case3 = this.diameter(node.right);
    	
    	int ans = Math.max(case1, Math.max(case2, case3));
    	return ans;
    	
    	
    	
    }

    public int sumLeaf()
    {
    	return this.sumLeaf(this.root,0);
    	
    }
    
    private int sumLeaf(Node node,int sum)
    {
    	
    	if(node==null)
    	{return 0;}
    	if(node.left ==null &&node.right==null)
    	{
    		sum=sum+node.data;
    		return sum;
    	}
    	
    	int s1=sumLeaf(node.left,sum);
    	int s2=sumLeaf(node.right,sum);
    	
    	return s1+s2;
    }
}




