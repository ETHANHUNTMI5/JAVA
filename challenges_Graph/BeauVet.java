package challenges_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import challenges_Graph.Pairing.Vertex;


public class BeauVet {

	
		public class Vertex
		{
			HashMap<Integer, Integer> nbrs = new HashMap<Integer, Integer>();
			
		}
		
		HashMap<Integer, Vertex> vtces = new HashMap<Integer, Vertex>();
		
		public void addVertex(int vnum)
		{
			Vertex vtx = new Vertex();
			this.vtces.put(vnum, vtx);
			
		}
		public void addEdge(int vnum1,int vnum2)
		{
			Vertex vtx1 = this.vtces.get(vnum1);
			Vertex vtx2 = this.vtces.get(vnum2);
			
			if(vtx1==null || vtx2 == null)
			{return;}
			
			else
			{
				vtx1.nbrs.put(vnum2,1);
				vtx2.nbrs.put(vnum1,1);
				
			}
			
		}
	
		 private class Pair
		 {
			int vname;
			String psf;
		 }
		public ArrayList<ArrayList<Integer>> bft()// shortest path
		 {
			 HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
			 
			 LinkedList<Pair> queue = new LinkedList<Pair>();
			
			 ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
			 
			 ArrayList<Integer > keys = new ArrayList<Integer>(vtces.keySet());
			
			 // for every node repeat the process
			 for(int key:keys)
			 // create a new Pair
			 { 
			if(map.containsKey(key))
			 {continue;}

			ArrayList<Integer > sans = new ArrayList<Integer>();	 
			 Pair sp = new Pair();
			 sp.vname=key;
			 
			 // put the new pair in queue
			 queue.addLast(sp);
			 
			 // till queue is not empty keep on doing the work
			 while(!queue.isEmpty())
			 {
				// remove a pair from queue
				 Pair rp= queue.removeFirst();
				 
				 // for cases like C from 2 diff paths
				 if(map.containsKey(rp.vname))
				 {continue;}
				 
				// put in hashmap 
				 map.put(rp.vname,true);
				 
				//check direct edge
	          
				 
				// System.out.println(rp.vname+" via "+rp.psf);
				 sans.add(rp.vname);
	           // nbrs

	           Vertex rpvtx = vtces.get(rp.vname);
	           
	           ArrayList<Integer> nbrs = new ArrayList<Integer>(rpvtx.nbrs.keySet());
			 
			 
	           for(int s : nbrs)
	           {
	           	// process only those which are not present
	           	if(!map.containsKey(s))
	           	{
	           		// make a new pair and put in queue
	           		Pair np = new Pair();
	           		np.vname=s;
	           		
	           		queue.addLast(np);
	           	}
	           }
			 
			
			}
			 ll.add(sans) ;
			 }
			return ll;
			 
		 }
		
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	BeauVet gg = new BeauVet();
	
	for(int a=1;a<=n;a++)
	{
		gg.addVertex(a);
		
	}
	int m = scn.nextInt();
	
	for(int a=0;a<m;a++)
	{
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		gg.addEdge(x, y);
	}

	 ArrayList<ArrayList<Integer>> ll = gg.bft();
	 int x = ll.size();
	 int count=0;
	 ArrayList<Integer> arr = new ArrayList<Integer>();
	 int max=0;
	 for(int a=0;a<x;a++)
	 {
		 
		 arr= ll.get(a);
		 System.out.println(arr);
		 Vertex vtx = gg.vtces.get(arr.get(0));
		 
		 max=vtx.nbrs.size();
		 
		 for(int b=1;b<arr.size();b++)
		 {
			 int p =gg.vtces.get(arr.get(b)).nbrs.size();
			 if(p>max)
			 {
				
				 ArrayList<Integer > pok = new ArrayList<Integer>(gg.vtces.get(arr.get(b)).nbrs.keySet());
				 
				 for(int l:pok)
				 {
					 if(l<arr.get(b))
					 {p--;}
				 }
				 
				 if(p>max)
				 { 
				 count=count+1;}
			 }
		 }
		 
		 
	 }
	 
	System.out.println(count);
    
	}

}
