package code;

import java.util.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int a=1;a<=t;a++)
        {
        
        	long n = scn.nextLong();
        	long [] arr = new long[(int)n];
        	
        	for(int b=0;b<n;b++)
        	{
        		arr[b]= scn.nextLong();
        	}
     
        	HashMap<Long, Long> map = new HashMap<Long, Long>();
        	
        	for(long b=0;b<n;b++)
        	{
        	long get = arr[(int)b]-b;
        	if(map.containsKey(get))
        	{
        		map.put(get,map.get(get)+1);
        	}
        	
        	else
        	{
        		map.put(get,(long) 1);
        	}
        	}
	
        Collection<Long> vals = map.values();
        
        long count=0;
        for(long val:vals)
        {
        	if(val>=2)
        	{
        		count= count+ ((val)*(val-1)/2);
        	}
        	
        }
        
        
        System.out.println(count);}
	}
}
