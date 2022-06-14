package challenges_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class LeftView {
public static int maxlevel=0;
	
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
		LeftView tree = new LeftView();
		
		tree.root=tree.takeInput(scn);
		
		tree.topVl(tree.root);
        tree.topVr(tree.root.right);   
		
		
	}

	
	public Node takeInput(Scanner scn)
	{
		Queue<Node> q = new LinkedList<Node>();
		
		int data = scn.nextInt();
		Node nn = new Node();
		
		if(data==-1)
		{return null;}
		
		else
		nn.data=data;
		
		q.add(nn);
		
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			
			if(scn.hasNext())
			{
				data= scn.nextInt();
			}
			
			else
			{break;}
			
			if(data!=-1)
			{
				Node nl = new Node();
				temp.left=nl;
				nl.data=data;
				q.add(nl);
				
			}
			
			if(scn.hasNext())
			{
				data= scn.nextInt();
			}
			
			else
			{break;}
			
			if(data!=-1)
			{
				Node nr = new Node();
				temp.right=nr;
				nr.data=data;
				q.add(nr);
				
			}
			
		}
		return nn;
			
	}
	
	public void leftV(Node nn,int level)
	{
		
		if(nn== null)
		{return;}
		
		if(maxlevel<level)
		{System.out.print(nn.data+" ");
		
		maxlevel = level;}
		
		

	  leftV(nn.left, level+1);
	  leftV(nn.right, level+1);
		
		
		
	}
	
	public void rightV(Node nn,int level)
	{
		
		if(nn== null)
		{return;}
		
		if(maxlevel<level)
		{System.out.print(nn.data+" ");
		maxlevel = level;}
		
		

	  rightV(nn.right, level+1);
	  rightV(nn.left, level+1);
		
		
		
	}
	
	public void topVl(Node nn)
	{
		if(nn==null)
		{return;}
		topVl(nn.left);
		
		System.out.print(nn.data+" ");
		
		
		
		
	}
	
	public void topVr(Node nn)
	{
		if(nn== null)
		{return;}
		
		System.out.print(nn.data+" ");
		topVr(nn.right);
		
	}
}
