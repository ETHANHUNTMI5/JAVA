package sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TrainIntersection {

	
	public static void main(String[] args) {
	
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
	      int n = arr.length;
	      
	
	      int [] ans = new int[2401];
	      
	      for(int a=0;a<n;a++)
	      {
	    	  ans[arr[a]]++;
	    }
	      for(int a=0;a<n;a++)
	      {
	    	  ans[dep[a]+1]--;
	    }
	      
	      int max=-1;
	      int [] pre = new int[2401];
	      for(int a =1;a<2041;a++)
	      {
	    	  pre[a]=pre[a-1]+ans[a];
	    	  if(pre[a]>max)
	    	  {max=pre[a];}
	      }
	      System.out.println(max);
	}

}
