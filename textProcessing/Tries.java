package textProcessing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {

	public class Node
	{
		char data;
		HashMap<Character, Node> children;
		boolean isTerminal;
		
		 Node(char data,boolean isTerminal) {
	        
			this.data= data;
		    this.children= new HashMap<Character, Node>();
		    this.isTerminal= isTerminal;
			
		}
	}
	private Node root;
	private int NumWords;

	public Tries() {
	  this.root=new Node('\0', false);
	  this.NumWords=0;
	}
	
	public int Numwords()
	{
		return this.NumWords;
	}
	public void AddWord(String s )
	{
		this.AddWord(this.root, s);
	}
	private void AddWord(Node Parent,String s)
	{
		if(s.length()==0)
		{
			if(Parent.isTerminal)
			{
				// word already exists
			}
			else
			{
				this.NumWords++;
				Parent.isTerminal=true;
			}
			return;
		}
		
		char cc = s.charAt(0);
		String ros= s.substring(1);
		Node child = Parent.children.get(cc);
		
		if(child == null)
		{
			child = new Node(cc,false);
			Parent.children.put(cc,child);
		}
		
		this.AddWord(child, ros);
		
		
		
		}
	public void display()
	{
		this.display(this.root, "");
	}
	private void display(Node node,String osf)
	{
		if(node.isTerminal)
		{
			String ans = osf.substring(1)+node.data;
			
			System.out.println(ans);
		}
		Set<Map.Entry<Character, Node>> entries =node.children.entrySet();
		for(Map.Entry<Character, Node> entry : entries)
		{
		
			this.display(entry.getValue(), osf+node.data);
		}
		
	}
	
	// Search a word
	
	public boolean Search(String s2)
	{
 		return this.Search(this.root, s2);
	}
	private boolean Search(Node parent , String s2)
	{
		if(s2.length()==0)
		{
		return parent.isTerminal;
		}
		
		char cc = s2.charAt(0);
		String ros = s2.substring(1);
		
		Node child = parent.children.get(cc);
		
		if(child==null)
		{return false;}
		
		return this.Search(child, ros);
		
		
	}
	public void remove(String word)
	{
		this.remove(this.root, word);
	}
	private void remove(Node parent,String word)
	{
		if(word.length()==0)
		{
			if(parent.isTerminal)
			{
				parent.isTerminal= false;
				this.NumWords--;
			}
			else
			{// not a word just part of another word}
			}
			
		return;}
		
		char cc = word.charAt(0);
		String ros = word.substring(1);
		
		Node child = parent.children.get(cc);
		
		if(child==null)
		{return;}
		
		this.remove(child, ros);
		
		if(!child.isTerminal && child.children.size()==0)
		{
			parent.children.remove(cc);
		}
	}
	
}
