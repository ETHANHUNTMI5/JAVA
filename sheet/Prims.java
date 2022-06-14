package sheet;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims {
	
	static class Edge
	{
		int v1;
		int v2;
		long var;
		
		Edge(int v1,int v2,long var)
		{
			this.v1=v1;
			this.v2 = v2;
			this.var = var;
		}
		
	}
	
	static class Pair
	{
		int v1;
		int av;
		long wt;
		
		
		Pair(int v1,int av,long wt)
		{
			this.v1 = v1;
			this.av = av;
			this.wt = wt;
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
		
		for(int a=0;a<m;a++)
		{
			int i = scn.nextInt();
			int j = scn.nextInt();
			int g = scn.nextInt();
			
			
			graph[i-1].add(new Edge(i-1,j-1,g));
			graph[j-1].add(new Edge(j-1,i-1,g));
			
		}
		
		
		
		PriorityQueue<Pair> heap = new PriorityQueue<>((a,b) -> (int)(a.wt-b.wt));
		
		heap.add(new Pair(0,-1,0));
		
		boolean [] visited = new boolean[n];
		long ans =0;
		while(heap.size()>0)
		{
			Pair r = heap.remove();
			if(visited[r.v1])
			{continue;}
			
			visited[r.v1]=true;
			ans+=r.wt;
			
			for(Edge e : graph[r.v1])
			{
				if(visited[e.v2]==false)
				{
					heap.add(new Pair(e.v2,r.v1,e.var));
				}
			}
			
			
		}
		System.out.println(ans);
		
	}
	

}
