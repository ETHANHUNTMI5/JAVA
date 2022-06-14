package challengesHashAndTries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import textProcessing.Tries.Node;

public class DigitalDict {

	
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

	public DigitalDict() {
	  this.root=new Node('\0', false);
	  this.NumWords=0;
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
	
	private void display(Node node,String osf,String q)
	{
		if(node.isTerminal)
		{
			String ans =  q.substring(0,q.length()-1)+osf+node.data;
			
			System.out.println(ans);
		}
		Set<Map.Entry<Character, Node>> entries =node.children.entrySet();
		for(Map.Entry<Character, Node> entry : entries)
		{
		
			this.display(entry.getValue(), osf+node.data,q);
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
		return true;
		}
		
		char cc = s2.charAt(0);
		String ros = s2.substring(1);
		
		Node child = parent.children.get(cc);
		
		if(child==null)
		{return false;}
		
		return this.Search(child, ros);
		
		
}
 public void DD(Node parent,String s,String q)
 {
	 if(s.length()==0)
	 {display(parent,"",q);
	 return;}
	 
	 char cc = s.charAt(0);
	 String ros= s.substring(1);
	 
	 Node child = parent.children.get(cc);
		 DD(child, ros,q);
	 
 }
	

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		DigitalDict list = new DigitalDict();
		
		
		for(int a=0;a<n;a++)
		{
			list.AddWord(scn.nextLine());
		}
	       int m = scn.nextInt();
		 scn.nextLine();
		 
		for(int b=0;b<m;b++)
		{
			String s2 = scn.nextLine();
	    
			if(list.Search(s2))
			{
				
				list.DD(list.root, s2,s2);
			}
			else
			{list.AddWord(s2);
			System.out.println("No suggestions");}
		
		}
	}
	


}
