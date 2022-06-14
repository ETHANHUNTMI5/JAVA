package a111;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_APPLICATION {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int n = scn.nextInt();
		
		int [] d = new int[1000001];
		for(int i = 2 ; i <= 1000000 ; i++)
		{
		    d[i] = Integer.MAX_VALUE;
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		
		while(!q.isEmpty())
		{
			int x = q.remove();
			   if(x*a <= 1000000 && x*a > 0 && d[x*a] > 1+d[x])
			   {
			   q.add(x*a);
			   d[x*a] = 1+d[x];
			   }
			   
			   int y = Integer.parseInt(x%10 + "" + x/10);
			   if(x%10 != 0 && y <= 1000000 && y >= 0 && d[y] > 1+d[x])
			   {
			       q.add(y);
			       d[y] = 1+d[x];
			   }
			   
		}
		if(d[n] == Integer.MAX_VALUE)
			System.out.println(-1);
			
			else
			System.out.println(d[n]);
	
		
	}

}
