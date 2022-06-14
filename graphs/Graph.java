package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;






public class Graph {

	 public class Vertex
	{
		 HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
	}
	
	 HashMap<String, Vertex>vtces = new HashMap<String, Graph.Vertex>();


 
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
	 private class Pair
	 {
		String vname;
		String psf;
	 }
	 
	 // T=2E +V--> T(0)=(E+V)   
	 // E --NO. OF EDGES  V -- NO.OF VERTICES
	 public boolean bfs(String src,String des)// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		
		 // create a new Pair
		 Pair sp = new Pair();
		 sp.vname=src;
		 sp.psf= src;
		 
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
            		
            		queue.addLast(np);
            	}
            }
		 
		 }
		return false;
		 
	 }
	 
	 public boolean dfs(String src,String des)
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> stack = new LinkedList<Graph.Pair>();
		
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
	 
	 
	 public ArrayList<ArrayList<String>> getALL()// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> queue = new LinkedList<Pair>();
		
		 ArrayList<ArrayList<String>> ll = new ArrayList<ArrayList<String>>();
		 
		 ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
		
		 // for every node repeat the process
		 for(String key:keys)
		 // create a new Pair
		 { 
			 
		if(map.containsKey(key))
		 {continue;}

		ArrayList<String > sans = new ArrayList<String>();	 
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
           
           ArrayList<String> nbrs = new ArrayList<String>(rpvtx.nbrs.keySet());
		 
		 
           for(String s : nbrs)
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
	 
	 public void bft()// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		
		 ArrayList<String > keys = new ArrayList<String>(vtces.keySet());
		
		 // for every node repeat the process
		 for(String key:keys)
		 // create a new Pair
		 { 
		if(map.containsKey(key))
		 {continue;}

			 
		 Pair sp = new Pair();
		 sp.vname=key;
		 sp.psf= key;
		 
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
           
			 System.out.println(rp.vname+" via "+rp.psf);
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
            		
            		queue.addLast(np);
            	}
            }
		 
		
		 }}
		 
	 }
	 
	 public void dft()// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> stack = new LinkedList<Graph.Pair>();
		
		 ArrayList<String > keys = new ArrayList<String>(vtces.keySet());
		
		 // for every node repeat the process
		 for(String key:keys)
		 // create a new Pair
		 { 
		if(map.containsKey(key))
		 {continue;}

			 
	     Pair sp = new Pair();
		 sp.vname=key;
		 sp.psf= key;
		 
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
           
			 System.out.println(rp.vname+" via "+rp.psf);
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
		 
		
		 }}
		 
	 }
	 
	 
	 public boolean isConnected()// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 
		 LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		
		 int count=0;
		 ArrayList<String > keys = new ArrayList<String>(vtces.keySet());
		
		 // for every node repeat the process
		 for(String key:keys)
		 // create a new Pair
		 { 
		if(map.containsKey(key))
		 {continue;}

		count++;
			 
		 Pair sp = new Pair();
		 sp.vname=key;
		 sp.psf= key;
		 
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
           
			 //System.out.println(rp.vname+" via "+rp.psf);
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
            		
            		queue.addLast(np);
            	}
            }
		 
		
		 }}
		 if(count==1)
		 {return true;}
		 else
		 {return false;}
		 
	 }
	 public boolean isCyclic()// shortest path
	 {
		 HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		 
		 LinkedList<Pair> queue = new LinkedList<Graph.Pair>();
		
		 ArrayList<String > keys = new ArrayList<String>(vtces.keySet());
		
		 // for every node repeat the process
		 for(String key:keys)
		 // create a new Pair
		 { 
		if(map.containsKey(key))
		 {continue;}

			 
		 Pair sp = new Pair();
		 sp.vname=key;
		 sp.psf= key;
		 
		 // put the new pair in queue
		 queue.addLast(sp);
		 
		 // till queue is not empty keep on doing the work
		 while(!queue.isEmpty())
		 {
			// remove a pair from queue
			 Pair rp= queue.removeFirst();
			 
			 // for cases like C from 2 diff paths
			 if(map.containsKey(rp.vname))
			 {return true;}
			// put in hashmap 
			 map.put(rp.vname,true);
			 
			//check direct edge
           
			 //System.out.println(rp.vname+" via "+rp.psf);
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
            		
            		queue.addLast(np);
            	}
            }
		 
		
		 }}
		 
	 
	 return false;}
	
	 public boolean isTREE()
	 {// tree is non cyclic and connected graph
		return !isCyclic() && isConnected(); 
	 }	 
	 
	 public class DisJointSet
	 {
		HashMap<String, Node> map = new HashMap<String, Graph.DisJointSet.Node>();
		 private class Node
		 {
			 String data;
			 Node parent;
			 int rank;
		 }
		 public void create(String value)
		 {
			 Node nn = new Node();
			 nn.data= value;
			 nn.parent=nn;
			 nn.rank=0;
			 map.put(value,nn);
		 }
		 
	     public void union(String value1,String value2)
	     {
	    	 Node n1 = map.get(value1);
	    	 Node n2 = map.get(value2);
	    	 
	    	 Node rep1= find(n1);
	    	 Node rep2= find(n2);

	           if(rep1.data==rep2.data)
	           {return;}
	     
	     
	           if(rep1.rank==rep2.rank)
	           {
	        	   rep2.parent= rep1;
	        	   rep1.rank++;
	        	   
	           }
	           
	           else if(rep1.rank>rep2.rank)
	           {
	        	   rep2.parent=rep1;
	           }
	           else
	           {
	        	   rep1.parent=rep2;
	           }
	     }
	     
	     public String find(String value)
	     {
	    	 return this.find(map.get(value)).data;
	    	 
	    	 
	     }
		 
	     private Node find(Node node)
	     {
	    	 if(node==node.parent)
	    	 {return node;}
	    	
	    	 Node rr =find(node.parent);
	    	 node.parent=rr; // path compression
	    	 return rr;
	     }
		 
		 
	 }


	 public ArrayList<EdgePair> getAll()
	 {
		 ArrayList<EdgePair> edges = new ArrayList<Graph.EdgePair>();
		 
		 for(String vname : vtces.keySet())
		 {
			 Vertex vtx = vtces.get(vname);
			 
			 for(String nbr: vtx.nbrs.keySet())
			 {
				 
				 EdgePair ep = new EdgePair();
				 ep.cost=vtx.nbrs.get(nbr);
				 ep.v1=vname;
				 ep.v2=nbr;
				 
				 edges.add(ep);
			 }
			 
		 }
		return edges;
		 
		 
	 }
 private class EdgePair implements Comparable<EdgePair>
 {
	String v1;
	String v2;
	int cost;
	@Override
	public int compareTo(EdgePair o) {
		
		return this.cost-o.cost;
	}
    @Override
	public String toString()
	{
		return v1+" - "+v2+" : "+cost;}
 }
 public void Kruskal()
 {
	 // sort the edges in increasing order
	 ArrayList<EdgePair> edges = getAll();
	 Collections.sort(edges);
	 System.out.println(edges);
	 
	 // first make an obj of disjoint set
    
	 DisJointSet set = new DisJointSet();
	 
	 // create vertices no. of set
	 for(String vname : vtces.keySet())
	 {
		 set.create(vname);
	 }
	 // traverse over the edges
	 for(EdgePair edge : edges)
	 {
		 String re1 = set.find(edge.v1);
		 String re2 = set.find(edge.v2);
		 
		 // representative element same :: ignore
		 if(re2.equals(re1))
		 {continue;}
		 
		 else
		 {System.out.println(edge);
			 set.union(edge.v1, edge.v2);}
	 }
 }
 
 // PRIMS --> T(0)= (Elog(V))
 
 
//PRIMS ALGORITHM
		private class PrimsPair implements Comparable<PrimsPair>{
			String vname;
			String acqname;
			int cost;
			@Override
			public int compareTo(PrimsPair other) {
				
				return other.cost - this.cost;
			}
			
			@Override
			public String toString() {
			
				return vname + " -- " + acqname + " : " + cost;
			}
			
		}
		
		public Graph prims()
		{
			Graph mst = new Graph();
			HashMap<String , PrimsPair> map = new HashMap<>();
			GenericHeap<PrimsPair> heap= new GenericHeap<>();
			
			// Creating Hashmap and heap
			for(String key : vtces.keySet())
			{
				PrimsPair np = new PrimsPair();
				np.vname = key;
				np.acqname = null;
				np.cost = 100000;
				
				heap.add(np);
				map.put(key , np);
			}
			
			// till the heap is not empty
			while(! heap.isEmpty())
			{
				// remove a pair
				heap.display();
				PrimsPair rp = heap.remove();
				
				map.remove(rp.vname);
				
				// adding vertices to mst
				// 1st vertex --> only vertex and no edge
				if( rp.acqname == null)
				{
					mst.addVertex(rp.vname);
				}
				else
				{
					mst.addVertex(rp.vname);
					mst.addEdge(rp.vname, rp.acqname, rp.cost);
				}
				
				System.out.println(rp.vname + " : " + vtces.get(rp.vname).nbrs.keySet());
				// nbrs
				for(String nbr : vtces.get(rp.vname).nbrs.keySet())
				{
					// if nbr is present in the hashmap and the heap then do the work
					if( map.containsKey(nbr))
					{
						
						// get the old and new cost
						int oc = map.get(nbr).cost;
						int nc = vtces.get(rp.vname).nbrs.get(nbr);
						
						
						// update the pair
						if( nc < oc)
						{
							PrimsPair gp = map.get(nbr);
							gp.acqname = rp.vname;
							gp.cost = nc;
							
							heap.updatePriority(gp);
						}
					}
				}
				
			}
			
			return mst;
		}


 private class DijkstraPair implements Comparable<DijkstraPair>
 {
	 String vname;
	 String psf;
	 int cost;
	@Override
	public int compareTo(DijkstraPair o) {
		
		return this.cost-o.cost;
	}
	 
 }
 
 public HashMap<String , Integer> dijkstra(String src)
 {
 HashMap<String, Integer> ans = new HashMap<String,Integer>();
 HashMap<String, DijkstraPair> map = new HashMap<String,DijkstraPair>();
	
 GHeap<DijkstraPair> heap = new GHeap<DijkstraPair>();
 
 // create a DijkstraPair for each vertex and add in heap and map
 
 for(String key : vtces.keySet())
 {
	
	 DijkstraPair np = new DijkstraPair();
	 np.vname=key;
	 np.cost= 100000;
	 np.psf= "";
	 
	 if(key.equals(src))
	 {
		 np.cost=0;
		 np.psf=key;
		 
	 }
	 
	// System.out.println(key +" " +np.cost);
	 heap.add(np);
	 map.put(key,np);
} 

heap.display();
 // remove elements form heap and add them in mst
 
 // till heap is not empty keep on removing the pairs
 //System.out.println(")))))))))");
 while(!heap.isEmpty())
 {
	 // remove a pair
	 DijkstraPair rp = heap.remove();
	 
	 map.remove(rp.vname);
	
	 
	 // add to ans
	 ans.put(rp.vname,rp.cost);
	// System.out.println(ans);
	 // nbrs
	 
	 for(String nbr : vtces.get(rp.vname).nbrs.keySet())
	 {
		 // work for nbrs which are in heap
		 if(map.containsKey(nbr))
		 { 
			// get the old and new cost 
		   int oc= map.get(nbr).cost;
		   int nc= rp.cost+vtces.get(rp.vname).nbrs.get(nbr);
			
		   // update only when nc<oc.
		   if(nc<oc)
		   {
			   // update acvname and cost
			  DijkstraPair gp = map.get(nbr);
              gp.psf= rp.psf+nbr;
              gp.cost= nc;
			  
             heap.updatePrior(gp);
		   }
		 }
		 
	 }
 }
 
 
 
 
 
 
 
 
 return ans;}
 
 public HashMap<String, Integer> bellmanFord(String src) throws Exception
 {
	ArrayList<EdgePair> edges = getAll();
	 HashMap<String, Integer> map = new HashMap<String, Integer>();
	 
	 // fill hashmap with infinity for all other vertices and 0 for src
	 for(String vname: vtces.keySet())
	 {
		 map.put(vname,10000);
		 
		 if(src.equals(vname))
		 {map.put(vname,0);}
		 
	 }
	 
	 int V = vtces.size();
	 // relax every edge V-1 times
	for(int i =1;i<=V;i++)
	{
		// loop on edges
		for(EdgePair edge : edges)
		{
			int oc = map.get(edge.v2);
			int nc = map.get(edge.v1)+edge.cost;
		
		if(nc<oc)
		{
			if(i<=V-1)
			{map.put(edge.v2,nc);}
		  
		else
		{throw new Exception("-ve weight cycle ");}
		      
		}
	}
	
 }
	return map;
	 
}
}