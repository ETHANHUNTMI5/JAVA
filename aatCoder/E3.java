package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int [][] graph = new int[n][n];

		for(int a=0;a<n;a++)
		Arrays.fill(graph[a],100000);
		
		
		for(int a=0;a<n-1;a++)
		{
			int one = scn.nextInt();
			int two = scn.nextInt();
			int three = scn.nextInt();
			
			graph[one-1][two-1]=three;
			graph[two-1][one-1]= three;
		}
		
		for(int i=0;i<n;i++)
		{for(int j=0;j<n;j++)
			{
			System.out.print(graph[i][j]+" ");
			
			
			}
		System.out.println();}
		
		
		int ans=0;
		for(int k=0;k<n;k++)
		{ArrayList<Integer> ll = new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				for(int j =0;j<n;j++)
				{
					
					
					if(graph[i][k]+graph[k][j]<graph[i][j])
					{
						graph[i][j]= graph[i][k]+graph[k][j];
						ll.add(Math.max(graph[i][k],graph[k][j]));
					}
				}
			}
			
			
		if(ll.size()>0)
		{Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
		ans+=ll.get(0);
		ll.clear();
		}
		}
		
		System.out.println(ans);
		for(int i=0;i<n;i++)
		{for(int j=0;j<n;j++)
			{
			System.out.print(graph[i][j]+" ");
			
			
			}
		System.out.println();}
		
		
		
		// Hence it uses DP
	}
}
