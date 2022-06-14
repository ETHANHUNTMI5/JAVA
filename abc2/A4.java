package abc2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

	class A4 {
		
		     
		     
		    public static void main(String[] args)
		    {
		    	
		    	Scanner scn = new Scanner(System.in);
		        long t = scn.nextLong();
		        
		        for(long w=1;w<=t;w++)
		        {
		        	long n = scn.nextLong();
		        	long l = scn.nextLong();
		        	long r = scn.nextLong();
		        	
		        	long [] arr = new long[(int) n];
		          
		        	for(long a=0;a<n;a++)
		        	{
		        		arr[(int) a]= scn.nextLong();
		        	}
		        
		        	Arrays.sort(arr);
		        	long one = findPairs(arr, n, r);
			        long ones=findPairs(arr, n, l);
			        long ans = Math.abs(one-ones);
			        
			       long p = getPairsCount(n, r, arr); 
			       
			       ans +=p;
			        
			        System.out.println(ans);

			        	
      
		        	
		        }
		    	
		    	
		    	
		    	
		    	
		    	
		         
		    }
		    
		    
		      
		    
		    public static long findPairs(long arr[], long n, long x)
		    {
		         
		        long l = 0, r = n - 1;
		        long result = 0;
		     
		        while (l < r)
		        {
		             
		            if (arr[(int) l] + arr[(int) r] <x)
		            {
		                result += (r - l);
		                l++;
		            }
		     
		             else
		                r--;
		        }
		     
		        return result;
		    }
		    
		  public  static long getPairsCount(long n, long r,long[] arr)
		    {
		        HashMap<Long, Long> hm = new HashMap<>();
		 
		        for (long i = 0; i < n; i++) {
		 
		            if (!hm.containsKey(arr[(int) i]))
		                hm.put((long) arr[(int) i], (long) 0);
		 
		            hm.put((long) arr[(int) i], hm.get(arr[(int) i]) + 1);
		        }
		        int twice_count = 0;
		 
		        for (int i = 0; i < n; i++) {
		            if (hm.get(r - arr[i]) != null)
		                twice_count += hm.get(r - arr[i]);
		 
		            if (r - arr[i] == arr[i])
		                twice_count--;
		        }
		 
		        
		        return twice_count / 2;
		    }
		    
		}
		 