package aatCoder;
import java.util.*;

import interfaceAndGenerics.GenericClass.Pair;
public class Djikstra {

 static class Edge
 {
	 int v1;
	 int v2;
	 int wt;
	 int a;
	 
	 Edge(int v1,int v2, int wt, int a)
	 {
		 this.v1 = v1;
		 this.v2 = v2;
		 this.wt = wt;
		 this.a = a;
	 }
 }
  static class Pair
  {
	  int v1;
	  int av;
	  int psf;
	  
	  Pair(int v1, int av,int psf)
	  {
		  this.v1 = v1;
		  this.av = av;
		  this.psf = psf;
	
	  }
  }
 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		ArrayList<Edge>[] graph = new ArrayList[n];
		
		for(int a=0;a<n;a++)
		{
			graph[a] = new ArrayList<Edge>();
		}
		HashMap<String,Integer> map = new HashMap<>();
		for(int a=1;a<=m;a++)
		{
			int v1 = scn.nextInt()-1;
			int v2 = scn.nextInt()-1;
			int wt = scn.nextInt();
			
			graph[v1].add(new Edge(v1, v2, wt, a));
			graph[v2].add(new Edge(v2, v1, wt, a));
			map.put(v1+"*"+v2,a);
			map.put(v2+"*"+v1,a);
		}
		
		// now djikstra
		
		
		PriorityQueue<Pair> heap = new PriorityQueue<Pair>((a,b)->a.psf-b.psf);
		
		heap.add(new Pair(0,-1,0));
		boolean [] vis = new boolean[n];
		
		while(!heap.isEmpty())
		{
			Pair p = heap.remove();
			
			if(vis[p.v1])continue;
			
			vis[p.v1] = true;
			
			if(p.av!=-1)
			{
				System.out.print(map.get(p.av+"*"+p.v1)+" ");
			}
			
			for(Edge e : graph[p.v1])
			{
				if(vis[e.v2]==false)
				{
					heap.add(new Pair(e.v2,e.v1,e.wt+p.psf));
				}
			}
		}
		System.out.println();
	}

}
