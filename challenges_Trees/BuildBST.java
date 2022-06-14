package challenges_Trees;

import java.util.Scanner;

public class BuildBST {
	
	private class Node
	{int data;
	Node left;
	Node right;
	
	
	
		
	}
	
	private Node root;
	private int size;
	
	public BuildBST(int [] in) {
	
	}
	

	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			
			int [] in = new int [n];
			
			for(int i=0;i<n;i++)
			{in[i] = scn.nextInt();}
			
			BuildBST tree = new BuildBST(in);
			Node nn = tree.Build(in, 0, in.length-1);
			tree.Pre(nn);
			
		System.out.println();}
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
	
	private void Pre(Node node)
	{
		if(node ==null)
		{return;}
		
		System.out.print(node.data+" ");
		Pre(node.left);
		Pre(node.right);
		
	}

}
