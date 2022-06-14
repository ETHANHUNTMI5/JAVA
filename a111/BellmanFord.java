package a111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BellmanFord {
static class Edge
{
   long v1;
   long v2;
   long wt;
   
   Edge(long v1,long v2, long wt)
   {
	   this.v1=v1;
	   this.v2=v2;
	   this.wt= wt;
   }

}
static class Node
{
   long v1;
   long cost;
   
   Node(long v1,long cost)
   {
	   this.v1=v1;
	   this.cost= cost;
   }

}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		ArrayList<Edge> [] graph = new ArrayList[n];
		
		long [] arr = new long[n];
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextLong();}
		
		for(int a=0;a<n;a++)
		{graph[a] = new ArrayList<Edge>();}
		
		for(int a=0;a<m;a++)
		{
			int v1 = scn.nextInt()-1;
			int v2 = scn.nextInt()-1;
		   
			long wt=0;
			long wt2=0;
		
			if(arr[v1]>arr[v2])
			{wt = arr[v1]-arr[v2];
			wt2= 2*(arr[v2]-arr[v1]);}
			else
			{wt = 2*(arr[v1]-arr[v2]);
			wt2=arr[v2]-arr[v1];}
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt2));
		}
		
		PriorityQueue<Node> heap = new PriorityQueue<>((a,b)->Long.compare(b.cost, a.cost));
		long ans = 0;
		long [] dp = new long[n];
		Arrays.fill(dp, Integer.MIN_VALUE);
		dp[0]=0;
		heap.add(new Node(0,0));
		
		while(!heap.isEmpty())
		{
			Node nn = heap.poll();
			
			if(nn.cost>ans)
			{ans=nn.cost;}
			
			for(Edge e : graph[(int) nn.v1])
			{if(dp[(int) nn.v1]+e.wt>dp[(int) e.v2])
			{dp[(int) e.v2]=dp[(int) nn.v1]+e.wt;
			heap.add(new Node(e.v2, dp[(int) e.v2]));}
			}
			
		}
		System.out.println(ans);
	}

}
