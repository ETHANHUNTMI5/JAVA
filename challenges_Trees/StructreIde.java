package challenges_Trees;

import java.util.Scanner;



public class StructreIde {

	
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}

	}

	Node root = null;
	int size = 0;

	public StructreIde (){
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(scn, null, true);

	}

	public Node takeInput(Scanner scn, Node parent, boolean LeftOrRight) {
	
		int nodedata = scn.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean b = true;
		
		b = scn.nextBoolean();

		if (b) {
		   node.left=takeInput(scn, node, true);
			
		} else {
			node.left = null;

		}

		b = true;
		
		b = scn.nextBoolean();

		if (b) {
		   node.right=takeInput(scn, node, false);
			
		} else {
			node.right = null;

		}

		return node;

	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
          
		StructreIde tree1 = new StructreIde();
		StructreIde tree2 = new StructreIde();
		System.out.println(tree1.Identical(tree1.root, tree2.root));
	}

	
	public boolean Identical(Node root1 , Node root2)
	{
		if(root1==null && root2==null)
		{return true;}
		
		if(root1==null && root2!=null || root1!=null && root2==null)
		{return false;}
		
		
		if(root1.left==null && root2.left!=null)
		{return false;}
		
		if(root1.left!=null && root2.left==null)
		{return false;}
		
			
		
		boolean bl  = Identical(root1.left, root2.left);
		boolean br = Identical(root1.right, root2.right);
		
		if(bl&& br)
		{return true;}
		
		else
		{return false;}
	}
	
}
