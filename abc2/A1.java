package abc2;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        
        for(long a=1;a<=t;a++)
        {
        	int n = scn.nextInt();
        	int [] arr = new int[n];
        	int first=0;
        	int last=0;
        	
        	for(int b=0;b<n;b++)
        	{
        		arr[b]= scn.nextInt();
        		if(arr[b]==1)
        		{
        			first=b;
        		}
        	 
        		if(arr[b]==n)
        		{
        			last=b;
        		}
        	}
        	
        	int ans=0;
        	
        	if(first<n/2 && last<n/2)
        	{
        		ans = Math.max(first, last)+1;
        		
        	}
        	
        	else if(first>=n/2 && last>=n/2)
        	{
        		
        		ans = n- Math.min(first, last);
        		
        	}
        	
        	else
        	{
        		if(first<n/2 && last>=n/2)
        		{
        			int one = first+1 + n-last;
        			int two = last+1;
        			int three = n-first;
        			ans = Math.min(one, Math.min(two, three));
        		}
        		
        		else
        		{
        			int one = last+1 + n-first;
        			int two = first+1;
        			int three = n-last;
        			ans = Math.min(one, Math.min(two, three));
        		}
        		
        	}
        		
        	System.out.println(ans);
        	
        }

	}

}
