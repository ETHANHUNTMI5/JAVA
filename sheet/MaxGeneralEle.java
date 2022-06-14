package sheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxGeneralEle {

	public static void main(String[] args) {
		int [] arr = {2,1,3,4,4};
		int n = arr.length;
	        
	        int []gg =new int[n] ;
	        for(int a=0;a<n;a++)
	        {
	        	gg[a]=arr[a];
	        }
	        Arrays.sort(gg);
	        int [] max = new int[n];
	        
	        
	        max[0]=arr[0];
	        for(int a=1;a<n;a++)
	        {
	            max[a] = Math.max(arr[a],max[a-1]);
	        }
	        
	        for(int a=0;a<n;a++)
	        {
	            max[a] = max[a]-gg[a];
	        }
	        
	        int ans=0;
	         for(int a=0;a<n;a++)
	        {
	            if(max[a]==0)
	            {ans++;}
	        }
	        for(int i :max)
	        {System.out.print(i+" ");}
	       
	        
	        
	}

}
