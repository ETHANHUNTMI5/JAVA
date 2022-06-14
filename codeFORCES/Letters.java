package codeFORCES;

import java.util.Scanner;

public class Letters {

	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  int n = scn.nextInt();
	  
	  long [] arr = new long[n];
	  
	  for(int a=0;a<n;a++)
	  {
		  arr[a]= scn.nextLong();
	  }
		
	  System.out.print(arr[1]-arr[0]+" ");
	  System.out.println(arr[n-1]-arr[0]);
	  for(int a=1;a<n-1;a++)
	  {
		  long min=0;
		  min = Math.min(arr[a]-arr[a-1], arr[a+1]-arr[a]);
		  System.out.print(min+" ");
		  
		  long max=0;
		  max= Math.max(arr[a]-arr[0], arr[n-1]-arr[a]);
		  System.out.println(max);
	  }
	  
	  System.out.print(arr[n-1]-arr[n-2]+" ");
	  System.out.println(arr[n-1]-arr[0]);
	}

}
