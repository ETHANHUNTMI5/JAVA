package sheet;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	static class Pair
	{
		int v;
		int wt;
		Pair(int v,int wt)
		{
			this.v=v;
			this.wt =wt;
		}
	}
	
	static class Edge
	{
		int v1;
		int v2;
		int wt;
		Edge(int v1,int v2,int wt)
		{
			this.v1= v1;
			this.v2= v2;
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
			graph[a] = new ArrayList<>();
		}
		
		for(int a=0;a<m;a++)
		{
		   int i = scn.nextInt();
		   int j = scn.nextInt();
		   i = i-1;
		   j = j-1;
		   
		   graph[i].add(new Edge(i,j,0));
		   graph[j].add(new Edge(j,i,1));
			
		}
		
		boolean[] visited = new boolean[n];
		
		PriorityQueue<Pair> heap = new PriorityQueue<>((a,b)->a.wt-b.wt);
		heap.add(new Pair(0,0));
		int ans=0;
		while(!heap.isEmpty())
		{
			Pair r = heap.remove();
			
			if(visited[r.v])
			{continue;}
			
			visited[r.v]=true;
			
			for(Edge e: graph[r.v])
			{
				if(visited[e.v2])continue;
				
				heap.add(new Pair(e.v2,r.wt+e.wt));
				
			}
			
			ans = r.wt;
		}
		System.out.println(ans);
		
	}

}
