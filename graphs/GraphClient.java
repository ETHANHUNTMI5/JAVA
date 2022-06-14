package graphs;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) throws Exception {
		
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 90);
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 6);
		graph.addEdge("F", "G", 4);
		
//		graph.addEdge("A", "B", 8);
//		graph.addEdge("A", "C", 4);
//		graph.addEdge("A", "D", 5);
//		graph.addEdge("C", "D", -3);
//		graph.addEdge("D", "E", 4);
//		graph.addEdge("E", "B", -10);
//		graph.addEdge("B", "E", 2);
//		graph.bft();
		//graph.display();
//		System.out.println(graph.numEdges());
//		System.out.println(graph.numVertex());
//		System.out.println(graph.containsEdge("A", "C"));
		
		
//		graph.removeEdge("C", "B");
//		graph.removeEdge("F", "G");
//		graph.display();
//		
//		graph.removeVertex("F");
//		graph.display();
//		
//		graph.addVertex("F");
//		graph.display();
//		
    // graph.removeEdge("D", "E");
//		
//		System.out.println(graph.hasPath("A", "C", new HashMap<String, Boolean>()));
//		
//		
//		System.out.println(graph.bfs("A", "F"));
  System.out.println("***************");
		System.out.println(graph.dfs("A", "F"));
//		graph.bft();
//		System.out.println("+++++++");
//		graph.dft();
//	
//		System.out.println("******");
//		System.out.println(graph.isConnected());
//		System.out.println(graph.isCyclic());
//		
//		graph.Kruskal();
//		System.out.println("*******");
		graph.prims().display();
//		System.out.println("&&&&&");
		//System.out.println(graph.dijkstra("A"));
	
	//System.out.println(graph.bellmanFord("A"));
	}

}
