package a111;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class C1 {
	static class Pair
	{int val;
	Pair left;
	Pair right;
	
	Pair(int val,Pair left,Pair right)
	{
		this.val=val;
		this.left=left;
		this.right=right;}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		HashMap<Integer,Pair> map = new HashMap<>();
		Pair head=null;
		map.put(0,new Pair(0,null,null));
		head = map.get(0);
		for(int a=1;a<=n;a++)
		{
			char cc = s.charAt(a-1);
			Pair p = new Pair(a,null,null);
			
			
			if(cc=='L')
			{
			 	Pair prev = map.get(a-1);
			 	if(prev.left==null)
			 	{prev.left=p;
			 	p.right=prev;
			 	head=p;}
			 	else
			 	{
			 		Pair pp = prev.left;
			 		pp.right = p;
			 		p.left  =pp;
			 		p.right=prev;
			 		prev.left=p;
			 	}
				
			}
			else
			{
				Pair prev = map.get(a-1);
			 	if(prev.right==null)
			 	{prev.right=p;
			 	p.left=prev;
			 	p.right=null;
			 	}
			 	else
			 	{
			 		Pair pp = prev.right;
			 		pp.left = p;
			 		p.right  =pp;
			 		p.left=prev;
			 		prev.right=p;
			 	}
				
			
			
			}
			map.put(a,p);
		}
		Pair t = head;
		
		
		System.out.print(t.val+" ");
		t= t.right;
		while(t!=null)
		{
			System.out.print(t.val+" ");
			t = t.right;
		}
		
		
		
	}
}