package aatCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;


public class D3 {
static class Pair{
	int row;
	int col;
	
	
}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int w = scn.nextInt();
		
		int n = scn.nextInt();
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> cols = new ArrayList<Integer>();
		TreeMap<Integer, Pair> map = new TreeMap<Integer, D3.Pair>();
		ArrayList<Pair> pp = new ArrayList<D3.Pair>();
		
		for(int a=0;a<n;a++)
		{
			
			rows.add(scn.nextInt());
			cols.add(scn.nextInt());
			Pair p = new Pair();
			p.row=rows.get(a);
			p.col=cols.get(a);
			pp.add(p);
			map.put(a,p);
		
		}
		
		Collections.sort(rows);
		Collections.sort(cols);
		
		
		
		Collections.sort(pp , new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
			
				if(o1.row!=o2.row)
				return o1.row-o2.row;
				
				else
				{
					return o1.col-o2.col;
				}
			}

			
		});
		
		
		
		
		
		
		Stack<Pair> stack = new Stack<Pair>();
		
		int a=1;
		
		stack.push(pp.get(0));
		
		for(int b=1;b<n;b++)
		{
		
		  if(!stack.isEmpty() && stack.peek().row==pp.get(b).row)
		  {
			  stack.push(pp.get(b));
			
		  }
		
		  else
		  {
			  while(!stack.isEmpty())
			  {
				  Pair gp = stack.pop();
				  gp.row=a;
			  }
			  
			  stack.push(pp.get(b));
		  
			  a++;}
	
		  
		}
	
		
		while(!stack.isEmpty())
		{
			Pair ppa = stack.pop();
			ppa.row=a;
		}
		
		
		
		Collections.sort(pp , new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
			
				if(o1.col!=o2.col)
				return o1.col-o2.col;
				
				else
				{
					return o1.row-o2.row;
				}
			}

			
		});
	
		
		
		Stack<Pair> stack2 = new Stack<Pair>();
		
		int ab=1;
		
		stack2.push(pp.get(0));
		
		for(int b=1;b<n;b++)
		{
		
		  if(!stack2.isEmpty()&& stack2.peek().col==pp.get(b).col)
		  {
			  stack2.push(pp.get(b));
		  }
		
		  else
		  {
			  while(!stack2.isEmpty())
			  {
				  Pair gp = stack2.pop();
				  gp.col=ab;
			  }
			  
			  stack2.push(pp.get(b));
		  ab++;}
	
		  
		}
		
		while(!stack2.isEmpty())
		{
			Pair ppa = stack2.pop();
			ppa.col=ab;
		}
		
		for(int x=0;x<map.size();x++)
		{
			System.out.println(map.get(x).row+" "+map.get(x).col);
		}
		
	}

}
