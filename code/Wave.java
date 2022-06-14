package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Wave {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long n = scn.nextLong();
		long q = scn.nextLong();
		
		long [] arr = new long[(int) n];
		
		ArrayList<Long> ll = new ArrayList<Long>();
		for(long a=0;a<n;a++)
		{
			arr[(int) a]= scn.nextLong();
			ll.add(arr[(int) a]);
			
		}
		
		Collections.sort(ll);
		
		for(long p=0;p<q;p++)
		{
			long k = scn.nextLong();
			
			if(ll.contains(k))
			{
				System.out.println("0");
			}
			
			else
			{
				int kp = Collections.binarySearch(ll, k);
				
				kp= (kp+1)*-1;
				
				if((n-kp)%2==0)
				{System.out.println("POSITIVE");}
				else
				{System.out.println("NEGATIVE");}
				
			}
			
			
		}
		
	}
}
		
	