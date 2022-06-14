package graphs;

import java.util.ArrayList;

public class DSU {
	public static ArrayList<Edge> graph = new ArrayList<>();
	public static int V;
	static class Edge
	{
		int u;
		int v;
		
		Edge(int u,int v)
		{this.u=u;
		this.v=v;}
	}
	

	public static boolean containsCycle()
	{
		int [] parent = new int[V+1];
		int [] rank = new int[V+1];
		
		for(int i=0;i<V;i++)
		{parent[i]=-1;
		rank[i]=1;}
		
		for(Edge e : graph)
		{
			int v1 = e.u;
			int v2 = e.v;
		
		
		int s1 = find(v1,parent);
		int s2 = find(v2,parent);
		
		if(s1!=s2)
		{union_set(s1, s2, parent,rank);}
		
		else
		{return true;}
		
		}
		return false;}
	
	//find function
	public static int find(int v,int[] parent)
	{
		if(parent[v]==-1)
		{return v;}
		
		
		return parent[v]=find(parent[v],parent);
	}
	
	
	
	//union function
	public static void union_set(int x,int y , int[] parent,int[] rank)
	{
		int s1 = find(x,parent);
		int s2 = find(y,parent);
		// s with greater rank would lead
		if(s1!=s2)
		{
			if(rank[s1]>rank[s2])
			{
				parent[s2]=s1;
				rank[s1]+=rank[s2];
			}
			else
			{
				parent[s1]=s2;
				rank[s2]+=rank[s1];
			}
			
			
		}
		
	}
	
public static void main(String[] args) {
		
		graph.add(new Edge(1,2));
		graph.add(new Edge(2,3));
		graph.add(new Edge(3,4));
		graph.add(new Edge(4,1));
		V=4;
		System.out.println(containsCycle());
		
		
	}
}
