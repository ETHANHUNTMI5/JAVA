package a111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DSU {
	public static int count = 0;

	static class Pair {
		int v1;
		int v2;
		int wt;
		int par;

		Pair(int v1, int v2, int wt, int par) {
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
			this.par = par;
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int q = scn.nextInt();
		count = n;
		PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> (a.wt - b.wt));
		for (int a = 0; a < m; a++) {
			int v1 = scn.nextInt() - 1;
			int v2 = scn.nextInt() - 1;
			int wt = scn.nextInt();
			heap.add(new Pair(v1, v2, wt, 0));

		}

		ArrayList<Pair> edges = new ArrayList<Pair>();

		for (int a = 0; a < q; a++) {
			int v1 = scn.nextInt() - 1;
			int v2 = scn.nextInt() - 1;
			int wt = scn.nextInt();
			Pair p = new Pair(v1, v2, wt, -1);
			heap.add(p);
			edges.add(p);

		}

		int[] parent = new int[n];
		for (int a = 0; a < n; a++) {
			parent[a] = a;
		}

		int[] rank = new int[n];
		Arrays.fill(rank, 1);

		while (!heap.isEmpty() && count > 1) {
			Pair p = heap.remove();

			if (!isConnected(p.v1, p.v2, parent)) {

				if (p.par == -1)
					p.par = 10;

				else {
					union(p.v1, p.v2, parent, rank);
				}
			}

		}

		for (int a = 0; a < q; a++) {
			Pair p = edges.get(a);
			if (p.par == 10) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

	public static int find(int v, int[] parent) {
		if (parent[v] == v) {
			return v;
		}

		return parent[v] = find(parent[v], parent);
	}

	public static void union(int v1, int v2, int[] parent, int[] rank) {
		int s1 = find(v1, parent);
		int s2 = find(v2, parent);

		if (s1 != s2) {
			if (rank[s1] > rank[s2]) {
				parent[s2] = s1;
				rank[s1] += rank[s2];
			} else {
				parent[s1] = s2;
				rank[s2] += rank[s1];
			}

			count--;
		}

	}

	public static boolean isConnected(int v1, int v2, int[] parent) {
		return find(v1, parent) == find(v2, parent);
	}

}
