package challenges_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;




public class Pairing {

	public class Vertex
	{
		HashMap<Integer , Integer> nbrs = new HashMap<Integer, Integer>();
		
		
	}
	HashMap<Integer , Vertex> vtces = new HashMap<Integer, Pairing.Vertex>();
	
	
	public void addVertex(int x)
	{
		Vertex vtx = new Vertex();
		
		this.vtces.put(x,vtx);
	}
	
	public void addEdge(int x , int y)
	{
		
		Vertex v1 = vtces.get(x);
		Vertex v2 = vtces.get(y);
		
		if(v1==null || v2==null)
		{return;}
		
		v1.nbrs.put(y,1);
		v2.nbrs.put(x,1);
	}
	
	private class Pair
	{
		int vname;
		
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
		int m = scn.nextInt();
		
		Pairing pp = new Pairing();
		for(int a=0;a<n;a++)
		{
			pp.addVertex(a);
		}
		
		for(int a=0;a<m;a++)
		{
			int x= scn.nextInt();
			int y = scn.nextInt();
			pp.addEdge(x, y);
		}
	
		ArrayList<ArrayList<Integer>> ans = pp.bft();
		
		int s = ans.size();
	
		int [] arr = new int[s];
		
		for(int a=0;a<s;a++)
		{arr[a]=ans.get(a).size();}

		int sum=0;
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				sum = sum+arr[i]*arr[j];
				
			}
		}
	System.out.println(sum);
	}

}
