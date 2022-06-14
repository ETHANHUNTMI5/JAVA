package challenges_Array;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
       int t = scn.nextInt();
       
       for(int a=1;a<=t;a++)
       {
    	   int n = scn.nextInt();
    	   int [] arr = new int [n];
    	   int n2 = scn.nextInt();
    	  int [] ans= new int[n2];
    	   
    	   for(int b=0;b<n;b++)
    	   {
    		   arr[b]=scn.nextInt();
    		   
    	   }
    	   
    	   for(int c=0;c<=n2-1;c++)
    	   {
    		if(c!=n2-1)
    		{
    			ans[c]= arr[n-1-c];
    		}
    		   
    		else
    		{
    			int sum=0;
    			int k=n-1-c;
    			while(k>=0)
    			{
    				sum=sum+arr[k];
    				k--;
    			}
    			
    			ans[c]=sum;
    		}
    	   }
    	   
       bubble(ans);
       System.out.println(ans[ans.length-1]);
       
       }
		
	}
	
	  public static void bubble(int [] arr)
	    {
	    	for(int a=0;a<arr.length-1;a++)
	    	{
	    		for(int j=0;j<arr.length-1-a;j++)
	    		{if(arr[j]>arr[j+1])
	    		{int temp=arr[j];
	    		arr[j]=arr[j+1];
	    		arr[j+1]=temp;}
	    				
	    		}
	    	}
	    	
	    	
	    }
	  
}
