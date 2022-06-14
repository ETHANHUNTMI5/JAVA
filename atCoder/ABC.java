package atCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ABC {

	static int graph[][];
	 static int via[][];
	 static int rt[][];
	 static int v;
	 static int e;

	 public static void main(String args[]) throws IOException
	 {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.println("Enter the number of Vertices: ");
	  v = Integer.parseInt(br.readLine());
	  
	  System.out.println("Enter the number of Edges: ");
	  e = Integer.parseInt(br.readLine());
	  
	  graph = new int[v][v];
	  via = new int[v][v];
	  rt = new int[v][v];
	  for(int i = 0; i < v; i++)
	   for(int j = 0; j < v; j++)
	   {
	    if(i == j)
	     graph[i][j] = 0;
	    else
	     graph[i][j] = 100000;
	   }
	  
	  for(int i = 0; i < e; i++)
	  {
	   System.out.println("Enter data for Edge " + (i + 1) + ":");
	   System.out.print("Source: ");
	   int s = Integer.parseInt(br.readLine());
	   s--;
	   System.out.print("Destination: ");
	   int d = Integer.parseInt(br.readLine());
	   d--;
	   System.out.print("Cost: ");
	   int c = Integer.parseInt(br.readLine());
	   graph[s][d] = c;
	   graph[d][s] = c;
	  }
	  
	  calc_("Routing Table ");
	  
}
	 
	 static void calc_(String message)
	 {
	  System.out.println();
	  init_tables();
	  modify();
	  System.out.println(message);
	  print_tables();
	  System.out.println();
	 }
	 
	 static void update_table(int source)
	 {
	  for(int i = 0; i < v; i++)
	  {
	   if(graph[source][i] != 9999)
	   {
	    int dist = graph[source][i];
	    for(int j = 0; j < v; j++)
	    {
	     int inter_dist = rt[i][j];
	     if(via[i][j] == source)
	      inter_dist = 9999;
	     if(dist + inter_dist < rt[source][j])
	     {
	      rt[source][j] = dist + inter_dist;
	      via[source][j] = i;
	     }
	    }
	   }
	  }
	 }
	 
	 static void modify()
	 {
	  int k = 0;
	  for(int i = 0; i < 4*v; i++)
	  {
	   update_table(k);
	   k++;
	   if(k == v)
	    k = 0;
	  }
	 }
	 
	 static void init_tables()
	 {
	  for(int i = 0; i < v; i++)
	  {
	   for(int j = 0; j < v; j++)
	   {
	    if(i == j)
	    {
	     rt[i][j] = 0;
	     via[i][j] = i;
	    }
	    else
	    {
	     rt[i][j] = 9999;
	     via[i][j] = 9999;
	    }
	   }
	  }
	 }
	 
	 static void print_tables()
	 {
	  for(int i = 0; i < v; i++)
	  {
	   for(int j = 0; j < v; j++)
	   {
	    System.out.print("Dist: " + rt[i][j] + "    ");
	   }
	   System.out.println();
	  }
	 }
	 
	}