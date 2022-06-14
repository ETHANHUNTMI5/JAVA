package compi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A1 {

	
public static class Edge
{
int v1;int v2;int wt;
Edge(int v1, int v2, int wt)
{
	this.v1 = v1;
	this.v2 = v2;
	this.wt = wt;
}
}
public static class Pair
{
int v1;int c;
Pair(int v1, int c)
{
	this.v1 = v1;
	this.c = c;
}
}
public static HashMap<Integer,ArrayList<Edge>> map = new HashMap<>();
public static HashMap<Integer,ArrayList<Edge>> map4 = new HashMap<>();
public static HashMap<Integer,Integer> map2 = new HashMap<>();
public static HashMap<Integer,Set<Integer>> map3 = new HashMap<>();

public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 int t = scn.nextInt();
	        
		 	for(int w=1;w<=t;w++)
	        {
		 		int n = scn.nextInt();
		 		int k = scn.nextInt();
		 		map = new HashMap<>();
		 		map4 = new HashMap<>();
		 		map2 = new HashMap<>();
		 		map3 = new HashMap<>();
		 		for(int a=1;a<=n;a++)
		 		{
		 			map.put(a,new ArrayList<Edge>());
		 			map2.put(a,-1);
		 			map3.put(a,new HashSet<Integer>());
		 			map4.put(a,new ArrayList<Edge>());
		 			
		 		}
		 		int z= 0;
		 		int o = 0;
		 		for(int a=1;a<=n-1;a++)
		 		{
		 			int v1 = scn.nextInt();
		 			int v2 = scn.nextInt();
		 			int wt = scn.nextInt();
		 			if(wt==0)z++;
		 			else o++;
		 			map.get(v1).add(new Edge(v1,v2,wt));
		 			
		 			
		 		    
		 		}
		 		for(int a=1;a<=n;a++)
		 		{
		 			height(a);
		 		}
		 		
		 		dfs(1);

		 	System.out.println(map2);
	 		System.out.println(map3);
		 	
	 		ArrayList<Pair> ll = new ArrayList<Pair>();
	 		for(Map.Entry<Integer, Integer> ch : map2.entrySet())
	 		{
	 			ll.add(new Pair(ch.getKey(),ch.getValue()));
	 		}	
	 		Collections.sort(ll,(a,b)->(b.c-a.c));
	 		System.out.println(ll.size());
	        
	 		for(int a=1;a<ll.size();a++)
	 		{
	 			
	 		}
	        
	        }
		 		
		 		
	}

	public static int height(int v1)
	{
		
		if(map2.containsKey(v1) && map2.get(v1)!=-1)
		{
		return map2.get(v1);}
		
		int ans = 1;
		for(Edge e : map.get(v1))
		{
			
			if(map2.get(e.v2)!=-1)
			{return map2.get(e.v2);}
			ans+=height(e.v2);
		}
	map2.put(v1,ans);
	return ans;
	}
	
	public static Set<Integer> dfs(int v)
	{
		if(map3.get(v).size()>1)return map3.get(v);
		
		Set<Integer> ans = new HashSet<>();
		ans.add(v);
		
		for(Edge e : map.get(v))
		{
		
			Set<Integer> ss = dfs(e.v2);
			
			for(int i : ss)
			{ans.add(i);}
			
		}
		
		map3.put(v,ans);
		return ans;
	}
	

}
