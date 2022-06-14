package pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class PrateekCandySOE {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		
	ArrayList<Integer> ans = new ArrayList<>();
		boolean [] arr = new boolean[10001];
		arr[0]=arr[1]=true;
		for(int table=2;table*table<=10000;table++)
		{
			
			for(int multi=2;table*multi<=10000;multi++)
			{
				if(arr[table*multi]==false)
				{arr[table*multi]=true;
				}
			}
			
		}
		
	

	 for(int b=0;b<arr.length-1;b++)
	  {if(arr[b]==false)
		  {ans.add(b);}
	  
		   }
	 int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			
			int n = scn.nextInt();
		ansyo(n, ans);
		 }
		
	 
	 
} 
	
	public static void ansyo(int n,ArrayList<Integer> ans)
	{
		
		System.out.println(ans.get(n-1));
	}
	}
