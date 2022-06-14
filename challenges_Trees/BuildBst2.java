package challenges_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;





public class BuildBst2 {

	private class Node
	{int data;
	Node left;
	Node right;}
	
	private Node root;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	     int t = scn.nextInt();
	     for(int a=1;a<=t;a++)
	     {
	    	 int n = scn.nextInt();
	    	 int [] arr = new int[n];
	    		 
	    	 for(int b=0;b<arr.length;b++)
	    	 {arr[b]= scn.nextInt();}
	    	 
	    	 BuildBst2 tree = new BuildBst2();
	    	 
	    	 for(int i =0;i<arr.length;i++)
	    	 {
	    		 tree.Add(arr, i);
	    	 }
	    	
	    	ArrayList<Integer> ans = new ArrayList<Integer>();
	    	 int k1 = scn.nextInt();
	    	 int k2 = scn.nextInt();
	    
	    	
	    	 System.out.print("# Preorder : ");
	    	 tree.preOrder(tree.root);
	         
	         System.out.println();
	         System.out.print("# Nodes within range are : ");
	         tree.InOrder(tree.root, k1, k2);
	         
	         System.out.println();
	         for(int i=0;i<ans.size();i++)
	         {System.out.print(ans.get(i)+" ");}
	         	
	     }
	        	
	}

	public Node Build(Node root,int val)
	{
		if(root==null)
		{
			Node nn = new Node();
			nn.data=val;
			return nn;
		}
		
		if(val>root.data)
		{
			Node r = Build(root.right, val);
			root.right=r;
		}
		
		else
		{
			Node l = Build(root.left, val);
			root.left=l;
		}
		
		return root;
	}	
	
	public void Add(int [] arr,int vi)
	{
		this.root=Build(root, arr[vi]);
		
	}
	
	 private void preOrder(Node node)
	    {
	    	if(node == null)
	    	{return;}
	    	
	    	System.out.print(node.data+" ");
	    	preOrder(node.left);
	    	preOrder(node.right);
	    
	   }
	 public void Dis(int k1,int k2,Node node,ArrayList<Integer> ans)
	   {
		   if(node ==null)
		   {
			   return;
			  }
		  
		   if(node.data>=k1 && node.data<=k2)
		   {ans.add(node.data);}
		   
		   Dis(k1, k2, node.left, ans);
		   Dis(k1, k2, node.right, ans);
		   
		   
		   
	   }
	 private void InOrder(Node node,int k1,int k2)
	    {
	    	if(node == null)
	    	{return;}
	    	
	    	
	    	InOrder(node.left,k1,k2);
	    	if(node.data>=k1 && node.data<=k2)
	    	{System.out.print(node.data+" ");}
	    	InOrder(node.right,k1,k2);
	   }
}
