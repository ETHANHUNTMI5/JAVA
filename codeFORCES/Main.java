package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=0;a<t;a++)
		{
			int n = scn.nextInt();
			int [] arr = new int[n];
			
		
			ArrayList<Integer> even = new ArrayList<Integer>();
			ArrayList<Integer> odd =  new ArrayList<Integer>();
			
			for(int b=0;b<n;b++)
			{arr[b]=scn.nextInt();
			if(arr[b]%2==0)
			{even.add(arr[b]);}
			else
			{odd.add(arr[b]);}
			}
			
			int k=0;
			while(k!=odd.size())
           {System.out.print(odd.get(k)+" ");
           k++;}
			
			int o=0;
			while(o!=even.size())
			{System.out.print(even.get(o)+" ");
			o++;}
			
		
		System.out.println();
		}
		}}