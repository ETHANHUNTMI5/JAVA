package codeFORCES;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import graphs.Graph.Vertex;

public class Shoes {

	public class Vertex
	{
		HashMap<String , Integer> nbrs = new HashMap<String, Integer>();
		
	}
	
	HashMap<String, Vertex> vtces = new HashMap<String,Vertex>();
	
	public void addVertex(String name)
	{
		Vertex v = new Vertex();
		vtces.put(name,v);
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
	public void kuch()
	{
		
		Set<Map.Entry<String, Vertex>> ve= vtces.entrySet();
        ArrayList<String> list = new ArrayList<String>();
		for(Map.Entry<String, Vertex> ves : ve)
		{
		if(ves.getValue().nbrs.size()==1)
		{
		list.add(ves.getKey());
		}
			
		}

		
		for(String l : list)
		{
			RemoveV(l);
		}
	}

	
	public void addEdge(String vname1 , String vname2)
	{
		 Vertex vtx1 = vtces.get(vname1);
		 Vertex vtx2 = vtces.get(vname2);
		 
		 if(vtx1==null || vtx2==null ||vtx1.nbrs.containsKey(vname2))
		 {return ;}
		 
		 vtx1.nbrs.put(vname2,1);
		 vtx2.nbrs.put(vname1,1);
	
		
	}
	
	public void RemoveV(String vname)
	{
		Vertex vtx = this.vtces.get(vname);
		
	 ArrayList<String> keys = new ArrayList<String>(vtx.nbrs.keySet());
	 
	 for(String s :keys)
	 {
		 Vertex vtnbr = this.vtces.get(s);
		 vtnbr.nbrs.remove(vname);
		 
	 }
	 vtces.remove(vname);
	 
	
		
	}
	
	public void RemoveEdge(String vname1,String vname2)
	{
		 Vertex vtx1 = vtces.get(vname1);
		 Vertex vtx2 = vtces.get(vname2);
		 
		 if(vtx1==null || vtx2==null ||!vtx1.nbrs.containsKey(vname2))
		 {return ;}
		 
		 
	     vtx1.nbrs.remove(vname2);
		 vtx2.nbrs.remove(vname1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		Shoes graph2 = new Shoes();
		
		for(int a=1;a<=n;a++)
		{
			graph2.addVertex(a+"");
		}
		
		for(int a=1;a<=m;a++)
		{
			int x = scn.nextInt();
			int y = scn.nextInt();
			
			graph2.addEdge(x+"", y+"");
		}
		
		int ans=0;
		
		int min = graph2.tellMin();
		
		boolean b = false;
		if(min==1)
		{b=true;}
		
		while(b)
		{
			
			graph2.kuch();	
			int var =graph2.tellMin();

			if(var<=1)
			{b=true;}
			else
			{b=false;}
			ans++;
		
		}
	
		
			
		
		
		System.out.println(ans);
	}
	
	public  int tellMin()
	{
Set<Map.Entry<String, Vertex>> ve= vtces.entrySet();
		
		int min =10000;
		for(Map.Entry<String, Vertex> ves : ve)
		{
			if(ves.getValue().nbrs.size()!=0 && ves.getValue().nbrs.size()<min)
			{min =ves.getValue().nbrs.size();}
			
			
			
		}
		
		return min;
	}

}
