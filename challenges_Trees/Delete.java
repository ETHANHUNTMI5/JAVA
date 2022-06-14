package challenges_Trees;


import java.util.Scanner;





public class Delete {

	private class Node
	{
		int data;
		Node left;
		Node right;
		
	}
	private Node root;
	private int size;
	
	public Delete(int [] arr , int [] rem) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int n= scn.nextInt();
			int [] arr= new int[n];
			int [] arr2=new int[n];
			
			
			
			for(int i=0;i<arr.length;i++)
			{arr[i]=scn.nextInt();
			arr2[i]=arr[i];}
			
			int [] in=bubble(arr);
			int m = scn.nextInt();
			int [] rem = new int[m];
			
			for(int i=0;i<rem.length;i++)
			{rem[i]=scn.nextInt();}
			
			Delete tree = new Delete(arr,rem);
			Node root = tree.fill(arr2, in, 0, arr2.length-1, 0, in.length-1);
		   
		
			
			for(int b=0;b<rem.length;b++)
			{
				del(root, null, true, rem[b]);
			}
			
			tree.display(root);
			
		}
		

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
	
	public static int Min(Node nn)
	{
		
		if(nn.left==null)
		{return nn.data;}
		
		return Min(nn.left);
		
		
		
	}
	
	private Node Build(int [] in,int lo,int hi)
	{
		if(lo>hi)
		 {return null; }
		
		int mid = (lo+hi)/2;
		
		Node nn = new Node();
		nn.data=in[mid];
		
		
		nn.left=Build(in, lo, mid-1);
		nn.right=Build(in, mid+1, hi);
		
		return nn;
		
		
		
		
		
	}
	
	public void display(Node nn)
	{
		if(nn == null )return;
		
		System.out.print(nn.data+" ");
	    display(nn.left); 
		display(nn.right);
	}
	
	public static int []  bubble(int [] arr)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{
    		for(int j=0;j<arr.length-1-a;j++)
    		{if(arr[j]>arr[j+1])
    		{int temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;}
    					
    		}
    	}
    	
    	return arr;
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


}
