package challenges_Trees;

import java.util.Scanner;



public class PreandIn {

	private class Node
	{int data;
	Node left;
	Node right;
	
	
	
		
	}
	
	private Node root;
	private int size;
	
	public PreandIn(int [] pre,int [] in) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] pre = new int[n];

		for(int a=0;a<n;a++)
		{pre[a]=scn.nextInt();}
			
		int m = scn.nextInt();
		int [] in = new int[m];

		for(int a=0;a<n;a++)
		{in[a]=scn.nextInt();}
		
		 PreandIn tree = new PreandIn(pre, in);
		 
		 Node nn=tree.fill(pre, in, 0, pre.length-1, 0, in.length-1);
		tree.display(nn);
		
	}

	public  Node fill(int [] pre,int [] in,int plo,int phi,int inlo,int inhi)
	{
		
		if(plo>phi || inlo>inhi)
		{return null;}
		//create a new node(root)
		Node nn = new Node();
		nn.data=pre[plo];
		
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
		
		nn.left=fill(pre, in, plo+1, plo+nel, inlo, vi-1);
		nn.right=fill(pre, in, plo+nel+1, phi, vi+1, inhi);
	
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
//3                 
//1 2 3
//3
//3 2 1

