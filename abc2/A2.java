package abc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        
        for(long a=1;a<=t;a++)
        {
        	long n = scn.nextLong();
        	
        	ArrayList<Long> ll = new ArrayList<Long>();
        	
        	long sum=0;
        	for(long b=0;b<n;b++)
        	{
        		ll.add(scn.nextLong());
        		sum+=ll.get((int) b);
        	}
        	
        	long k=0;
        	
        	
        	if(sum%n==0)
        	{
        		long p=sum/n;
        		long notK=0;
        		
        		for(long m=0;m<ll.size();m++)
        		{
        			if(ll.get((int) m)<=p)
        			{
        				notK++;
        			}
        		}
        		
        		long ans = ll.size()-notK;
        		System.out.println(ans);
        	}
        	
        	else
        	{System.out.println("-1");}
        	
        	
        	
        }

	}

}
