package sheet;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimiseMaxDiff {

	public static void main(String[] args) {
		
		int [] arr = {1,5,8,9,11};
		int k = 3;
		int n = arr.length;
		 Arrays.sort(arr);
		 for(int i : arr)
		 {
			 System.out.print(i+" ");
		 }
			 System.out.println();
	     
	     int ans = arr[n-1]-arr[0];
	     int min = arr[0]+k;
	     int max = arr[n-1]-k;
	     System.out.println(min+" "+max+" --"+ans);
	     
	     int fmax=0;
	     int fmin =0;
	     for(int a=0;a<n-1;a++)
	     {
	         fmin = Math.min(min,arr[a+1]-k);
	         fmax = Math.max(max,arr[a]+k);
	         
	        if(fmin<0)continue;
	        
	             ans = Math.min(ans,fmax-fmin);
	       System.out.println(a+". "+fmin+" "+fmax+" -->"+ans);  
	     }
	     System.out.println(ans);
	
	}
	
}