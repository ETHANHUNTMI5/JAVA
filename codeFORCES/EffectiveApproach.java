package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(long a=0;a<n;a++)
		{
		long p = scn.nextLong();	
		map.put(p,a);}
		
		long v=0;
		long p=0;
		
		long m = scn.nextInt();
		for(long b=0;b<m;b++)
		{
			long in=scn.nextInt();
			
			if(map.containsKey(in))
			{
				long g = map.get(in);
				v=g+1+v;
				p=p+n-g;
			}
			
			else
			{v=v+n;
			p=p+n;}
		
		}
		System.out.println(v+" "+p);
	}
}