package challenges_Trees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class SumAtK {
public static Scanner scn = new Scanner(System.in);
	private class Node
	{
		int data;
		ArrayList<Node > children = new ArrayList<Node>();
		
		
	}
	
	private Node root;
	private int size;
	public static void main(String[] args) {
	
		SumAtK tree = new SumAtK();
		
		tree.root=tree.takeInput(null);
		
		int k = scn.nextInt();
		tree.AnsFinal(tree.root, k);
				
		
	}
	
	public Node takeInput(Node parent)
	{
		
		int nodedata= scn.nextInt();
		Node nn = new Node();
		nn.data=nodedata;
		
		int num= scn.nextInt();
		
		for(int a=0;a<num;a++)
		{
			nn.children.add(takeInput(nn));
			
		}
		
		return nn;
	}

	public void AnsFinal(Node node , int k)
	{
		int level=0;
		
		Stack<Node > ms = new Stack<SumAtK.Node>();
		Stack<Node > cs = new Stack<SumAtK.Node>();
		ms.add(node);
		int sum=0;
		while(!ms.isEmpty())
		{
			Node temp = ms.pop();
			
			if(level==k)
			{sum=temp.data+sum;}
			
			for(int a=0;a<temp.children.size();a++)
			{
				cs.add(temp.children.get(a));
			}
			
			
			if(ms.size()==0)
            {
            	ms=cs;
            	cs= new Stack<SumAtK.Node>();
            	level++;
            }
			
		}
		System.out.println(sum);
	}
}