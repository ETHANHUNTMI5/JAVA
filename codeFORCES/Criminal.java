package codeFORCES;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Criminal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int h = scn.nextInt();
		
		int [] arr = new int[n];
		ArrayList<Integer > one = new ArrayList<Integer>();
		int ones=0;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		  if(arr[a]==1)
		  {ones=ones+1;
		  one.add(a+1);}
			  
		}
	

	
		for(int a=0;a<one.size();a++)
		{
			int x=one.remove(0);
			one.add(Math.abs(h-x));
		}
		
		
		Collections.sort(one);
		
		int count=0;
		int get = -1;
		
		for(int a=0;a<one.size();a++)
		{
			if(h-one.get(a)<=0 || h+one.get(a)>n)
			{count++;}
			
			if(one.get(a)==0)
			{count++;}
			
			if(one.get(a)==get)
			{count= count+2;}
			
			else
			{get= one.get(a);}
		}
		
	System.out.println(count);
		
	}

}
