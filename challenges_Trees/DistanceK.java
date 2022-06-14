package challenges_Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class DistanceK {

	private class Node {
		int data;
		Node left;
		Node right;


	}

	Node root = null;
	int size = 0;

	public DistanceK(int [] pre , int [] in) {
		    
	}

	
	
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] pre= new int[n];
		int [] in = new int [n];
		
		for(int a=0;a<n;a++)
		{pre[a]=scn.nextInt();}
		
		for(int b=0;b<n;b++)
		{in[b]=scn.nextInt();}
		
		DistanceK tree = new DistanceK(pre, in);
		tree.root=tree.fill(pre, in, 0, pre.length-1, 0, in.length-1);
	
		int t = scn.nextInt();
		
		for(int c=1;c<=t;c++)
		{
			int num = scn.nextInt();
			int k = scn.nextInt();
		}
		
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

	public void Dis(Node node , int k , int data,Node nn)
	{
		if(node==null)
		{return;}
		
		if(data==node.data)
		{nn=node;
		ArrayList<Integer > ans = new ArrayList<Integer>();
		
		
		
		}
		
		else
		{
			Dis(node.left, k, data,nn);
			Dis(node.right, k, data,nn);
		}
		
	}
	
	
}
