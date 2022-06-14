package challenges_Trees;

import java.util.Scanner;

public class ReplaceWithS {

	
	private class Node
	{
		int data;
		Node left;
		Node right;
		
	}
	private Node root;
	private int size;
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		
		ReplaceWithS tree = new ReplaceWithS();
		tree.root= tree.takeInput(0, n-1, arr);
        tree.pre(tree.root);		

	}

	public Node takeInput(int lo , int hi,int [] arr)
	{
		if(lo>hi)
		{return null;}
		
		int mid = (lo+hi)/2;
		
		Node nn = new Node();
		
		for(int a=mid;a<arr.length;a++)
		{nn.data=nn.data+arr[a];}
		
		
		nn.left= takeInput(lo, mid-1, arr);
		nn.right= takeInput(mid+1, hi, arr);
		
		return nn;
	}
	
	public void pre(Node node)
	{
		if(node == null)
		{return;}
		
		System.out.print(node.data+" ");
		pre(node.left);
		pre(node.right);
	}
}

