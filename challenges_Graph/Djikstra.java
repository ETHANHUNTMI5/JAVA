package challenges_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import graphs.GHeap;


public class Djikstra {

	
	public class GHeap<T extends Comparable<T>> {

		ArrayList<T>  data =  new ArrayList<T>();
			HashMap<T, Integer> map= new HashMap<T, Integer>();
			
			public void add(T item)
			{
				data.add(item);
				map.put(item,this.data.size()-1);
				upheapify(data.size()-1);
			
				
			}
			
			private void Swap(int i,int j)
			{
				T ith = data.get(i);
				T jth = data.get(j);
				
				data.set(i, jth);
				data.set(j,ith);
				
				map.put(ith,j);
				map.put(jth,i);
			}
			
			private void upheapify(int ci)
			{
				
				int pi= (ci-1)/2;
				
				if(data.get(pi).compareTo(data.get(ci))>0)
				{Swap(ci, pi);
				upheapify(pi);}
			}
			
			public int size()
			{
				return this.data.size();
			}
			
			public boolean isEmpty()
			{
				return this.size()==0;
			}

			public void display() {
				System.out.println(data);
			}

			public T remove()
			{
				Swap(0, this.data.size()-1);
				T rv=this.data.remove(this.data.size()-1);
				downheapify(0);
				map.remove(rv);
				return rv;
			}
			private void downheapify(int pi)
			{
				int lci= 2*pi+1;
				int rci= 2*pi+2;
				
				int mini= pi;
				
				if(lci<data.size() && data.get(lci).compareTo(data.get(mini))<0)
				{
					mini= lci;
				}
				
				if(rci<this.data.size() && data.get(rci).compareTo(data.get(mini))<0)
				{
					mini= rci;
				}
				
				if(mini!=pi)
				{Swap(pi, mini);
				downheapify(mini);}
				
			}
			public T get()
			{
				return this.data.get(0);
			}
			
	public void updatePrior(T pair)
	{
		int index= map.get(pair);
		upheapify(index);
	}
	
	
	}



	
	
	
	
	 public class Vertex
		{
			 HashMap<Integer, Integer> nbrs = new HashMap<Integer, Integer>();
		}
		
		 HashMap<Integer, Vertex>vtces = new HashMap<Integer, Vertex>();

		 public void addVertex(int vname)
		 {
			 Vertex vtx = new Vertex();
			 vtces.put(vname,vtx);
			 
		 }
	
		 public void addEdge(int vname1,int vname2,int cost)
		 {
			 Vertex vtx1 = vtces.get(vname1);//2k
			 Vertex vtx2 = vtces.get(vname2);//4k
			 
			 if(vtx1==null || vtx2==null ||vtx1.nbrs.containsKey(vname2))
			 {return ;}
			 
			 vtx1.nbrs.put(vname2,cost);//2k ke nbrs mai put C with given cost
			 vtx2.nbrs.put(vname1,cost);//4k ke nbrs mai put A with given cost
		 }
	
		 private class DijkstraPair implements Comparable<DijkstraPair>
		 {
			 int vname;
			 String psf;
			 int cost;
			@Override
			public int compareTo(DijkstraPair o) {
				
				return this.cost-o.cost;
			}
			 
		 }
		 
		 public HashMap<Integer , Integer> dijkstra(int src)
		 {
			 HashMap<Integer, Integer> ans = new HashMap<Integer,Integer>();
		 HashMap<Integer, DijkstraPair> map = new HashMap<Integer,DijkstraPair>();
			
		 GHeap<DijkstraPair> heap = new GHeap<DijkstraPair>();
		 
		 // create a DijkstraPair for each vertex and add in heap and map
		 
		 for(int key : vtces.keySet())
		 {
			
			 DijkstraPair np = new DijkstraPair();
			 np.vname=key;
			 np.cost= Integer.MAX_VALUE;
			 np.psf= "";
			 
			 if(key==src)
			 {
				 np.cost=0;
				 np.psf=""+key;
				 
			 }
			 
			// System.out.println(key +" " +np.cost);
			 heap.add(np);
			 map.put(key,np);
			  } 


		 // remove elements form heap and add them in mst
		 
		 // till heap is not empty keep on removing the pairs
		 while(!heap.isEmpty())
		 {
			 // remove a pair
			 DijkstraPair rp = heap.remove();
			 map.remove(rp.vname);
			
			 
			 // add to ans
			 ans.put(rp.vname,rp.cost);
			// System.out.println(ans);
			 // nbrs
			 
			 for(int nbr : vtces.get(rp.vname).nbrs.keySet())
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

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int k=1;k<=t;k++)
		{
			Djikstra gg = new Djikstra();
			
			int n = scn.nextInt();
			int m = scn.nextInt();
			
			for(int a=1;a<=n;a++)
			{
				gg.addVertex(a);
			}
			for(int a=0;a<m;a++)
			{
				int x = scn.nextInt();
				int y = scn.nextInt();
				int r = scn.nextInt();
				
				gg.addEdge(x, y, r);
			}
			int src = scn.nextInt();
		
		HashMap<Integer, Integer> ans = gg.dijkstra(src);
		for(int i=1;i<=ans.size();i++)
		{
		 int get = ans.get(i);
		 if(i==src)
		 {continue;}
		 if(get==Integer.MAX_VALUE)
		 {System.out.print("-1 ");
		 continue;}
		 
		 System.out.print(get+" ");
				 
		}
		
		}

}
}
