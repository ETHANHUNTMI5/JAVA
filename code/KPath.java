package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import graphs.Graph;

import graphs.Graph.Vertex;


public class KPath {

	 public class Vertex
		{
			 HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
		}
		
		 HashMap<String, Vertex>vtces = new HashMap<String,Vertex>();


	 
		 public int numVertex()
		 {
			 return this.vtces.size();
		 }
		 public void addVertex(String vname)
		 {
			 Vertex vtx = new Vertex();
			 vtces.put(vname,vtx);
			 
		 }
		 public void removeVertex(String vname)
		 {
			 // get the vertex
			 Vertex vtx = vtces.get(vname);
	         
			 // visit all its nbrs and remove vname
			 ArrayList<String> keys = new ArrayList<String>(vtx.nbrs.keySet());
			 
			 for(String key : keys)
			 {
				 Vertex nbrvtx= vtces.get(key);
	            
				 nbrvtx.nbrs.remove(vname);
			 
			 }
			 
			 // finally remove vname
			 vtces.remove(vname);
		 }
		 public boolean containsVertex(String vname)
		 {
			 return this.vtces.containsKey(vname);
		 }
		 
		 public int numEdges()
		 {
			 int sum=0;
			 ArrayList<String> keys = new ArrayList<>(vtces.keySet());
			 
			 for(String s : keys)
			 {
				 sum+=vtces.get(s).nbrs.size();
			 }
			 
			 return sum/2;
		 }
		 
		 public boolean containsEdge(String vname1,String vname2)
		 {
			 Vertex vtx1 = vtces.get(vname1);
			 Vertex vtx2 = vtces.get(vname2);
			 
			 if(vtx1==null || vtx2==null ||!vtx1.nbrs.containsKey(vname2))
			 {return false;}
			 else
			 { return true;}
		 }
		 
		 public void addEdge(String vname1,String vname2,int cost)
		 {
			 Vertex vtx1 = vtces.get(vname1);//2k
			 Vertex vtx2 = vtces.get(vname2);//4k
			 
			 if(vtx1==null || vtx2==null ||vtx1.nbrs.containsKey(vname2))
			 {return ;}
			 
			 vtx1.nbrs.put(vname2,cost);//2k ke nbrs mai put C with given cost
			 vtx2.nbrs.put(vname1,cost);//4k ke nbrs mai put A with given cost
		 }
		 
		 public void removeEdge(String vname1,String vname2)
		 {
			 Vertex vtx1 = vtces.get(vname1);//2k
			 Vertex vtx2 = vtces.get(vname2);//4k
			 
			 if(vtx1==null || vtx2==null ||!vtx1.nbrs.containsKey(vname2))
			 {return ;}
			 
			 vtx1.nbrs.remove(vname2);//2k ke nbrs mai put C with given cost
			 vtx2.nbrs.remove(vname1);//4k ke nbrs mai put A with given cost
			 
		 }
		 public void display()
		 {
			 System.out.println("-----------");
			 ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			 
			 for(String s : keys)
			 {
				 Vertex vtx = vtces.get(s);
				 
				 System.out.println(s+"->"+vtx.nbrs);
			 }
			 System.out.println("-----------");
		 }
		 private class Pair
		 {
			String vname;
			String psf;
		 }
		
		 
		 public boolean hasPath(String vname1,String vname2,HashMap<String, Boolean>map)
		 {
			 map.put(vname1,true);
			 // direct edge
			 if(containsEdge(vname1, vname2))
			 {return true;}
			 
			 Vertex vtx = this.vtces.get(vname1);
			 
			 ArrayList<String> nbrs = new ArrayList<String>(vtx.nbrs.keySet());
			 
			 for(String s : nbrs)
			 {
				 // to prevent stack overflow
				 if(!map.containsKey(s) &&   hasPath(s, vname2,map))
				 {return true;}
			 }
			 
			 
			 return false;
			 
			 
			 
			 
		 }
		 public boolean dfs(String src,String des)
		 {
			 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
			 
			 LinkedList<Pair> stack = new LinkedList<Pair>();
			
			 // create a new Pair
			 Pair sp = new Pair();
			 sp.vname=src;
			 sp.psf= src;
			 
			 // put the new pair in queue
			 stack.addLast(sp);
			 
			 // till queue is not empty keep on doing the work
			 while(!stack.isEmpty())
			 {
				// remove a pair from queue
				 Pair rp= stack.removeFirst();
				 
				 // for cases like C from 2 diff paths
				 if(map.containsKey(rp.vname))
				 {continue;}
				// put in hashmap 
				 map.put(rp.vname,true);
				 
				//check direct edge
	            if(containsEdge(rp.vname, des))
	            {
	            	System.out.println(rp.psf+des);
	            	return true;
	            }
	            // nbrs

	            Vertex rpvtx = vtces.get(rp.vname);
	            
	            ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());
			 
			 
	            for(String s : nbrs)
	            {
	            	// process only those which are not present
	            	if(!map.containsKey(s))
	            	{
	            		// make a new pair and put in queue
	            		Pair np = new Pair();
	            		np.vname=s;
	            		np.psf=rp.psf+s;
	            		
	            		stack.addFirst(np);
	            	}
	            }
			 
			 }
			return false;
			 
		 }
		 

	
	
	public static void main(String[] args) {
		KPath graph = new KPath();
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			for(int a=1;a<=n;a++)
			{
				graph.addVertex(a+"");
			}
			
			
			for(int a=1;a<=n-1;a++)
			{
				int s = scn.nextInt();
				int e = scn.nextInt();
				
				graph.addEdge(s+"", e+"", 0);
			}
			
			graph.display();
			
			
			int m = scn.nextInt();
			
			for(int l=1;l<=m;l++)
			{
				int t2 = scn.nextInt();
				ArrayList<Integer> ll = new ArrayList<Integer>();
				for(int l2 = 0;l2<t2;l2++)
				{
					ll.add(scn.nextInt());
					
				}
				
				for(int a=0;a<ll.size();a++)
				{
				
				}
				System.out.println(ll);
			}
			
		}
		
		
	}
	

}
