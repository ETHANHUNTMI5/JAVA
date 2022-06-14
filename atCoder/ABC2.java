package atCoder;

import java.util.Scanner;

public class ABC2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int [] arr1= new int[n];
		int [] arr2 = new int[n];
		
		int max=0;
		for(int a=0;a<n;a++)
		{arr1[a]= scn.nextInt();
		if(arr1[a]>max)
			{max= arr1[a];}
		}

	int min=Integer.MAX_VALUE;
		
		for(int a=0;a<n;a++)
		{arr2[a]= scn.nextInt();
		if(min>arr2[a])
			{
			min=arr2[a];
			}}
		
		
	  if(max>min)
      {System.out.println("0");}
      else
      {System.out.println(min-max+1);}
		
		
		
	}

}
