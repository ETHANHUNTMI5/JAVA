package abc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
			
			long n  = scn.nextLong();
			long k = scn.nextLong();
			
			ArrayList<Long> ll = new ArrayList<Long>();
			for(long a=0;a<n;a++)
			{ll.add(scn.nextLong());}
			
			Collections.sort(ll);
			
			long one =0;
			long two=0;
			
			
			for(long a=0;a<k;a++)
			{
				one=one+ll.get((int) (n-1-2*a));
				
			}
			
			for(long a=0;a<k;a++)
			{
				two=two+ll.get((int) (n-2-2*a));
				
				if(a==k-1)
				{two=two+ll.get((int) (n-2-2*a-1));}
				
			}
			
			
		System.out.println(Math.max(one, two));	
		}
		
		
		
			
	}

}
