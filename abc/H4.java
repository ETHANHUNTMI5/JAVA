package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class H4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long t = scn.nextInt();
		ArrayList<Node> ll = new ArrayList<Node>();
		for(long w=1;w<=t;w++)
		{
			ll.clear();
			long n = scn.nextInt();
			long k = scn.nextInt();
			long f = scn.nextInt();
			
			
			long lo1=0;
			long hi1=f;
			for(long a=0;a<n;a++)
			{
			
				long si = scn.nextInt();
				long ei = scn.nextInt();

				if(si<lo1)
				{
				}
				Node nn = new Node(si,ei);
			
				ll.add(nn);
			
			}
			
			long ans =0;
			long prelo=0;
			long count=0;
			
			Collections.sort(ll, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					
					if(o1.si!=o2.si)
					return (int)(o1.si-o2.si);
					else
					{return (int) (o1.ei-o2.ei);}
				}
			});
			
			
			long [] arr2 = new long[(int) (f+1)];
			
			for(long a=0;a<ll.size();a++)
			{
				long lo = ll.get((int)a).si;
				long hi = ll.get((int)a).ei;
				
				
				for(long x=lo;x<=hi;x++)
				{
					arr2[(int) x]= arr2[(int) x]+1;
				}
				
				
				
			}
			
			
			long ans2=0;
			for(long a=0;a<arr2.length;a++)
			{
				
				{
					
				}
				
			}
			
			
			
			
			if(count==1 || ans>=k)
			{System.out.println("YES");}
			
			else
			{System.out.println("NO");}
			
			
			
			
			
		}
		
		
	}
	
	public static class Node
	{
		
		long si=0;
		long ei=0;
		public Node(long si,long ei)
		{
			this.si=si;
			this.ei =ei;
			
		}
		
	}

}
