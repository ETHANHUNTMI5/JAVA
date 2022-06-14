package challenges_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import graphs.Graph.Vertex;


public class SP {

	
	public class Vertex
	{
		HashMap<Integer, Integer> nbrs = new HashMap<Integer, Integer>();
	}
	
	
	HashMap<Integer , Vertex> vtces = new HashMap<Integer, Vertex>();
	
	
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
			vtx1.nbrs.put(vnum2,6);
			vtx2.nbrs.put(vnum1,6);
			
		}
		
	}
	
	private class Pair
	{
		int vnum;
		int psf;
	}
	
	 public int bsf(int vnum1,int vnum2)
	 {
		 HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		 
		 LinkedList<Pair> queue = new LinkedList<Pair>();
		 
		 Pair sp = new Pair();
		 sp.vnum=vnum1;
		 sp.psf=0;
		 
		 
		 
		 queue.addLast(sp);
		 while(!queue.isEmpty())
		 {
			 Pair rp = queue.removeFirst();
			 
			 if(map.containsKey(rp.vnum))
			 {continue;}
			 
			 map.put(rp.vnum,true);
			 
			 //de
			 if(containsEdge(rp.vnum, vnum2))
			 {
				 return rp.psf+6;
			 }
			
			 // nbrs

			  Vertex rpvtx = this.vtces.get(rp.vnum);
			  
			  ArrayList<Integer> nbrs = new ArrayList<Integer>(rpvtx.nbrs.keySet());
			  
			  for(int i :nbrs)
			  {
				  if(!map.containsKey(i))
				  { 
				Pair np = new Pair();
				np.vnum=i;
				np.psf = rp.psf+6;
				
				queue.addLast(np);
				
				  }
				  
			  }
			 
		 }
		 
		 
		 
		 
	 return -1;}
	
	 public boolean containsEdge(int vname1,int vname2)
	 {
		 Vertex vtx1 = vtces.get(vname1);
		 Vertex vtx2 = vtces.get(vname2);
		 
		 if(vtx1==null || vtx2==null ||!vtx1.nbrs.containsKey(vname2))
		 {return false;}
		 else
		 { return true;}
	 }
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
            SP graph = new 	SP();
			int n = scn.nextInt();
			for(int i=1;i<=n;i++)
			{
				graph.addVertex(i);
			}
			int m = scn.nextInt();
			
			for(int j=1;j<=m;j++)
			{
				int x = scn.nextInt();
				int y = scn.nextInt();
				graph.addEdge(x,y);
			}
			
		  int head = scn.nextInt();
		  
		  for(int i =1;i<=n;i++)
		  {
			  if(i==head)
			  {continue;}
			  else
			  {
				System.out.print(graph.bsf(head, i)+" ");  
			  }
			  
		  }
		
		
		}
		
	}

}
