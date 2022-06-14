package challenges_Array;

import java.util.Scanner;

public class PMO {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println(SOE(n1, n2));
		}
		
	}
  public static int SOE(int n1,int n2)
  {
	  int c=0;
	 boolean [] arr = new boolean [n2+1];
	  
	  arr[0]=arr[1]=true;
	  
	  for(int table =2;table*table<=n2;table++)
	  {
		  if(arr[table]==true)
		  {continue;}
		  
		  for(int a=2;table*a<=n2;a++)
		  {
			  arr[table*a]=true;
			  
		  }
		  
	  }
	  
	  for(int b=0;b<arr.length-1;b++)
	  {if(arr[b]==false && b>=n1)
		  {c++;}
		   }
	  return c;
		 }

}

