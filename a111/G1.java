package a111;

import java.util.ArrayList;
import java.util.Scanner;

public class G1 {

	public static class Pair
	{
		int v1;
		int v2;
		Pair(int v1,int v2)
		{
			this.v1 = v1;
			this.v2= v2;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int s = scn.nextInt();
		int t = scn.nextInt();
		int x = scn.nextInt();
		
		
		ArrayList<Pair> [] graph = new ArrayList[m];
		
		for(int a=0;a<n;a++)
		{
			graph[a] = new ArrayList<Pair>();
		}
		for(int a=1;a<=m;a++)
		{
			int v1 = scn.nextInt()-1;
			int v2 = scn.nextInt()-1;
			
			graph[v1].add(new Pair(v1,v2));
			graph[v2].add(new Pair(v2,v1));
			
		}
		
	}
}