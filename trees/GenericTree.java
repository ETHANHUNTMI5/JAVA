package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	private  class Node
	{
		int data;
		ArrayList<Node> children;
		
		Node(int data)
		{
			this.data=data;
			this.children= new ArrayList<>();
		}
		
		
	}
	
	private Node root;
	private int size;
	
	
	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(scn,null, 0);
		
		}
	
	private Node takeInput(Scanner scn ,Node parent , int ithchild )
	{
		if(parent==null)
		{
			System.out.println("Enter the data for root node");
			
		}
           
		else
		{
			System.out.println("Enter the data for the "+ithchild+"th child of "+parent.data);
			
		}
		
		int nodeData= scn.nextInt();
		Node node = new Node(nodeData);
		this.size++;
		System.out.println("Enter the no. of children for "+node.data);
		
		int children = scn.nextInt();
		
		for(int a=0;a<children;a++)
		{
			Node child= takeInput(scn, node, a);
			node.children.add(child);
		}
		
		
		return node;
	}
	
	public void display()
	{
		this.display(this.root);
	}
	
	private void display(Node node)
	{
		//node data
		String str = node.data+"=>";
		
		for(int i=0;i<node.children.size();i++)
		{str=str+node.children.get(i).data+", ";}
		
		str=str+"END";
	System.out.println(str);
	// display for all nodes
		for(int i=0;i<node.children.size();i++)
		{this.display(node.children.get(i));}
		
	}
	
}
