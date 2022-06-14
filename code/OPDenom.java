package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OPDenom {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
			long n = scn.nextLong();
			
			
			long [] arr = new long[(int) n];
			
			for(long a=0;a<n;a++)
			{
				arr[(int) a]= scn.nextLong();
			}
			if(n==1)
			{
				System.out.println("1");
				return;
			}
			
			long [] left = new long[(int) n];
			long [] right= new long[(int) n];
			
		
			
			left[0]=0;
			long g=arr[0];
			for(long a=1;a<n;a++)
			{
				left[(int) a]=g;
				g=gcd(g, arr[(int) a]);
				
			}
			right[(int) (n-1)]=0;
			
			long g2=arr[(int) (n-1)];
			for(long a=n-2;a>=0;a--)
			{
				right[(int) a]=g2;
				g2= gcd(g2, arr[(int) a]);
			}
			
//			for(long i : left)
//			{
//				System.out.prlong(i+" ");
//			}
//			System.out.prlongln();
//			for(long i : right)
//			{
//				System.out.prlong(i+" ");
//			}
//			
			long [] mid= new long[(int) n];
			
			for(long a=0;a<n;a++)
			{
				if(left[(int) a]==0 || right[(int) a]==0)
				{
					if(left[(int) a]==0)
					mid[(int) a]=right[(int) a];
					
					else
					{
						mid[(int) a] = left[(int) a];
					}
				}
				else
				{
					mid[(int) a]= gcd(left[(int) a], right[(int) a]);
				}
			}
//			System.out.prlongln();
//			for(long i : mid)
//			{
//				System.out.prlong(i+" ");
//			}
//			System.out.prlongln();
			HashMap<Long, Long> map = new HashMap<Long, Long>();
			for(long a=0;a<n;a++)
			{
			
				map.put(a,mid[(int) a]);
				
			}
			
			ArrayList<Map.Entry<Long, Long>> ll = new ArrayList<>(map.entrySet());
			
		//System.out.prlongln(map);	
		
		Collections.sort(ll,new Comparator<Map.Entry<Long, Long>>() {

			@Override
			public int compare(Map.Entry<Long, Long> o1, Map.Entry<Long, Long> o2) {
				
				if(o2.getValue()-o1.getValue()==0)
				{
					long i2 = o2.getKey();
					long i1= o1.getKey();
					int j2 = (int) i2;
					int j1 = (int)i1;
					return (int) ((int)arr[j2]-arr[j1]);
				}
				
				
				return (int) (o2.getValue()-o1.getValue());
			}
		});
		//System.out.prlongln(ll);
		
		long idx = ll.get(0).getKey();
		//System.out.prlongln(idx);
		long gg = mid[(int) idx];
		long ansf=1;
		
		for(long a=1;a<ll.size();a++)
		{
			long l =ll.get((int) a).getKey();
			int pk = (int )l;
			ansf= ansf+arr[pk]/gg;
		}
		System.out.println(ansf);
		}
		
		
	}
	public static long gcd(long a , long b)
	{
	 if (b == 0)
	 {   return a;}
	    
	 return gcd(b, a % b);
	}
		
	

}
