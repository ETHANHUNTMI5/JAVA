package challenges_Trees;

import java.util.Scanner;



public class PostandIn {

	
		private class Node
		{int data;
		Node left;
		Node right;
		
		
		
			
		}
		
		private Node root;
		private int size;
		
		public PostandIn(int [] pre,int [] in) {
			
		}
		
		
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int [] post = new int[n];

			for(int a=0;a<n;a++)
			{post[a]=scn.nextInt();}
				
			int m = scn.nextInt();
			int [] in = new int[m];

			for(int a=0;a<n;a++)
			{in[a]=scn.nextInt();}
			
			 PostandIn tree = new PostandIn(post, in);
			 
			 Node nn=tree.fill(post, in, 0, post.length-1, 0, in.length-1);
			tree.display(nn);
			
		}

		public  Node fill(int [] post,int [] in,int plo,int phi,int inlo,int inhi)
		{
			
			if(plo>phi || inlo>inhi)
			{return null;}
			//create a new node(root)
			
			Node nn = new Node();
			nn.data=post[phi];
			
			//get it in inorder
			int vi=-1;
			int nel=0;  // no. of elements 
			for(int a=inlo;a<=inhi;a++)
			{
				if(in[a]==nn.data)
				{
					vi=a;
					break;
				}
			
			nel++;}
			
			// call left and right
			
			nn.left=fill(post, in, plo, plo+nel-1, inlo, vi-1);
			nn.right=fill(post , in, plo+nel, phi-1, vi+1, inhi);
		
		return nn;}

		
		private void display(Node node)
	    {
	    	String str ="";
	    	
	    	if(node.left!=null)
	    	{
	    		str=str+node.left.data+" => ";
	    	}
	    	
	    	else
	    	{
	    		
	    		str= str+"END => ";
	    	}
	    	
	    	str=str+node.data;
	    
	    	if(node.right!=null)
	    	{
	    		str=str+" <= "+node.right.data;
	    	}
	    	
	    	else
	    	{
	    		
	    		str= str+" <= END";
	    	}
	    	
	     System.out.println(str);
	     
	     if(node.left!=null)
	     {this.display(node.left);}
	    
	     if(node.right!=null)
	     {this.display(node.right);}
	     
	    }
	    
	}
