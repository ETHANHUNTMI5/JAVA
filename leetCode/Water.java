package leetCode;

import java.util.Scanner;

public class Water {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		
		int[] rse = new int[n];
		int[] lse = new int[n];
		
		
		rse[n-1]=n;
		lse[0]=-1;
		
		java.util.Stack<Integer> ss = new java.util.Stack<>();
		
		ss.push(n-1);
		
		for(int a=n-2;a>=0;a--)
		{
			
			while(ss.size()>0 && arr[a]<arr[ss.peek()])
			{
				ss.pop();
			}
			
			if(ss.size()==0)
			{rse[a]=n;}
			else
			{
				rse[a]=ss.peek();
			}
			
		ss.push(a);	
		}
		
		
java.util.Stack<Integer> ss2 = new java.util.Stack<>();
		
		ss2.push(0);
		
		for(int a=0;a<=n-1;a++)
		{
			
			while(ss2.size()>0 && arr[a]<arr[ss2.peek()])
			{
				ss2.pop();
			}
			
			if(ss2.size()==0)
			{lse[a]=n;}
			else
			{
				lse[a]=ss2.peek();
			}
			
		ss2.push(a);	
		}
		
		int Max=0;
		
		for(int a=0;a<n;a++)
		{
			int area = arr[a]*(rse[a]-lse[a]-1);
			if(area>Max)
			{Max = area;}
		}

		System.out.println(Max);
	
}
	}