package sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumOfIsland2 {
public static int ans=0;
	public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   int n = scn.nextInt();
	   int m = scn.nextInt();
	   int k = scn.nextInt();
	   ans=0;
	   ArrayList<Integer> fans = new ArrayList<>();
	   ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	   for(int a=0;a<k;a++)
	   {
		   int row = scn.nextInt();
		   int col = scn.nextInt();
		   ArrayList<Integer> ll = new ArrayList<Integer>();
		   ll.add(row);
		   ll.add(col);
		   
		   graph.add(ll);
	   }
	   
	   int v = n*m;
	   int [] par = new int[v];
	   int [] rank = new int[v];
	   Arrays.fill(par,-1);
	   int [][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
	   for(int a=0;a<graph.size();a++)
	   {
		int row = graph.get(a).get(0);
		int col = graph.get(a).get(1);
		
		int cell = row*m+col;
		
		if(par[cell]!=-1)
		{fans.add(ans);
		continue;}
		
		ans++;
		par[cell]=cell;
		rank[cell]=1;
		for(int[] d : dirs)
		{
		   int nr = row+d[0];
		   int nc = col+d[1];
		   
		   int new_cell = nr*m+nc;
		   if(nr<0 || nr>=n || nc<0 || nc>=m || par[new_cell]==-1)
		   {
			   continue;
		   }
		   
		   union_set(cell,new_cell , par, rank);
		}
		
		fans.add(ans);
	   }
	   
	   
	   System.out.println(fans);
	}
	public static int find(int v, int [] parent)
	{
		if(parent[v]==v)
		{return v;}
		
		return parent[v]=find(parent[v],parent);
	}
	public static void union_set(int x,int y,int[] parent,int [] rank)
	{
		int s1 = find(x,parent);
		int s2 = find(y,parent);
		
		
		if(s1!=s2)
		{
			if(rank[s1]<rank[s2])
			{
				parent[s1]=s2;
				rank[s2]+=rank[s1];
			}
			else
			{
				parent[s2]=s1;
				rank[s1]+=rank[s2];
			}
			
		ans=ans-1;	
		}
	}

}
