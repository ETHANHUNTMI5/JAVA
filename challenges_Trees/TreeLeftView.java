package challenges_Trees;

import java.util.Scanner;

public class TreeLeftView {
public static Scanner scn = new Scanner(System.in);
	private class Node
	{int data;
	Node left;
	Node right;}
	
	private Node root;
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		TreeLeftView tree = new TreeLeftView();
		
		

	}
	public Node Build(Node parent, boolean ilc)
	{
		Node nn = new Node();
		int nodeData= scn.nextInt();
		
		if(nodeData!=-1)
		{	nn.data= nodeData;}
		else
		{nn=null;}
		
		nn.left=Build(parent, true);
		nn.right=Build(nn, false);
		
		return nn;
	}

}
