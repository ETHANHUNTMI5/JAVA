package challenges_Trees;

import java.util.ArrayList;
import java.util.Scanner;



public class LargestBst {

private class Node
{
int data;
Node left;
Node right;

}
	private Node root;
	private int size;
	
	
	 public LargestBst(int [] pre, int[] in) {
	
	}
	
	
	
	
	
	public static void main(String[] args) {
    
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] pre = new int[n];
        int [] in = new int[n];
        
        for(int a=0;a<n;a++)
        {pre[a]=scn.nextInt();}
        
        for(int a=0;a<n;a++)
        {in[a]= scn.nextInt();}
        
        LargestBst tree = new LargestBst(pre, in);
        tree.root=tree.Build(0, n-1, pre, 0, n-1, in);
        ArrayList<Node > arr = new ArrayList<Node>();
		tree.Large(tree.root,arr);
        int ans=tree.size2(arr.get(0));
        int ans2=0;
        
        for(int a=0;a<arr.size();a++)
        {
        	ans2= tree.size2(arr.get(a));
        	
        	if(ans2>ans)
        	{ans= ans2;}
        	
        }
        
        System.out.println(ans);
        
	}

	public Node Build(int plo,int phi,int[] pre , int inlo,int inhi, int[]in)
	{
		if(plo>phi || inlo>inhi)
		{return null;}
		
		
		//find root node
		Node nn = new Node();
		nn.data=pre[plo];
		
		
		// now root node in inorder
		
		int val=0,vi=-1,nel=0;
		val=nn.data;
		
		for(int a=inlo;a<=inhi;a++)
		{
			if(in[a]==val)
			{vi=a;
			break;}
			nel++;
		}
		
		
		nn.left=Build(plo+1, plo+nel, pre, inlo, vi-1, in);
		nn.right=Build(plo+nel+1, phi, pre, vi+1, inhi, in);
		
		return nn;
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
	  
	 public void Large(Node node,ArrayList<Node > arr)
	 {
		 if(node == null)
		 {return;}
		 
		 
		 
		 boolean lp = isBST(node.left, Integer.MIN_VALUE, node.data);
		 boolean rp = isBST(node.right, node.data,Integer.MAX_VALUE);
		 
		 if(lp&& rp)
		 {
			 arr.add(node);
		 }
		 
		 Large(node.left,arr);
		 Large(node.right,arr);
		 
		 
		 
	 }
	 
	 public int size2(Node node)
	 {
		 if(node == null)
		 {return 0;}
		 
		 int lp = size2(node.left);
		 int rp = size2(node.right);
		 
		 return lp+rp+1;
		 
		 
	 }
}
