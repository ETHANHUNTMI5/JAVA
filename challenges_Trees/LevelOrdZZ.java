package challenges_Trees;

import java.util.Scanner;
import java.util.Stack;

public class LevelOrdZZ {
	public static int count = 0, a = 0, b = 0;
	public static Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	private int size;

	public static void main(String[] args) {
		LevelOrdZZ tree = new LevelOrdZZ();
		tree.root = tree.takeInput(null);
		tree.ZigZag(tree.root);

	}

	public Node takeInput(Node parent) {
		int data = scn.nextInt();
		Node nn = new Node();
		nn.data = data;

		boolean lc = scn.nextBoolean();

		if (lc) {
			nn.left = takeInput(nn);
		} else {
			nn.left = null;
		}

		boolean rc = scn.nextBoolean();

		if (rc) {
			nn.right = takeInput(nn);
		} else {
			nn.right = null;
		}

		return nn;
	}

	public void ZigZag(Node node)
	{
       	Stack<Node > ms = new Stack<Node>();
       	Stack<Node > cs = new Stack<Node>();
				
       	int level=1;
       	
       	
       	ms.add(node);
       	
       	while(!ms.isEmpty())
       	{
       		Node temp = ms.pop();
       		System.out.print(temp.data+" ");
       		
       		if(level%2==0)
       		{
       			if(temp.right!=null)
       			{
       				cs.add(temp.right);
       			}
       			
       			if(temp.left!=null)
       			{
       				cs.add(temp.left);
       			}
       		}
       		
       		else
       		{
       			if(temp.left!=null)
       			{
       				cs.add(temp.left);
       			}
       			if(temp.right!=null)
       			{
       				cs.add(temp.right);
       			}
       			
       		}
       		
        if(ms.size()==0)
        {
        	ms=cs;
        	cs= new Stack<Node>();
        	level++;
        }
       
       		
       	}
       	
	}
}
