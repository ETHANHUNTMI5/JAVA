package aatCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import graphs.Graph;
import graphs.Graph.Vertex;

public class A3 {

	 public class Vertex
		{
			 HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
		}
		
		 HashMap<String, Vertex>vtces = new HashMap<String, Vertex>();



		 public void addVertex(String vname)
		 {
			 Vertex vtx = new Vertex();
			 vtces.put(vname,vtx);
			 
		 }
		
		 public void addEdge(String vname1,String vname2,int cost)
		 {
			 Vertex vtx1 = vtces.get(vname1);//2k
			 
			 
			 vtx1.nbrs.put(vname2,cost);

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
		 
		
		 
		 
		 
		 
		 
		 
		 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		A3 graph = new A3();
		
		for(int a=1;a<=n;a++)
		{graph.addVertex(a+"");}
		
		for(int a=0;a<m;a++)
		{
			int x= scn.nextInt();
			int y = scn.nextInt();
			
			graph.addEdge(x+"", y+"", 1);
		}
		
		
		
		graph.display();
		
		
		
			}
		
	}


