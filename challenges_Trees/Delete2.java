package challenges_Trees;

import java.util.Scanner;

public class Delete2 {

	private class Node
	{
		int data;
		Node left;
		Node right;
		
	}
	
	private Node root;
	
	public Delete2(int [] arr) {
		Node nn = new Node();
		nn.data=arr[0];
		this.root=nn;
		
		for(int a=1;a<arr.length;a++)
		{
		Add(this.root, arr[a]);
		}
		
		
		}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			int [] arr = new int[n];
		
			
			for(int i=0;i<arr.length;i++)
			{arr[i]=scn.nextInt();}
	        
			Delete2 tree = new Delete2(arr);
		       
			
           
			
			int m = scn.nextInt();
			int [] arr2 = new int[m];
			
			for(int i=0;i<arr2.length;i++)
			{arr2[i]=scn.nextInt();}
		
			for(int i=0;i<arr2.length;i++)
			{tree.del(tree.root, null, true, arr2[i]);}
		
			
			tree.preOrder(tree.root);
			System.out.println();
		}
		
		
		
	}

	public Node Add(Node node,int val)
	{
		if(node ==null)
		{Node nn = new Node();
		nn.data=val;
		return nn;}
		
		if(val>node.data)
		{
			Node r = Add(node.right, val);
			node.right=r;
		}
		
		else
		{
			Node l =Add(node.left, val);
			node.left=l;
		}
		return node;}
	
	

	
	public static int Min(Node nn)
	{
		
		if(nn.left==null)
		{return nn.data;}
		
		return Min(nn.left);
		
		
		
	}
	
	public static void del(Node node,Node parent , boolean ilc , int data)
	{
		if(node == null)
		{return;}
		
		
		if(data>node.data)
		{
			del(node.right, node, false, data);
		}
		
		else if(data<node.data)
		{del(node.left, node, true, data);}
		
		else
		{
			if(node.right==null && node.left==null)
			{
				if(ilc)
				{parent.left=null;}
				else
				{
					parent.right=null;
				}
				
			}
			
			
			else if(node.left!=null && node.right==null)
			{
				
				if(ilc)
				{parent.left=node.left;}
				else
				{
					parent.right=node.left;
				}
				
				
			}
			
			
			else if(node.left==null && node.right!=null)
			{
				
				if(ilc)
				{parent.left=node.right;}
				else
				{
					parent.right=node.right;
				}
				
				
			}
			
			else
			{
				int min=Min(node.right);
				node.data=min;
				
				del(node.right, node, false,min );
				
			}
		}
	}
	

	
	 private void preOrder(Node node)
	    {
	    	if(node == null)
	    	{return;}
	    	
	    	System.out.print(node.data+" ");
	    	preOrder(node.left);
	    	preOrder(node.right);
	    
	   }
	
	}
	

