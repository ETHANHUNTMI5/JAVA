package challengesHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Hv2 {

	public static void main(String[] args) {
		

		
		Scanner scn = new Scanner(System.in);
		ArrayList<Long> l= new ArrayList<Long>();
		Long n = scn.nextLong();
		int k = scn.nextInt();
		
		for(long a=0;a<n;a++)
		{
			int x=scn.nextInt();
			
			if(x==1)
			{
				long y = scn.nextLong();
				long z = scn.nextLong();
				long p = z*z +y*y;
			    l.add(p);
				
				
			}
			else
			{
				Collections.sort(l);
				l.remove(l.size()-1);
				long m = l.get(k-1);
				System.out.println(m);
				
				
			}
		}
			

	}

}
