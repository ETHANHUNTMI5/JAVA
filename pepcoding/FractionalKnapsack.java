package pepcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FractionalKnapsack {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] pri = new int[n];
		int [] wt = new int[n];
		for(int a=0;a<n;a++)
		{
			pri[a]= scn.nextInt();
		}
		for(int a=0;a<n;a++)
		{
			wt[a]= scn.nextInt();
		}
		
		int cap = scn.nextInt();

		int [][] arr = new int[n][2];
		
		for(int a=0;a<n;a++)
		{
			arr[a][0]=pri[a];
			arr[a][1]=wt[a];
			
		}
		
		Arrays.sort(arr,new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return (o1[1]*o2[0]-o1[0]*o2[1]) ;
			}
		});
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();}
	
		int a=cap;
		int t=0;
		double ans =0;
		
		while(a>=0)
		{
		
			if(a>=arr[t][1])
			{
				a=a-arr[t][1];
				ans+=arr[t][0];
			}
			
		 
			else
			{
				double d = (double)arr[t][0]/(double)arr[t][1];
				ans+=d*a;
				break;
				
			}
			
		t++;}
		
		System.out.println(ans);
	}
}