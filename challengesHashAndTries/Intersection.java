package challengesHashAndTries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hashMap.HashMap;

public class Intersection {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int [] arr1= new int[n];
	    int [] arr2= new int[n];
	 
	    for(int a=0;a<n;a++)
	    {arr1[a]=scn.nextInt();}
	    
	    for(int b=0;b<n;b++)
	    {arr2[b]=scn.nextInt();}
	    
	    ArrayList<Integer> list = Inter(arr1, arr2);
	   Collections.sort(list);
	    System.out.println(list);
	}

	public static ArrayList<Integer> Inter(int [] one, int[] two)
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
		
		for(int a=0;a<one.length;a++)
		{
			if(map.containsKey(one[a]))
			{
				map.put(one[a],map.get(one[a])+1);
			}
			
			else
			{map.put(one[a],1);}
		}
		
		for(int b=0;b<two.length;b++)
		{
			
			if(map.containsKey(two[b]))
			{
				if(map.get(two[b])>0)
				{
					list.add(two[b]);
				}
				
				map.put(two[b],map.get(two[b])-1);
					
			}
			
			
			
		}
		
		return list;
	}
}
